package quiz;

import java.util.Scanner;

public class Quiz_사칙연산함수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num1, num2;
			System.out.print("숫자1을 입력하세요 : ");
			num1 = sc.nextInt();
			do {
				System.out.print("숫자2를 입력하세요 : ");
				num2 = sc.nextInt();
			} while (num2 == 0);

			System.out.print("기호를 선택하세요 : '+' '-' '*' '/'  [종료를 원하시면 '0'을 눌러주세요.]");
			String ch = sc.next();
			switch (ch.charAt(0)) {
			case '+': {
				plus(num1, num2); break;
			}
			case '-': {
				minus(num1, num2);break;
			}
			case '*': {
				multi(num1, num2);break;
			}
			case '/': {
				div(num1, num2);break;
			}
			case '0': {
				System.out.println("연산을 종료합니다.");
				System.exit(0);
				break;
				
			}
			default:
				System.out.println("올바른 기호를 입력해주세요.");break;
			}
		}
	}

	public static void plus(int a, int b) {
		System.out.printf("a + b = %d\n", (a + b));

	}
	public static void minus(int a, int b) {
		System.out.printf("a - b = %d\n", (a - b));

	}
	public static void multi(int a, int b) {
		System.out.printf("a * b = %d\n", (a * b));

	}
	public static void div(int a, int b) {
		System.out.printf("a / b = %.2f\n", (double)(a / b));

	}

}
