package myjava;

public class Company {
	public static void main(String args[]) {
		Employee kim = new Employee("�谳��", "990303-1234567",
				"0307111");
		kim.setTitle("�븮");
		kim.work();
		
		Manager hong = new Manager("ȫ����","980202-22456789",
				"99030321","���ߺ�");
		hong.setTitle("����");
		hong.work();
	}
}