package ex05.wrapper;

/**
 * - 본 자료형에 대응되는 클래스형 자료형 - 기본자료형 | 클래스형(레퍼런스 또는 참조형) 자료형 - int | Integer -
 * float | Float - double | Double - char | character
 */

class Point {

}

public class MainEntry {
	public static void main(String[] args) {
		Integer Ia = new Integer(10);
		Integer Ib = new Integer("10");
		String su = "30";

		Point pt = new Point();

		System.out.println(pt); // 주소 ex05.wrapper.Point@49097b5d
		System.out.println(pt.toString()); // 주소 ex05.wrapper.Point@49097b5d

		System.out.println(Ia);
		System.out.println(Ia.getClass().getName() + "@" + Integer.toHexString(Ia.hashCode()));

		int x = 77;
		double y = 5.5;
		System.out.println(x + " " + y);
		y = x; // 묵시적 형변환 (작은애가 큰애 따라간다~)
		x = (int) y; // 명시적 형변환 필요

		// Boxing vs UnBoxing
		int c = Ia; //
		int d = Ib;

		int num = Integer.parseInt(su); // 스트링을 인트로 바꾼다.
		System.out.println(c + num);
		System.out.println(Ia.MAX_VALUE);
		System.out.println(Ia.MIN_VALUE);

		Double dd = new Double(12.34);
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println("----------------------------");

		c = (int) (dd.doubleValue());
		System.out.println(c);

		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111", 2); // 2^7;
		System.out.println(f);
		System.out.println(e + 20);

		int xx = 3; // 저장 stack
		Integer yy = new Integer(3); // 저장 Heap
		xx = yy; //자동 박싱 언박싱 해줌

		xx = yy.intValue(); 
	}

}
