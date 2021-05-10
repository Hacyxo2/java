package myjava;

public class Company {
	public static void main(String args[]) {
		Employee kim = new Employee("±è°³¶Ë", "990303-1234567",
				"0307111");
		kim.setTitle("´ë¸®");
		kim.work();
		
		Manager hong = new Manager("È«¸»ÀÚ","980202-22456789",
				"99030321","°³¹ßºÎ");
		hong.setTitle("°úÀå");
		hong.work();
	}
}