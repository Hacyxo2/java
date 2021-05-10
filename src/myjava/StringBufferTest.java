package myjava;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ");
		buf.append("World!!");
		
		System.out.println(buf.toString());
	}
}
