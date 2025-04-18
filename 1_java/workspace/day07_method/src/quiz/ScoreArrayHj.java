package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreArrayHj {
	public static void main(String[] args) {
		// [변수 선언]
		int INWON = 3;
		Scanner sc = new Scanner(System.in);

		String[] name = new String[INWON];
		// 학생번호, 국어, 영어, 전산, 합
		int[][] info = new int[INWON][5];
		int[] rank = new int[INWON];
		double[] avg = new double[INWON];
		char[] grade = new char[INWON];

		int totalsum = 0;
		double avgall = 0.0;

		// [입력]
		for (int y = 0; y < INWON; y++) {
			System.out.println("-------------------------------------");
			System.out.print("이름 입력 : ");
			name[y] = sc.next();
			for (int x = 0; x < 4; x++) {

				switch (x) {
				case 0: {
					System.out.print("학번입력 : ");
					info[y][x] = sc.nextInt();
					break;
				}
				case 1: {
					System.out.print("국어 점수 입력 : ");
					info[y][x] = sc.nextInt();
					break;
				}
				case 2: {
					System.out.print("영어 점수 입력 : ");
					info[y][x] = sc.nextInt();
					break;
				}
				case 3: {
					System.out.print("전산 점수 입력 : ");
					info[y][x] = sc.nextInt();
					break;
				}
				} // case end
			} // x1 end

			// 개별총점 구하기
			for (int x = 1; x < 4; x++) {
				info[y][4] += info[y][x];
			} // x2 end

			// 총 총점 더하기
			totalsum += info[y][4];

			// 정렬 전 랭크에 넣어두기
			rank[y] = info[y][4];

			// 평균 구하기
			avg[y] = info[y][4] / 3;

			// 평점 구하기
			switch ((int) avg[y] / 10) {
			case 10:
			case 9:
				grade[y] = 'A';
				break;
			case 8:
				grade[y] = 'B';
				break;
			case 7:
				grade[y] = 'C';
				break;
			case 6:
				grade[y] = 'D';
				break;
			default:
				grade[y] = 'F';
			}

		} // y end

		avgall = (double) totalsum / (INWON * 3); // 전체 평균
		Arrays.sort(rank); // 성적 오름차순

		System.out.println("\n");

		// 출력
		for (int y = 0; y < INWON; y++) {
			System.out.println(name[y] + "님의 성적표 *****");
			for (int x = 1; x < 5; x++) {
				switch (x) {
				case 1: {
					System.out.printf("국어 : %d\t", info[y][x]);
					break;
				}
				case 2: {
					System.out.printf("영어 : %d\t", info[y][x]);
					break;
				}
				case 3: {
					System.out.printf("전산 : %d\n", info[y][x]);
					break;
				}
				case 4: {
					System.out.printf("총점 : %d\t", info[y][x]);
					break;
				}

				}
			}
			// 평균
			System.out.printf("평균 : %.2f\t", avg[y]);

			// 평점
			System.out.printf("평균 : %c\t", grade[y]);

			// 석차(등수)
			for (int x = 0; x < INWON; x++) {
				if (info[y][4] == rank[x]) {
					System.out.print("석차 : " + -(x - INWON) + "\n");
				}
			}
			System.out.println("\n");
		}

		System.out.println("========================");
		System.out.printf(" 학 급 총 점 : %d\n 학 급 평 점 : %.2f \n", totalsum, avgall);
		System.out.println("========================");

		sc.close(); // Scanner 닫기
	}

}
