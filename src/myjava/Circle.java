package myjava;

public class Circle {
	int r;
	public Circle() {
		this(7);
	}
	public Circle(int r) {
		this.r = r;
	}
	public double getArea() {
		return 3.14 * r * r;
	}
	public double getCircum() {
		return 2 * 3.14 * r;
	}
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		System.out.println(myCircle.getArea());
		System.out.println(myCircle.getCircum());
		
		System.out.println("------");
		
		Circle myCircle1 = new Circle(6);
		System.out.println(myCircle1.getArea());
		System.out.println(myCircle1.getCircum());
	}
}
