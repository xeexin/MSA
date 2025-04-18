package ex02.oop;

import java.util.Scanner;

public class B_1_11655 {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String ret = "";

		for (int x = 0; x < s.length(); x++) {

			if ((s.charAt(x) >= 'a' && s.charAt(x) <= 'm') || (s.charAt(x) >= 'A' && s.charAt(x) <= 'M')) {
				ret += (char) (s.charAt(x) + 13);

			} else if ((s.charAt(x) >= 'n' && s.charAt(x) <= 'z') || (s.charAt(x) >= 'N' && s.charAt(x) <= 'Z')) {
				ret += (char) (s.charAt(x) - 13);
			} else {
				ret += (char) (s.charAt(x));
			}

		}

		System.out.println(ret);

	}

}
