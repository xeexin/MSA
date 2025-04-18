package ex06.multiImpl;

import ex03.Abstract.Shape;
import ex05.Interface.IDraw;

public class MainEntry {
	public static void main(String[] args) {

		// 1. 자기자신
		MultiClass mc = new MultiClass();
		mc.calc(3);
		mc.display();
		mc.draw();

		System.out.println("--------------------------");

		// 2. 부모로 객체 생성 (Shape, Test, IDraw)
		Test test = new MultiClass();
		test.testView();

		IDraw idraw = new MultiClass();
		idraw.draw();

		Shape shape = new MultiClass();
		shape.calc(3.0);

	}

}
