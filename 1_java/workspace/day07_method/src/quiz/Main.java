package quiz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int[] bucket = new int[200];

		for (int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x);
			// 소문자 일 경우 대문자로 변경해 줌
			if (ch >= 'a' && ch <= 'z') {
				ch += 'A' - 'a';
			}
			bucket[ch]++;
		}

		int MAX = -10;
		int MAXidx = 0;
		int flag = 0;

		for (int x = 0; x < 200; x++) {
			if (bucket[x] == 0)
				continue;

			if (MAX < bucket[x]) {
				MAX = bucket[x];
				MAXidx = x;
			}

		}

		for (int x = 0; x < 200; x++) {
			// 맥스값 중복 처리 필요
			if (MAXidx != x && MAX == bucket[x]) {
				flag = 1;
				break;
			}
		}

		if (flag == 1)
			System.out.println("?");
		else
			System.out.println((char) MAXidx);

	}

}
