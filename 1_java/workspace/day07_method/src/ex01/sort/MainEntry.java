package ex01.sort;

import java.util.Arrays;

public class MainEntry {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };

		System.out.println("SORT 전 출력 : ");
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x] + " ");
		}

		System.out.println("\n");
		
		
		Arrays.sort(a);  //정렬 알고리즘이 이미 내부적으로 처리 되어 있는 메소드
		System.out.println("SORT 후 출력 : ");
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x] + " ");
		}

	}
}
