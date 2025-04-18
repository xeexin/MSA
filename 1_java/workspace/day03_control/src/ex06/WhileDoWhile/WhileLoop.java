package ex06.WhileDoWhile;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {

		int su;
		char grade = ' ', yn = ' ';
		Scanner sc = new Scanner(System.in);

		while (true) {

			do {
				System.out.print("점수 입력 : ");
				su = sc.nextInt();
			} while (su < 0 || su > 100);

			System.out.println("\n당신의 점수 : " + su);

			// 탈출 구문
			System.out.print("계속 입력 하시겠습니까? [y/n] : ");
			yn = sc.next().charAt(0);

			if (yn == 'n' || yn == 'N')
				break;

		} // end while

	}
}
