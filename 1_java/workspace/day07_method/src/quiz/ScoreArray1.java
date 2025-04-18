package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreArray1 {
	public static void main(String[] args) {
		// + 등수 (석차)까지 구하기

		int INWON = 3;
		Scanner sc = new Scanner(System.in);

		int[] num = new int[INWON];
		int[] kor = new int[INWON];
		int[] eng = new int[INWON];
		int[] com = new int[INWON];
		int[] total = new int[INWON];
		double[] avg = new double[INWON];
		String[] name = new String[INWON];
		char[] grade = new char[INWON];
		int[] rank = new int[INWON];

		double avgall = 0.0;
		int totalall = 0;

		// input
		for (int i = 0; i < INWON; i++) {
			System.out.println("========================");

			System.out.print(" 번 호 입 력 : ");
			num[i] = sc.nextInt();
			System.out.print(" 이 름 입 력 : ");
			name[i] = sc.next();
			System.out.print(" 국 어 점 수 입 력 : ");
			kor[i] = sc.nextInt();
			System.out.print(" 영 어 점 수 입 력 : ");
			eng[i] = sc.nextInt();
			System.out.print(" 전 산 점 수 입 력 : ");
			com[i] = sc.nextInt();

			// 총점/평균/학급총,평균 처리
			total[i] = kor[i] + eng[i] + com[i]; // 개별 총점
			rank[i] = total[i];
			avg[i] = total[i] / 3.0; // 개별평균
			totalall += total[i]; // 전체 총점

			// 평점 구하기
			switch ((int) (avg[i] / 10)) {
			case 10:
			case 9:
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			case 6:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
			} // end switch
		} // end for

		avgall = (double) totalall / INWON; // 전체평균
		Arrays.sort(rank); // 성적 오름차순 정렬

		System.out.println("========================");

		// output
		for (int i = 0; i < INWON; i++) {
			System.out.println("========================");
			System.out.printf(
					"번 호 : %d\n이 름 : %s님의 성적표****\n" + "국어 : %d\t영어 : %d\t전산 : %d\n"
							+ "총 점 : %d\t평 균 : %.2f\t학 점 : %c\t석 차 : ",
					num[i], name[i], kor[i], eng[i], com[i], total[i], avg[i], grade[i]);

			for (int x = 0; x < INWON; x++) {
				if (total[i] == rank[x]) {
					System.out.print(-(x - INWON) + "\n");

				}
			}

			System.out.println("========================");
		} // end for

		System.out.println("========================");
		System.out.printf(" 학 급 총 점 : %d\n 학 급 평 점 : %.2f \n", totalall, avgall);
		System.out.println("========================");

		sc.close(); // Scanner 닫기
		
		
	}
}
