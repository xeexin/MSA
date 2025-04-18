package ex06.WhileDoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int a = 1; // 반드시 변수 초기화

		while (a <= 3) {
			System.out.println(a + "\t");
			a++; // 증감식
		}

		System.out.println("--------------------");

		// do-while
		// 구구단 단 입력하고 구구단 찍기
		System.out.print("input dan : ");
		int dan = new Scanner(System.in).nextInt();
		int x = 1;
		do {
			System.out.println(dan + " * " + x + " = " + dan * x);
			x++;
		} while (x <= 9);

	}
}
