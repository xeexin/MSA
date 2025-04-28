package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		/**
		 * 유클리드 호제법이란 무엇인가? 큰 수를 작은 수로 나눈다.
		 * 
		 * 나누는 수를 나머지로 계속 나눈다.
		 * 
		 * 나머지가 0이 나오면 나누는 수가 최대공약수이다.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int x = 0; x < t; x++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int k = solution(a, b);
			int ret = a*b / k;
			System.out.println(ret);
		}

	}

	static int solution(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
