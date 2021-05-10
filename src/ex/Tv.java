package ex;
import java.util.Scanner;
public class Tv {
	String ch, vol;
	int power;
	
	public void control() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("전원 ");
		power = sc.nextInt();
		if (power == 0) {
			System.out.println("TV전원이 꺼져있습니다.\n");
		}
		else {
			while(power != 0) {
				System.out.printf("채널 ");
				ch = sc.next();
				System.out.printf("볼륨 ");
				vol = sc.next();
				System.out.printf("채널 : %s 볼륨 : %s",ch, vol);		
				System.out.printf("전원 ");
				power = sc.nextInt();
					System.out.println("TV전원을 끕니다.\n");
			}
		}
	}
	public static void main(String[] args) {
		Tv a = new Tv();
		a.control();
	}
}
