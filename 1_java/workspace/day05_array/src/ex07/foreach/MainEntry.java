package ex07.foreach;

public class MainEntry {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 일반 for문
		System.out.println("오름차순 출력");
		for (int x = 0; x < a.length; x++) {

			if (a[x] == 3) // 중간에 조건 걸 수 있음
				continue;
			System.out.print(a[x] + "\t");
		}
		
		System.out.println();

		//내림차순 출력
		for (int x = a.length-1; x >= 0; x--) {

			System.out.print(a[x] + "\t");
		}

		
		
		System.out.println();
		System.out.println();


		// 개선(확장)된 for문 (jdk 5.0)
		// for(자료형 변수명 : 컬렉션명 or 배열명){반복구문;}
		for (int x : a) {
			System.out.print(x + "\t");
		}

	}

}
