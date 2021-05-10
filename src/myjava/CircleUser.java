package myjava;

public class CircleUser {
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