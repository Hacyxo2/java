package myjava;
import java.awt.Graphics;
public class GRect extends Shape {
	int w, h;
	public GRect(int x, int y, int w, int h) {
		super(x,y);
		this.w = w;
		this.h = h;
	}
	
	public void paint(Graphics g) {
		g.drawRect(x, y, w, h);
	}
}
