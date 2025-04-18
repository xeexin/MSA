package ex01.sort;
//버블정렬
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };

		System.out.println("SORT 전 출력 : ");
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x] + " ");
		}

		System.out.println("\n");
		
		/*
		 * 큰게 뒤로 간다
		 * */
		
		for(int y=0; y<a.length-1; y++) {
			for(int x=0; x<a.length-1-y; x++) {
				if(a[x] > a[x+1]) {
					int temp=a[x];
					a[x]=a[x+1];
					a[x+1]=temp;
				}
			}
		}
		
		System.out.println("SORT 후 출력");
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x] + " ");
		}

	}

}
