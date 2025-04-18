package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		System.out.println("x, y =");
		int x, y, ret;

		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();

			ret = x / y; // 에러발생 할 수 있다. ** 0으로 나누는 거 불가능
			System.out.println(ret);

		} catch (ArithmeticException e) {
			// System.out.println("0으로 나눌 수 없습니다"); // user message
			// System.out.println(e.getMessage());
			// e.printStackTrace(); //오류 상세히 출력해 주는 메서드

			System.out.println("ArithmeticException ");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException ");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
