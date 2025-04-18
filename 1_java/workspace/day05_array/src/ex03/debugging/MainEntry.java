package ex03.debugging;

public class MainEntry {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		for (int i = 1; i <= 10; i++) {

			if (i == x)
				continue;
			y++;
			System.out.println(i);

		}
		System.out.println("x = " + x + "\ty = " + y);

	}
}
