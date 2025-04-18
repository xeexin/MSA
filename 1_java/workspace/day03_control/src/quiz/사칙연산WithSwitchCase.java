package quiz;

import java.util.Scanner;

public class 사칙연산WithSwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();

		System.out.print("숫자를 입력하세요 : ");
		int b = sc.nextInt();

		System.out.print("기호를 입력하세요[+ - * /] : ");
		char op = sc.next().charAt(0);

		int ret = 0;

		switch (op) {
		case '+': {
			ret = a + b;
			break;
		}
		case '-': {
			ret = a - b;
			break;
		}
		case '*': {
			ret = a * b;
			break;
		}
		case '/': {
			ret = a / b;
			break;
		}
			default: System.out.println("** 올바른 기호를 입력하세요 **");
		}
		System.out.println(a + " " + op + " " + b + " = " + ret);
		

	}

}
