package myjava;

public class Student {
	String name, age, grade;
	public Student() {
		name = "������";
		age = "23";
		
	}
	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}
	public void study() {
		System.out.println(age+"�� "+grade+" "+name+"��(��) �����Ѵ�.");
	}
	public static void main(String[] args) {
		Student Na = new Student("������", "23");
		Na.grade = "2�г�";
		Na.study();
		Student Ryu = new Student();
		Ryu.grade = "2�г�";
		Ryu.study();
	}
}
