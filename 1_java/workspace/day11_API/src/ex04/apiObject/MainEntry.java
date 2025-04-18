package ex04.apiObject;

class Point {

}

public class MainEntry {
	public static void main(String[] args) {

		Point pt = new Point(); // 객체생성 메모리에할당, 생성자함수자동호출
		System.out.println("[Point pt info]");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt); // 16진수 7c3df479
		System.out.println("hash code : " + pt.hashCode()); // 10진수 2084435065
		System.out.println("Object String : " + pt);
		System.out.println("Object String : " + pt.toString());

		System.out.printf("10진수 주소 : %d\n", 0x7c3df479);

		System.out.println("------------------------------------------");

		Point pt2 = new Point();
		System.out.println("[Point pt info]");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2); // 16진수 3eb07fd3
		System.out.println("hash code : " + pt2.hashCode()); // 10진수 1051754451
		System.out.println("Object String : " + pt2);
		System.out.println("Object String : " + pt2.toString());

		System.out.println("------------------------------------------");

		System.out.println("pt2.tostring() : toString()의 의미 ");
//		System.out.println(pt2.getClass().getName()+'@' +pt2.hashCode()); //클래스이름@주소(10진수)
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode())); // 클래스이름@주소(16진수)

		System.out.println("------------------------------------------");

		Point pt3 = new Point();
		if (pt3.hashCode() == pt.hashCode()) {
			System.out.println("SAME");
		} else {
			System.out.println("NOT SAME");
		}

		System.out.println("------------------------------------------");

		Point pt4;
		pt4 = pt;
		if (pt4.hashCode() == pt.hashCode()) {
			System.out.println("SAME");
		} else {
			System.out.println("NOT SAME");
		}

	}

}
