package ex;
import java.util.*;
public class Pow {
	public static int pow(int a, int b){
		if(b == 0)
			return 1;
		else
		{
			return a * pow(a, b-1);
		}
	}
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("a 입력 : ");
		//int a = sc.nextInt();
		//System.out.print("b 입력 : ");
		//int b = sc.nextInt();
		
		System.out.println(pow(3,2));
	}
	
}
