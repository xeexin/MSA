package homework;

import java.util.Scanner;

public class week1 {
	/*
	 * 3, 4, 5 입력 받고 큰 순서대로 출력 (*숫자가 같을 경우 제외)
	 * 
	 * - 논리 연산 - 교환 알고리즘 - if문 - 삼항 연산자
	 * 
	 * → 네개 중 하나를 사용
	 * 
	 */

	public static void main(String[] args) {

		int a, b, c, max, min, middle;
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		b = sc.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		c = sc.nextInt();

		max = (a > b && a > c) ? a : (b > c) ? b : c;
		min = (a < b && a < c) ? a : (b < c) ? b : c;
		middle = (a != max && a != min) ? a : (b != max && b != min) ? b : c;

		System.out.println(max + "\t" + middle + "\t" + min);

	}
}
