package ex01.randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Math.random()); // 리턴 double(0.0~1.0)
		System.out.println((int) Math.random()); // 리턴 double(0.0~1.0)
		// Math.random() * n <====== [0 ~ n-1] 값 추출됨

		System.out.println(Math.random() * 5); // 0~4사이의 숫자가 나옴
		System.out.println();

		System.out.println((Math.random() * 5) + 2); // 2~6사이의 숫자가 나옴 +2
		System.out.println((Math.random() * 5) + 2); // 2~6사이의 숫자가 나옴 +2
		System.out.println((int) ((Math.random() * 100) + 1)); // 0~100사이의 숫자가 나옴 +2

	}
}
