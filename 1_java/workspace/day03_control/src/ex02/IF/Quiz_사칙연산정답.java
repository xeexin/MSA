package ex02.IF;

import java.util.Scanner;

public class Quiz_사칙연산정답 {
	public static void main(String[] args) {
		// 숫자 두개 ,연산자(+ - * /) 받고
		// 3 + 5 = 8 이런 식으로 만들기

		Scanner sc = new Scanner(System.in);

		int a, b, ret = 0;
		char str;

		System.out.print("연산자를 입력하세요 : ");
		str = sc.next().charAt(0);

		System.out.print("정수 2개를 입력하세요: ");
		a = sc.nextInt();
		b = sc.nextInt();

		try {
			if (str == '+') {
				ret = a + b;
			} else if (str == '-') {
				ret = a - b;
			} else if (str == '*') {
				ret = a * b;
			} else if (str == '/') {
				ret = a / b;
			} else {
				System.out.println("ERROR");
			}

			System.out.println(a + " " + str + " " + b + " = " + ret);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
