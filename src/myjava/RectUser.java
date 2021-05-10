package myjava;

public class RectUser {
	public static void main(String[] args) {
		
		Rect myRect = new Rect(20, 8);
		System.out.println(myRect.getArea());
		System.out.println("----");
		Rect myRect1 = new Rect();
		System.out.println(myRect1.getArea()); 
	}
}


