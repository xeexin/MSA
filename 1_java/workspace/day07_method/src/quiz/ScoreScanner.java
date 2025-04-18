//*
package quiz;

import java.util.Scanner;

public class ScoreScanner {
	// 전역 변수 설정
	static String name;
	static int kor;
	static int eng;
	static int com;
	static int tot;
	static double avg;
	static char grade;

	public static void main(String[] args) {
		// kor, eng, com, name -> 총점tot, 평균avg 구하는 프로그램 작성
		// [메소드 분리하기]
		// + 입력합수 - 이름, 국어, 영어, 전산
		// + 출력함수
		// + 총점, 평균 구하는 함수
		// + 학점 구하는 함수
		// + 메인 함수

		// 이름, 성적 입력 받기
		input();

		caltot();

		calAvg();

		calGrade();

		output();

	}

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();

		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();

		System.out.print("전산 점수를 입력하세요 : ");
		com = sc.nextInt();

	}

	public static void calAvg() {
		avg = (double) tot / 3;

	}

	public static void caltot() {
		tot = kor + eng + com;

	}

	public static void calGrade() {
		switch (tot / 30) {

		case 10:
		case 9: {
			grade = 'A';
			break;
		}
		case 8: {
			grade = 'B';
			break;
		}
		case 7: {
			grade = 'C';
			break;
		}
		case 6: {
			grade = 'D';
			break;
		}
		default: {
			grade = 'F';
		}

		}
	}

	public static void output() {
		System.out.printf("이름 : %s\t국어 : %d\t영어 : %d\t전산 : %d\n총점 : %d\t평균 : %.2f\t학점 : %c\n", name, kor, eng, com, tot,
				avg, grade);

	}
}

//*/