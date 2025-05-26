package quiz02;

import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentPersonImpl implements Person {

	private int kor, eng, com;
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	@Override
	public void input() {
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("전산 점수 입력 : ");
		com = sc.nextInt();

	}

	@Override
	public void output() {
		System.out.println("총합 : " + (kor + eng + com));
		System.out.println("평균 : " + (kor + eng + com) / 3.0f);

	}

}
