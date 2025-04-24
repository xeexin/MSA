package quiz2;

import java.util.Scanner;

public class ScoreMain {
	ScoreManager scoreManager;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("\n번호를 입력하세요 (1번:추가, 2번:삭제, 3번:출력, 4번:수정 0번:종료) : ");
			int num = sc.nextInt();

			switch (num) {
			case 1: {
				ScoreManager.add();
				System.out.println("추가되었습니다.");
				break;

			}
			case 2: {
				ScoreManager.delete();
				System.out.println("삭제되었습니다.");
				break;

			}
			case 3: {
				ScoreManager.show();
				break;

			}
			case 4: {
				ScoreManager.set();
				System.out.println("수정되었습니다.");
				break;

			}
			case 0: {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

			default:
				System.out.println("올바른 번호를 입력하세요.");
				break;
			}

		}
	}
}
