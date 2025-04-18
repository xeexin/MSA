package ex05.For;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 구구단 전체 출력하기

		for (int y = 1; y < 10; y++) {
			System.out.println("[" + y + "단]");
			for (int x = 1; x < 10; x++) {
				System.out.println(y + " * " + x + " = " + y * x);
			}
			System.out.println();
		}

	}
}

//package ex05.For;
//
//import java.util.Scanner;
//
//public class Quiz02 {
//	public static void main(String[] args) {
//		// 원하는 단을 입력 받아서 구구단 출력하기
//
//		System.out.print("원하는 구구단을 입력하세요 : ");
//		int dan = new Scanner(System.in).nextInt();
//
//		for (int x = 1; x < 10; x++) {
//			System.out.println(dan + " * " + x + " = " + (dan * x));
//		}
//
//	}
//}
