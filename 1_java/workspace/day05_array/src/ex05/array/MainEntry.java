package ex05.array;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		int[][] a = new int[2][3]; // [행][열]
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;

		// 2.
		int[][] a2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }; // 초기화ㅏ

		// 3.
		int[][] a3 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 초기화ㅏ

		// 배열 값 출력
		System.out.println("a3[0][2] = " + a3[0][2]);
		System.out.println("a3[1][1] = " + a3[1][1]);

		System.out.println("---------------------------------------------");

		// 전체 출력
		for (int y = 0; y < 2; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.print("a3[" + y + "][" + x + "] = " + a3[y][x] + "\t");
			}
			System.out.println();
		}

		System.out.println("---------------------------------------------");
		System.out.println("배열의 행크기 : " + a3.length);// 2
		System.out.println("배열의 열크기 : " + a3[0].length);// 3
		System.out.println("배열의 열크기 : " + a3[1].length);// 3
		
		
		System.out.println("---------------------------------------------");
		for(int y=0; y<a3.length; y++) {
			for(int x=0; x<a3[0].length; x++) {
				System.out.print("a3[" + y + "][" + x + "] = " + a3[y][x] + "\t");
			}
			System.out.println();
		}



	}

}
