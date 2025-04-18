//*
package ex02.IF;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

		System.out.print("INPUT DATA : ");

		int su = new Scanner(System.in).nextInt();
		String str;

		str = (su % 2 == 0) ? "EVEN" : "ODD";
		System.out.println(su + " : " + str);
		
		
		//양수, 음수, 0 판정 IF
		if(su>0) System.out.println("양수");
		else if(su <0)System.out.println("음수");
		else System.out.println("0");

	}

}
//*/

/*
 * package ex02.IF;
 * 
 * import java.util.Scanner;
 * 
 * public class MainEntry { public static void main(String[] args) {
 * 
 * System.out.print("INPUT DATA : ");
 * 
 * Scanner sc = new Scanner(System.in); //객체 생성, 메모리에 할당, 생성자함수 자동 호출 int su =
 * sc.nextInt();
 * 
 * if (su % 2 == 0) System.out.println("EVEN"); else System.out.println("ODD");
 * 
 * }
 * 
 * } //
 */