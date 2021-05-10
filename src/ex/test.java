 package ex;

public class test {
	public static void main(String[] Args) {
		int k;
		int sum = 0;
		int s[][] = { {1,11,12,6,5,0},
					  {10,2,7,4,15,0},
					  {9,8,3,13,14,0} };
		for(k =0;k < s.length; ) {
			for(int i=0;i<s[0].length; i++) {
				sum += s[k][i];
			}
			s[k][s[0].length-1] = sum;
			sum = 0;
			k = k + 1;
		}
		k = 0;
		while (k <s.length) {
			for(int i=0;i<s[0].length; i++) {
				System.out.printf("%2d ", s[k][i]);
			}
			System.out.println();
			k = k + 1;
		}
	}
}
