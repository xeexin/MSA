//*
package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		// kor, eng, com, name -> 총점tot, 평균avg 구하는 프로그램 작성
		int kor = 90, eng = 88, com = 100, tot;
		String name = "heejin";

		double avg = 0.0;

		tot = kor + eng + com;
		avg = tot / 3;

		System.out.println("[" + name + "님의 성적]");
		System.out.println("국어 : " + kor + "\t 영어 : " + eng + "\t 컴퓨터 : " + com + "\t 총점 : " + tot);
		System.out.printf("평균 : %.2f ", avg);
	}

}

//*/