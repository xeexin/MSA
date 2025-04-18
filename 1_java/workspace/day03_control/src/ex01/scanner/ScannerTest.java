package ex01.scanner;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {

		System.out.println("x, y, str = ");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int x = new Scanner(System.in).nextInt();
//		int y = new Scanner(System.in).nextInt();

		String str2 = sc.next();
		String str3 = sc.next();

//		String str = new Scanner(System.in).next();
//		String str2 = new Scanner(System.in).nextLine();

//		System.out.println(x + " " + y + " " + str + " " + str2);
		System.out.println(x + " " + str2);

	}
}
