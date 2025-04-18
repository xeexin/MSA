package ex05.overload;

public class OverloadMethod {

	public static void line() {
		System.out.println("---------------------------------------");
	}

	public static void line(String str) {
		System.out.println(str);
	}

	public static void line(int x, int y, String str) {
		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		for (int i = x; i <= y; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	public static void line(double str) {
		System.out.println(str);
	}

	public static void plus(int x) {
		System.out.println(x + 100);
	}

	public static void plus(int x, int y) {
		System.out.println(x + y);
	}
	
	public static void plus(double x) {
		System.out.println(x);
	}
	
	public static void plus(String x) {
		System.out.println(x + 100);
	}
	
	

	public static void main(String[] args) {
		// 함수 호출 먼저 하고 정의 만들기
		line(10, "$");
		line("&&&");
		line(20, "A");
		line();
		line(3, 5, "kOSA ");
		line();
		line(5, 3, "KOSA2 ");
		line();

		// 알아서 알맞은거 리턴값이나 매개변수 보고 불러 옴
		line();
		line("*");
		line(12.34);
	}

	public static void line(int n, String string) {
		for (int x = 0; x < n; x++) {
			System.out.print(string);
		}
		System.out.println();
	}

}
