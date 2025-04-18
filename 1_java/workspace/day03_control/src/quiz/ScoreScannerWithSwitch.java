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

		Scanner sc = new Scanner(System.in);

		// 1.변수 선언
		int kor, eng, com, tot;
		String name;
		double avg = 0.0;
		char grade = ' ', yn = ' ';

		while (true) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next(); // next() vs nextLine()
			System.out.println();

			do {
				System.out.print("국어 성적을 입력하세요 : ");
				kor = sc.nextInt();
			} while (kor < 0 || kor > 100);

			do {
				System.out.print("영어 성적을 입력하세요 : ");
				eng = sc.nextInt();
			} while (eng < 0 || eng > 100);

			do {
				System.out.print("전산 성적을 입력하세요 : ");
				com = sc.nextInt();
			} while (com < 0 || com > 100);

			// 3. 계산(처리)
			tot = kor + eng + com;
			avg = tot / 3;

			switch ((int) avg / 10) { // (tot/30)
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

			default:
				grade = 'F';
				break;

			}

			// 4. 결과 출력

			System.out.println(name+"님의 성적표*************");
			System.out.println("국어 : " + kor + "점\t영어 : " + eng + "점\t전산: " + com + "점");
			System.out.println("총점 : " + tot + "점\t평균 : " + avg + "점\t" + grade + "학점");

			System.out.print("계속 점수를 입력하시겠습니까? [y/n] : ");
//			yn = sc.next().charAt(0);
//			if (yn == 'N' || yn == 'n')
//				break;
			String ans = sc.next();
			if(ans.equalsIgnoreCase("n"))break;

		}

	}
}