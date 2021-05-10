package myjava;

public class Sum10For {
	public static void main(String[] Args) {
		int k = 0;
		int s[][] = { {2,4,6,8},
					  {3,7,7,6},
					  {0,2,1,2} };
		while (k <s.length) {
			for(int i=0;i<s[0].length; i++) {
				System.out.printf("s[%d][%d] = %d\n",
								   k, i, s[k][i]);
			}
			
			k = k + 1;
		}
	}
}
