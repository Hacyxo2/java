package myjava;

import java.util.*;

public class IntegerVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(10);
		v.addElement(20);
		//v.add("Hello");
		int sum = 0;
		for (Integer s :v ) {
			sum = sum + s;
		}
		System.out.printf("합계 = %d, 평균 = %.2f\n", sum,
				sum/(double)v.size());
	}

}
// 실행 전에 오류 