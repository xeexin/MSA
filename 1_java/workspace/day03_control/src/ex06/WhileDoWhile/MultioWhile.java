package ex06.WhileDoWhile;

public class MultioWhile {
	// 구구단 전체 출력 - 중첩 while문 이용
	public static void main(String[] args) {
		int a = 1;

		while (a < 10) {
			int x = 1;
			while (x < 10) {
				System.out.println(a + " * " + x + " = " + a * x);
				x++;
			}
			System.out.println();
			a++;
		}
	}
}
