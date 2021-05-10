package myjava;

public class Rect {
	int w, h;
	public Rect() {
		w = 4;
		h = 5;
	}
	
	public Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public int getArea() {
		return w *h;
	}
	public int getCircum() {
		return 2 * (w + h);
	}
	public static void main(String[] args) {
		
		Rect myRect = new Rect(20, 8);
		System.out.println(myRect.getArea());
		System.out.println(myRect.getCircum());
		System.out.println("----");
		Rect myRect1 = new Rect();
		System.out.println(myRect1.getArea());
		System.out.println(myRect1.getCircum());
	}
}
