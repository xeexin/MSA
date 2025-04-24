package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // 3 5 이렇게 들어오니까 st필요

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashSet<Integer> setA = new HashSet<>();
		HashSet<Integer> setB = new HashSet<>();

		st = new StringTokenizer(br.readLine()); // 1 2 4
		for (int x = 0; x < n; x++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine()); // 2 3 4 5 6

		for (int x = 0; x < m; x++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}

		int cnt = 0;

		for (int num : setA) {
			if (!setB.contains(num)) {
				cnt += 1;
			}
		}

		for (int num : setB) {
			if (!setA.contains(num)) {
				cnt += 1;
			}
		}

		System.out.println(cnt);
	}
}
