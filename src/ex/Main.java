package ex;

public class Main {
	    public static void main(String args[]) {
	    	System.out.print(pow(2,2));
	    }
	    public static int pow(int a, int n) {
	        	if (n == 0) {
	        		return 1;
	        	} 
	        	else {
	        		return a * pow(a, n - 1);
	        	}
	    }
	 
}
