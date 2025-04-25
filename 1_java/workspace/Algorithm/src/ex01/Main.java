package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int x = 0; x < n; x++) {
			String str = br.readLine();
			String[] arr = str.split(" ");

			System.out.print("Case #" + (x + 1) + ": ");
			
			for (int y = arr.length - 1; y >= 0; y--) {
				System.out.print(arr[y] + " ");
			}
			System.out.println();
		}
	}
}
