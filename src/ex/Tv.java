package ex;
import java.util.Scanner;
public class Tv {
	String ch, vol;
	int power;
	
	public void control() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� ");
		power = sc.nextInt();
		if (power == 0) {
			System.out.println("TV������ �����ֽ��ϴ�.\n");
		}
		else {
			while(power != 0) {
				System.out.printf("ä�� ");
				ch = sc.next();
				System.out.printf("���� ");
				vol = sc.next();
				System.out.printf("ä�� : %s ���� : %s",ch, vol);		
				System.out.printf("���� ");
				power = sc.nextInt();
					System.out.println("TV������ ���ϴ�.\n");
			}
		}
	}
	public static void main(String[] args) {
		Tv a = new Tv();
		a.control();
	}
}
