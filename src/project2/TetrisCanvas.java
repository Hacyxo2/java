package project2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TetrisCanvas extends JPanel implements Runnable, KeyListener {
	protected Thread worker;
	protected Color colors[];
	protected int w = 25;
	protected TetrisData data;
	protected int margin = 20;
	protected boolean stop, makeNew;
	protected Piece current;
	protected int interval = 2000;
	protected int level = 2;

	public TetrisCanvas() {
		data = new TetrisData();

		addKeyListener(this);
		colors = new Color[8];
		colors[0] = new Color(80, 80, 80); // 회색
		colors[1] = new Color(0, 200, 255); //노란색
		colors[2] = new Color(0, 255, 0); // 녹색
		colors[3] = new Color(255, 0, 0); // 빨간색
		colors[4] = new Color(255, 255, 0); // 하늘색
		colors[5] = new Color(255, 150, 0); // 황토색
		colors[6] = new Color(210, 0, 240); // 보라색
		colors[7] = new Color(40, 0, 240); // 파란색
	}

	public void start() {
		data.clear();
		worker = new Thread(this);
		worker.start();
		makeNew = true;
		stop = false;
		requestFocus();
		repaint();
	}

	public void stop() {
		stop = true;
		current = null;
	}

	public void paint(Graphics g) {
		super.paint(g);

		for (int i = 0; i < TetrisData.ROW; i++) {
			for (int k = 0; k < TetrisData.COL; k++) {
				if (data.getAt(i, k) == 0) {
					g.setColor(colors[data.getAt(i, k)]);
					g.draw3DRect(margin / 2 + w * k, margin / 2 + w * i, w, w, true);
				} else {
					g.setColor(colors[data.getAt(i, k)]);
					g.fill3DRect(margin / 2 + w * k, margin / 2 + w * i, w, w, true);
				}
			}
		}

		if (current != null) {
			for (int i = 0; i < 4; i++) {
				g.setColor(colors[current.getType()]);
				g.fill3DRect(margin / 2 + w * (current.getX() + current.c[i]),
						margin / 2 + w * (current.getY() + current.r[i]), w, w, true);
			}
		}
	}

	public Dimension getPreferredSize() {
		int tw = w * TetrisData.COL + margin;
		int th = w * TetrisData.ROW + margin;
		return new Dimension(tw, th);
	}
	//https://wotres.tistory.com/entry/Java-int-%EB%A5%BC-String-%EC%9C%BC%EB%A1%9C-%EB%B3%80%ED%99%98%ED%95%98%EB%8A%94-%EB%B2%95#:~:text=%EC%9E%90%EB%B0%94%EC%97%90%EC%84%9C%20int%20%ED%98%95%ED%83%9C%EC%9D%98%20%EC%9E%90%EB%A3%8C%ED%98%95%EC%9D%84%20String%20%ED%98%95%ED%83%9C%EB%A1%9C%20%EB%B3%80%ED%99%98%ED%95%98%EA%B3%A0%20%EC%8B%B6%EC%9D%84,%EC%A7%91%EC%96%B4%EB%84%A3%EB%8A%94%EB%8B%A4.%20ex%29%20int%2030%20%EC%9D%84%20String%20%EC%9C%BC%EB%A1%9C%20%EB%B3%80%ED%99%98
	public void run() {
		while (!stop) {
			try {
				if (makeNew) {
					int random = (int) (Math.random() * Integer.MAX_VALUE) % 7;

					switch (random) {
						case 0:
							current = new Bar(data);
							break;
						case 1:
							current = new Tee(data);
							break;
						case 2:
							current = new El(data);
							break;
						/* 추가 테트로미노 */
						case 3:
							current = new Jay(data);
							break; 
						case 4: 
							current = new O(data);
							break; 
						case 5: current = new Ess(data); 
							break; 
						case 6: current = new Zed(data); 
							break;
							
						default:
							if (random % 2 == 0)
								current = new Tee(data);
							else
								current = new El(data);
					}	
					makeNew = false;
				} else {
					if (current.moveDown()) {
						makeNew = true;
						if (current.copy()) {
							stop();
							int score = data.getLine() * 175 * level;
							JOptionPane.showMessageDialog(this, "게임끝\n점수 : " + score);
						}
						current = null;
					}
					data.removeLines();
				}
				repaint();
				Thread.currentThread();
				Thread.sleep(interval / level);
			} catch (Exception e) { }
		}
	}

	public void keyPressed(KeyEvent e) {
		if (current == null) return;
		switch (e.getKeyCode()) {
		case 37:
			current.moveLeft();
			repaint();
			break;
		case 39:
			current.moveRight();
			repaint();
			break;
		case 38:
			current.rotate();
			repaint();
			break;
		case 40: //아래
			boolean temp = current.moveDown();
			if (temp) {
				makeNew = true;
				if (current.copy()) {
					stop();
					int score = data.getLine() * 175 * level;
					JOptionPane.showMessageDialog(this, "게임끝\n점수 : " + score);
				}
			}
			data.removeLines();
			repaint();
		}
	}
	public void keyTyped(KeyEvent e) {}

	public void keyReleased(KeyEvent e) {}
}
