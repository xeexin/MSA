package ex02.method;

import java.util.Scanner;

public class MethodEx1 {
	// 3. 매개변수 없고, 리턴 타입 있는 경우

	public static int show() {
		return 100;
	}


	public static void main(String[] args) {
		System.out.println(show());

		int su = show();
		System.out.println(su);

		System.out.println("----------------------------");
//		System.out.println(max());
		int max = max();
		System.out.println(max);

	}

	// max() 만들어서 큰 값을 리턴하는 함수 만들기
	public static int max() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해 주세요 : ");
		int a = sc.nextInt();
		System.out.print("숫자를 입력해 주세요 : ");
		int b = sc.nextInt();

		//방법1
//		if (a > b)
//			return a;
//		else
//			return b;

		//방법 2
		int max = (a > b) ? a : b;
		return max;

	}
}
