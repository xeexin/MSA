package ex04.array;

import java.util.Scanner;

public class QuizEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5]; // 객체가 생성됨(heap에 저장)(메모리에 할당)

		// 임의적인 데이터 입력 받아서, 출력하기

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");

		for (int x = 0; x < arr.length; x++) {
			arr[x] = sc.nextInt();
			System.out.print(arr[x] + " ");
		}

	}

}
