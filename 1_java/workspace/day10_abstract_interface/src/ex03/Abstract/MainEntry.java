package ex03.Abstract;

public class MainEntry {
	public static void main(String[] args) {

		// 1. 각자의 클래스로 객체 생성
		new Circle().show("원");
		new Rect().show("사각형");
		new Triangle().show("삼각형");

		System.out.println("---------------------------");

		// 2. 부모의 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("Circle");

		sh = new Rect();
		sh.show("Rectangle");

		sh = new Triangle();
		sh.show("Triangle");

		System.out.println("---------------------------");

		// 3. 배열을 이용하여 선언 및 생성
		// **추상메서드는 자체적으로 객체 생성 불가
		Shape[] ss = new Shape[3];

		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();

		String[] names = { "원", "사각형", "삼각형" };
		for (int x = 0; x < ss.length; x++) {
			ss[x].show(names[x]);
		}

	}

}
