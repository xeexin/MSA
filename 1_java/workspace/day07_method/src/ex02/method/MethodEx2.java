package ex02.method;

//public class MethodEx2 {
//	// 4. 매개변수 있고, 리턴 타입 있는 경우
//	public static int name(int x) {
//		System.out.println("x = " + x);
//		return x;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(name(23));
//		int num = name(50);
//		System.out.println(num);
//
//	}
//}

public class MethodEx2 {
	// 4. 매개변수 있고, 리턴 타입 있는 경우
	public static String name(int x, String irum) {
		System.out.println("x = " + x);
		return irum;
	}

//	public static double value(int x, int y, double d) {
//		return x + y + d;
//	}

	public static double value(double x, double y, double d) {
		return x + y + d;
	}

	public static String display(int x, String name) {
		System.out.println("~");
		for (int i = 0; i < x; i++) {
			System.out.print(name + "\t");
		}
		return name;
	}

	public static void main(String[] args) {

		String str = name(10, "heejin");
		System.out.println(str);

		System.out.println("---------------------");

		System.out.println(value(1, 2, 12.34));

		System.out.println("---------------------");

		System.out.println(display(5, "^^"));
		// display(5, "^^");

		String triangle = display(15, "▲");
		System.out.println(triangle);

	}
}