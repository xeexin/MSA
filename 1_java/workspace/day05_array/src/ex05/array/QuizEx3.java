package ex05.array;

import java.util.Scanner;

public class QuizEx3 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int sum = 0;
		// 2차원 배열에 임의적인 숫자 입력 받아서 합 출력 해 주세요.

		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 6개를 입력해 주세요: ");
		for (int y = 0; y < arr.length; y++) {
			for (int x = 0; x < arr[0].length; x++) {

				arr[y][x] = sc.nextInt();
				sum += arr[y][x];
			}
		}

		// 합 출력

		System.out.println("합 : " + sum);

	}

}
