package ex05.For;

public class QuizStar {
	public static void main(String[] args) {
		// 별찍기 1
		for (int y = 0; y <= 5; y++) {
			for (int x = 0; x < y; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		// 별찍기 2
		for (int y = 5; y >= 1; y--) {
			for (int x = y; x > 0; x--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		
		// 별찍기 3

		for (int z = 1; z <= 5; z++) {
			for (int y = 1; y <= 5 - z; y++) {
				System.out.print(" ");
			}
			for (int y = 1; y <= (2 * z - 1); y++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
