package ex01.scanner;

import java.util.Scanner;

//ctrl + shift + o : 자동 임포트 단축키

public class MainEntry {
	public static void main(String[] args) {
		//System.in : 표준 입력
		Scanner sc = new Scanner(System.in); //열쇠 생성
		
		System.out.print("숫자를 적어 주세요 : ");
		int su = sc.nextInt(); // 
		
		System.out.println(su);
	
	}

}
