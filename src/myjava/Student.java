package myjava;

public class Student {
	String name, age, grade;
	public Student() {
		name = "나수하";
		age = "23";
		
	}
	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}
	public void study() {
		System.out.println(age+"세 "+grade+" "+name+"은(는) 공부한다.");
	}
	public static void main(String[] args) {
		Student Na = new Student("나수하", "23");
		Na.grade = "2학년";
		Na.study();
		Student Ryu = new Student();
		Ryu.grade = "2학년";
		Ryu.study();
	}
}
