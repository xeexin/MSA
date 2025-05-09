package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int sum = 0;
		int a = 0;

		for (int x = 0; x < str.length(); x++) {
			int num;
			if (str.charAt(x) == ',') {
				num = Integer.parseInt(str.substring(a, x));
				sum += num;
				a = x + 1;
			}
		}
		
		sum += Integer.parseInt(str.substring(a,str.length()));
		
		System.out.println(sum);
	}
}
