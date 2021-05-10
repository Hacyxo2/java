 package myjava;
import java.awt.Graphics;
public class GOval extends Shape {
	int w, h;
	public GOval(int x, int y, int w, int h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}
	
	public void paint(Graphics g) {
		g.drawOval(x, y, w, h);
	}
}
