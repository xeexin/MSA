
package quiz;

import java.util.Scanner;

public class 학점2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		int kor, eng, com;

		System.out.print("성적을 입력 받을 학생 수를 적어주세요 : ");
		int n = sc.nextInt();
		char grade;


		for (int x = 0; x < n; x++) {
			do {
				System.out.println("점수 입력(0~100) : ");
				kor = sc.nextInt();
				eng = sc.nextInt();
				com = sc.nextInt();

			} while (kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100);

			int tot = kor + eng + com;
			int avg = tot / 3;

			grade = switch (avg / 10) {
			case 10, 9 -> 'A';
			case 8 -> 'B';
			case 7 -> 'C';
			case 6 -> 'D';
			default -> 'F';
			};

			System.out.println("평균 : " + avg + " 학점 : " + grade);
		}
	}
}