package myjava;

public class Company2 {
	public static void main(String args[]) {
		Employee kim, hong;
		
		kim = new Employee("±è°³¶Ë", "990303-1234567",
				"0307111");
		kim.setTitle("´ë¸®");
		kim.work();
		
		hong = new Manager2("È«¸»ÀÚ","980202-22456789",
				"99030321","°³¹ßºÎ");
		hong.setTitle("°úÀå");
		hong.work();
	}
}