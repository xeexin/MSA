
package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y =");
		int x, y, ret;

		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			System.exit(0); // 강제 종료 }

			ret = x / y; // 에러발생 할 수 있다. ** 0으로 나누는 거 불가능

			System.out.println(ret);

		}
	}
}