package ex;
import java.util.*;
public class ��� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		while(true) {
			int n = sc.nextInt();
			if(n == -1) {
				break;
			}
			else {
				sum += n;
				i++;
			}
		}
		if (i != 0) {
			System.out.printf("�Էµ� ������ ��� = %d", sum / i);
		}
		else {
			System.out.printf("�Էµ� ���� �����ϴ�.");
		}
	}
}
