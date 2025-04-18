package ex03.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntryEx {
	public static void main(String[] args) throws ArithmeticException, InputMismatchException {//예외처리 위임 (JVM에게 위임) {
		//위임 (Throws) 
		System.out.println("x, y =");
		int x, y, ret;

		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		ret = x / y; // 에러발생 할 수 있다. ** 0으로 나누는 거 불가능
		
		System.out.println(ret);
	}
}

//*

//package ex03.exception;
//
//import java.util.Scanner;
//
//public class MainEntryEx {
//	public static void main(String[] args) {
//		try {
//			System.out.println("x, y =");
//			int x, y, ret;
//
//			x = new Scanner(System.in).nextInt();
//			y = new Scanner(System.in).nextInt();
//
//			ret = x / y; // 에러발생 할 수 있다. ** 0으로 나누는 거 불가능
//
//			System.out.println(ret);
//
//			
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없음");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
//}
//*/

/*
 * 
 * package ex03.exception;
 * 
 * import java.util.Scanner;
 * 
 * public class MainEntryEx { public static void main(String[] args) {
 * System.out.println("x, y ="); int x, y, ret;
 * 
 * x = new Scanner(System.in).nextInt(); y = new Scanner(System.in).nextInt();
 * 
 * ret = x / y; // 에러발생 할 수 있다. ** 0으로 나누는 거 불가능
 * 
 * System.out.println(ret);
 * 
 * } } //
 */
