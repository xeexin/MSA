package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];

		for (int x = 0; x < n; x++) {
			str[x] = br.readLine();
		}

		for (int x = 0; x < n; x++) {
			char first = str[x].charAt(0);
			if (first >= 'a' && first <= 'z') {
				first = (char) (first - ('a' - 'A'));
				str[x] = first + str[x].substring(1);
			}
		}

		for (int x = 0; x < n; x++) {
			System.out.println(str[x]);
		}

	}
}
