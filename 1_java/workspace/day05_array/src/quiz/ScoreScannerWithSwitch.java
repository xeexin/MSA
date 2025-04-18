package quiz;

import java.util.Scanner;

public class ScoreScannerWithSwitch {
	public static void main(String[] args) {
		// kor, eng, com, name -> 총점tot, 평균avg 구하는 프로그램 작성
		// 평균 60점 이상, 과목 당 40점 이상 이어야 합격입니다.
		// 이름 입력 받고, 국어, 영어, 전산 점수 입력 받아서
		// 총점, 평균, 학점까지 구하는 프로그램 작성
		// 점수(0~100) 사이 값
		// 무한 루프 이용해서 원하는 만큼 입력 받기

		// 성적처리 프로그램 배열을 이용하여 7명의 성적을 입력 받아, 총점, 평균, 평점까지 구하는 프로그램 작성

		Scanner sc = new Scanner(System.in);

		String[] name = new String[7];
		int[][] arr = new int[7][5];
		char[] ret = new char[7];

		for (int y = 0; y < 7; y++) {
			System.out.print("[" + (y + 1) + "] 이름을 입력하세요 : ");
			name[y] = sc.next();
			System.out.print("국어, 영어, 전산 점수를 차례대로 입력하세요 : ");
			for (int x = 0; x < 3; x++) {
				arr[y][x] = sc.nextInt();
			}
			// 1. 총점
			int sum = 0;
			for (int x = 0; x < 3; x++)
				sum += arr[y][x];

			arr[y][3] = sum;

			// 2. 평균
			arr[y][4] = sum / 3;

			// 3. 학점
			switch ( arr[y][4] / 10) { // (tot/30)
			case 10:
			case 9: {
				ret[y] = 'A';
				break;
			}
			case 8: {
				ret[y] = 'B';
				break;
			}
			case 7: {
				ret[y] = 'C';
				break;
			}
			case 6: {
				ret[y] = 'D';
				break;
			}

			default:
				ret[y] = 'F';
				break;

			}
			System.out.println(name[y] + "님의 성적표*************");
			System.out.println("국어 : " + arr[y][0] + "점\t영어 : " + arr[y][1] + "점\t전산: " + arr[y][2] + "점");
			System.out.println("총점 : " + arr[y][3] + "점\t평균 : " + arr[y][4] + "점\t" + ret[y] + "학점");
			System.out.println("*********************************");

		}
		
		

	}
}