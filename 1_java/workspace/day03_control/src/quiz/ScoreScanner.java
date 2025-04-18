//*
package quiz;

import java.util.Scanner;

public class ScoreScanner {
	public static void main(String[] args) {
		// kor, eng, com, name -> 총점tot, 평균avg 구하는 프로그램 작성

		Scanner sc = new Scanner(System.in);

		// 1.변수 선언
		int kor, eng, com, tot;
		char grade = ' ';
		String name;
		double avg = 0.0;

		// 2. 메시지 출력 및 입력
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine(); // next() vs nextLine()

		System.out.print("국어 성적을 입력하세요 : ");
		kor = sc.nextInt();

		System.out.print("영어 성적을 입력하세요 : ");
		eng = sc.nextInt();

		System.out.print("컴퓨터 성적을 입력하세요 : ");
		com = sc.nextInt();

		// 3. 계산(처리)
		tot = kor + eng + com;
		avg = tot / 3;

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'A';
		else
			grade = 'F';

		// 4. 결과 출력
		System.out.println("[" + name + "님의 성적]");
		System.out.println("국어 : " + kor + "\t영어 : " + eng + "\t컴퓨터 : " + com + "\n총점 : " + tot);
		System.out.printf("평균 : %.2f ", avg);
		System.out.println("\n학점 : " + grade);

	}
}

//*/