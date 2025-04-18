package ex02.method;

public class MainEntry {
	public static void main(String[] args) {

		// 컴파일러의 시작점(진입점) => main()
		// 같은 클래스에 있을 경우 그냥 호출 가능
		System.out.println("START MAIN");
		line();
		info();
		line();
		info();
		line();
		System.out.println("END MAIN");

		plus(10, 20);
		line();
		abs(-7);
		abs(10);

	}

	// 1. 매개변수 없고, 리턴 타입 없는 경우
	public static void info() {
		System.out.println("HEE JIN");
		System.out.println("010-5223-9091");
		System.out.println("ILSAN");
	}

	public static void line() {
		System.out.println("-------------------------------");
	}

	// 2. 매개변수(parameter) 있고, 리턴 타입 없는 경우
	public static void plus(int x, int y) {
		System.out.printf("합 : %d + %d = %d\n", x, y, x + y);
	}

	// quiz : 절대값 구하는 함수 구현하기
	public static void abs(int num) {
		if (num < 0) {
			System.out.println(-(num));
		} else
			System.out.println(num);
	}

}
