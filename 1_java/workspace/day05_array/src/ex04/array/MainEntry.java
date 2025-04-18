package ex04.array;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열 생성,메모리 할당
		// 배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';

		// 2.
		char[] ch2 = new char[4]; // 배열 선언 및 생성

		// 3.
		char[] ch3 = { 'J', 'A', 'V', 'A', 'K', 'B', 'S', 'S', 'B', 'S' };

		// 4.
		char[] ch4 = new char[] { 'a', 'b', 'c' };

		// 배열의 길이(크기) 확인
		System.out.println(ch2.length);
		System.out.println(ch3.length);

		// 배열의 내용 출력1
		System.out.println("ch[2] = " + ch[2] + "\n");

		// 배열의 내용 출력2
		for (int x = 0; x < ch3.length; x++) {
			System.out.print("ch[" + x + "] = " + ch3[x] + "\n");
		}

	}

}
