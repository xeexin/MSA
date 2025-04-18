//*
package quiz;

import java.util.Scanner;

public class ScoreScanner2 {
	public static void main(String[] args) {
		// kor, eng, com, name -> 총점tot, 평균avg 구하는 프로그램 작성
		// 평균 60점 이상, 과목 당 40점 이상 이어야 합격입니다.

		Scanner sc = new Scanner(System.in);

		// 1.변수 선언
		int kor, eng, com, tot;
		String name;
		double avg = 0.0;

		// 2. 메시지 출력 및 입력
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine(); // next() vs nextLine()

		System.out.print("국어 성적을 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 성적을 입력하세요 : ");
		eng = sc.nextInt();

		System.out.print("전산 성적을 입력하세요 : ");
		com = sc.nextInt();

		// 3. 계산(처리)
		tot = kor + eng + com;
		avg = tot / 3;

		// 4. 결과 출력	
		System.out.println("\n[" + name + "님의 성적]");
		System.out.println("국어 : " + kor + "\t영어 : " + eng + "\t전산 : " + com + "\n총점 : " + tot);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("---------------결과---------------");
		if (avg >= 60 && kor >= 40 && eng >= 40 && com >= 40) {
			System.out.println("[합격]");
		} else if (avg >= 60 && kor < 40)
			System.out.println("[낙제] -과락 (국어 점수 : " + kor + ")");
		else if (avg >= 60 && eng < 40)
			System.out.println("[낙제] -과락 (영어 점수 : " + eng + ")");
		else if (avg >= 60 && com < 40)
			System.out.println("[낙제] -과락 (전산 점수 : " + com + ")");
		else
			System.out.println("[낙제] -평균 점수 60점 미만 (평균 점수 : " + avg + ")");
	}
}

//*/