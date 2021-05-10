package ex;
import java.util.Scanner;
public class Tv2 {
	int ch, vol, power;
	public Tv2() {
		ch =0;
		vol=0;
		power=0;
	}
	public Tv2(int power, int vol, int ch) {
		this.ch = ch;
		this.vol = vol;
		this.power = power; 
	}
	public int control(int power) {
		this.power = power;
		return power;
	}
	public int volControl(int vol) {
		this.vol= vol;
		return vol;
	}
	public int chControl(int ch) {
		this.ch = ch;
		return ch;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Tv2 a = new Tv2();
		while(true) {
			int n = sc.nextInt();
			if (a.control(n) == 0) {}
		}
		
	}
}
