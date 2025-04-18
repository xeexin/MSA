package ex01.sort;

//선택정렬

public class SelectionSort {
	public static void main(String[] args) {

		int[] a = { 7, 3, 5, 2, 8 };

		System.out.println("SORT 전 출력 : ");
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x] + " ");
		}

		System.out.println("\n");

		/*
		 * 기준 존재 가장 작은 것이 앞으로 온다
		 */

		for (int y = 0; y < a.length - 1; y++) {
			for (int x = y + 1; x < a.length; x++) {
				if (a[y] > a[x]) {
					int temp = a[y];
					a[y] = a[x];
					a[x] = temp;
				}
			}
		}

		// 정렬 후 출력
		System.out.println("SORT 후 출력 : ");
		for (int x = 0; x < a.length; x++)
			System.out.print(a[x] + " ");

	}

}
