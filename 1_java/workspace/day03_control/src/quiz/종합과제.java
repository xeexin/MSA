package quiz;

import java.util.Scanner;

public class 종합과제 {

	public static void main(String[] args) {

		// 과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
		int sum1 = 0;
		int ret1 = 0;
		for (int x = 1; x < 6; x++) {
			sum1 += x;
			ret1 += sum1;
		}
		System.out.println(ret1);

		// 과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ? 5
		int sum2 = 0;
		int ret2 = 0;
		for (int x = 1; x < 11; x++) {
			if (x % 2 == 1) {
				sum2 -= x;

			} else {
				sum2 += x;

			}
		}
		System.out.println(sum2);

		// 과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ? 7.07
		double sum3 = 0;
		for (int y = 1; y < 10; y++) {
			sum3+=(double)y/(y+1);
		}
		System.out.printf("%.2f", sum3);

	}
}
