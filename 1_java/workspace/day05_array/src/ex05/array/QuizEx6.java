package ex05.array;

import java.util.Scanner;

public class QuizEx6 {
	public static void main(String[] args) {
		int[][] a = new int[2][3]; // 객체 생성!! 메모리에 할당, 생성자 함수 자동 호출

		System.out.println(a.length); // y
		System.out.println(a[0].length); // x

		Scanner sc = new Scanner(System.in);

		// 입력
		for (int y = 0; y < a.length; y++) {
			for (int x = 0; x < a[0].length; x++) {
				System.out.print("INPUT (array a[" + y + "][" + x + "]) : ");
				a[y][x] = sc.nextInt();
			}
		}

		// 출력
		for (int y = 0; y < a.length; y++) {
			for (int x = 0; x < a[0].length; x++) {
				System.out.print(a[y][x] + "\t");
			}
			System.out.println();
		}

	}

}
