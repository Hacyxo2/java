package myjava;
public class java2 {
	public static void main(String[] Args) {
		int[] grade = {80, 76, 94, 30, 57};
		int i = 0;
		double sum = 0;
		while(i<5)
		{
			sum += grade[i];
			i++;
		}
		System.out.print("평균은 :" + sum/5);
	}
}

















//import java.util.*;
/*Scanner sc = new Scanner(System.in); // 자바의 기본단위는 클래스

System.out.print("면적은: ");
int A = sc.nextInt();

double P = A * 0.3025;

System.out.println("평방미터는 :"+ P+"평");
*/
/*System.out.println("문제 1 넔이");
Scanner sc = new Scanner(System.in);

 System.out.println("문제 3 화씨");
	System.out.print("섭씨는: ");
	
	int C = sc.nextInt();
	double F = (C * 9/5) + 32;
	System.out.println("화씨는: "+F);

/*System.out.print("가로:");
int l = sc.nextInt();

System.out.print("세로:");
int w = sc.nextInt();
int a;
a = l * w;
System.out.println("넓이는: "+ a);

System.out.println("**********");
*/
/*System.out.println("문제 2 원");

System.out.print("반지름은: ");

int r = sc.nextInt();
double pi = 3.14;
double A = r*r*pi;

System.out.print("면적은: "+A);
System.out.println("**********");*/
/*public static void main(String[] Args) {
	Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++)
		{
			System.out.print("상품의 가격을 적어주세요 :");
			int C = sc.nextInt();
			System.out.println("15% 할인된 가격은 "+C*0.85+"원 입니다.");
		}
	}*/