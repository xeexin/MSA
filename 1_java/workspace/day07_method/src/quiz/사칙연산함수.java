package quiz;

import java.util.Scanner;

public class 사칙연산함수 {
	public static void main(String[] args) {
		// x,y 입력 받아서 add(), substract() , [return] multi() , [return] div()+예외처리까지 ; ->
		// 결과 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.println("---------------------");

		add(a, b);
		substract(a, b);
		System.out.println("곱하기 : " + multi(a, b));
		System.out.printf("나누기 : %.2f", div(a, b));

	}

	public static void add(int a, int b) {
		System.out.println("더하기 : " + (a + b));
	}

	public static void substract(int a, int b) {
		System.out.println("빼기 : " + (a - b));
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		if(b==0) {
			System.out.println("0으로 나눌 수 없음");
			System.exit(0); //시스템 강제 종료
		}
		return (double) a/b;
	
	}

}
