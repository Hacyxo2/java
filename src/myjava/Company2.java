package myjava;

public class Company2 {
	public static void main(String args[]) {
		Employee kim, hong;
		
		kim = new Employee("�谳��", "990303-1234567",
				"0307111");
		kim.setTitle("�븮");
		kim.work();
		
		hong = new Manager2("ȫ����","980202-22456789",
				"99030321","���ߺ�");
		hong.setTitle("����");
		hong.work();
	}
}