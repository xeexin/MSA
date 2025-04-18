package quiz;

import java.util.Random;
import java.util.Scanner;

public class MainEntry01 {
	// 업 다운
	// 1~100 숫자 중에서 임의의 난수 추출해 놓고 사용자는 5번의 기회를 줘서 입력 받는다.
	// 그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target = new Random().nextInt(101);

		int cnt = 0;

		while (true) {
			System.out.print("숫자를 입력하세요 (1~100) : ");
			int num = sc.nextInt();

			if (num < target) {
				System.out.println("더 큰 숫자!");
			}

			if (num > target) {
				System.out.println("더 작은 숫자!");
			}

			if (num == target) {
				System.out.println("정답!");
				break;
			}
			cnt++;
			
			if(cnt == 5) {
				System.out.println("\n다음 기회에...\t정답 : " + target);
				break;
			}

		}

	}

}
