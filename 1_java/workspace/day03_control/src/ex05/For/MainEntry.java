package ex05.For;

public class MainEntry {
	public static void main(String[] args) {

		int a = 1, b = 2;
		for (;;) {// 무한루프 - 탈출구문 필요
			System.out.println(b + "\t");
			b++;
			if (b == 10)
				break;
		}

	}

}

//package ex05.For;
//
//public class MainEntry {
//	public static void main(String[] args) {
//
//		int a, b;
//		for (a = 1, b = 2; b <= 10; a++, b += 2) { //초기값 증감식 두개 이상 가능
//			System.out.println(b + "\t");
//		}
//
//	}
//
//}

//package ex05.For;
//
//public class MainEntry {
//	public static void main(String[] args) {
//
//		/*
//		 * int a = 1; for (a = 1; a <= 3; a++) { System.out.print(a + "\t"); }
//		 */
//
//		// (1)초기값과 (2)증감식은 생략 가능하다.
//		int a = 1;
//		for (; a <= 3;) {
//			System.out.print(a + "\t");
//			a++;
//		}
//
//	}
//
//}
