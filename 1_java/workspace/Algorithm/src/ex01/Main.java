package ex01;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		// 입력
		int n = sc.nextInt();
		Integer[][] arr = new Integer[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		// 정수형 배열 정렬
		Arrays.sort(arr, new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if (o1[0].equals(o2[0])) {
					return o1[1] - o2[1]; //오름
				} else {
					return o1[0] - o2[0]; // 오름
				}

			}

		});
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		

	}
}
