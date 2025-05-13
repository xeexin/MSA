package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;

		Arrays.sort(A); // 오름차순
		Arrays.sort(B);

		// 뒤집기
		for (int x = 0; x < B.length / 2; x++) {
			int tmp = B[x];
			B[x] = B[B.length - 1 - x];
			B[B.length - 1 - x] = tmp;
		}

		for (int x = 0; x < A.length; x++) {
			answer += (A[x] * B[x]);
		}

		return answer;
	}
}

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	}
}
