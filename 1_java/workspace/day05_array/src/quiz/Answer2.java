package quiz;

import java.util.Scanner;

public class Answer2 {
	public static void main(String[] args) {
		int SU = 3, NO = 3;
		int[][] arr = new int[SU][NO]; // 인원수, 과목수
		int[][] nUserInfo = new int[SU][NO];
		String[] strName = new String[SU];
		Scanner sc = new Scanner(System.in);

		// input
		for (int y = 0; y < arr.length; y++) {
			System.out.printf("%d번째 학생 이름 입력 : \n", y + 1);
			strName[y] = sc.next();

			for (int x = 0; x < arr[0].length; x++) {
				switch (x) {
				case 0: {
					System.out.print("국어점수 입력 : ");
					break;
				}
				case 1: {

					System.out.print("영어점수 입력 : ");
					break;

				}
				case 2: {

					System.out.print("전산점수 입력 : ");
					break;
				}

				}// end switch

				arr[y][x] = sc.nextInt();
			} // x end
		} // y end

		int nSum = 0, nGrade = 0;
		double fAvg = 0;
		String strmsg = " ";
		char szGrade = ' ';

		for (int i = 0; i < arr.length; i++) {
			nSum = 0;
			fAvg = 0.0f;
			nGrade = 0;
			System.out.printf("[ %s ] 학생 점수 ==================\n ", strName[i]);
			for (int j = 0; j < arr[0].length; j++) {
				strmsg = " ";
				switch (j) {
				case 0:
					strmsg = "국어 ";
					break;
				case 1:
					strmsg = "영어 ";
					break;
				case 2:
					strmsg = "전산 ";
					break;
				} // end switch

				nSum += arr[i][j];
				System.out.printf("[ %s ] : %d \n", strmsg, arr[i][j]);
			} // end for

			fAvg = (double) nSum / arr.length;
			nGrade = (int) fAvg / 10;
			switch (nGrade) {
			case 10:
			case 9:
				szGrade = 'A';
				break;
			case 8:
				szGrade = 'B';
				break;
			case 7:
				szGrade = 'C';
				break;
			case 6:
				szGrade = 'D';
				break;
			default:
				szGrade = 'F';
			} // end switch

			System.out.println("\n**************** [ " + strName[i] + " ] 학생 점수 결과 ****************");
			System.out.printf("[ 총점: %d ]\t[ 평균: %.2f ]\t[ 학점 : %s ]\t", nSum, fAvg, szGrade);
			System.out.println("\n=================================================\n");
		}

	}
}
