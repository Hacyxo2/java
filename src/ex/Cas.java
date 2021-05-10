package ex;
import java.util.*;
public class Cas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count= 0;
		int sum = 0;
		while(true) {
			System.out.printf("점수를 입력하세요(종료 : -1) : ");
			int n = sc.nextInt();
			if (n == -1)
				break;
			else {
				sum = sum + n;
				count++;
			}
		}
		System.out.println("평균: " + sum/count);
	}
}
