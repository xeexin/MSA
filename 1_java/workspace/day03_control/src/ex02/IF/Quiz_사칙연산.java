package ex02.IF;

import java.util.Scanner;

public class Quiz_사칙연산 {
	public static void main(String[] args) {
		// 숫자 두개 ,연산자(+ - * /) 받고
		// 3 + 5 = 8 이런 식으로 만들기

		Scanner sc = new Scanner(System.in);

		int a, b;
		String str = null;

		System.out.print("숫자1 입력 : ");
		a = sc.nextInt();

		System.out.print("숫자2 입력 : ");
		b = sc.nextInt();

		System.out.print("연산자(+ - * /) 입력 : ");
		str = sc.next();

		if (str.equals("+")) {
			System.out.println(a + " " + str + " " + b + " = " + (a + b));
		} else if (str.equals("-")) {
			System.out.println(a + " " + str + " " + b + " = " + (a - b));

		} else if (str.equals("*")) {
			System.out.println(a + " " + str + " " + b + " = " + (a * b));

		} else if (str.equals("/")) {
			try {
				System.out.println(a + " " + str + " " + b + " = " + (a / b));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("올바른 연산자를 입력해 주세요.");
		}

	}
}
