package ex05.array;

public class QuizEx4 {
	public static void main(String[] args) {
		// arr[3][4];

		int[][] arr = new int[][] { { 3, 10, 2, 8 }, { 7, 15, 5, 3 }, { 0, 0, 0, 0 } };

		// arr[2][0] = arr[0][0]+arr[1][0]
		// arr[2][1] = arr[0][1]+arr[1][1]
		// arr[2][2] = arr[0][2]+arr[1][2]
		// arr[2][3] = arr[0][3]+arr[1][3]

		for (int x = 0; x < 4; x++) {
			arr[2][x] = arr[0][x] + arr[1][x];
		}

		for (int y = 0; y < arr.length; y++) {
			for (int x = 0; x < arr[0].length; x++) {
				System.out.print("arr[" + y + "][" + x + "] = " + arr[y][x] + "\t");
			}
			System.out.println();
		}

	}

}
