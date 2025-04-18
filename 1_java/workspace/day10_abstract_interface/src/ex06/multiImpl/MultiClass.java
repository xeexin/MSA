package ex06.multiImpl;

import ex03.Abstract.Shape;
import ex05.Interface.IDraw;

public class MultiClass extends Shape implements Test, IDraw {

	private int num;

	public void display() {
		System.out.println("MultiClass Method!!");
	}

	@Override
	public void draw() { //IDraw
		num = 888;
		System.out.println("IDraw Interface " + num);
		System.out.println(su);
	}

	@Override
	public void testView() { //Test
		System.out.println("Test Interface " + num);
		System.out.println(str);

	}

	@Override
	public double calc(double r) { // shape
		System.out.println("Shape Abstract Class!");
		return 5.5;
	}

	@Override
	public void show(String name) { // shape
		// TODO Auto-generated method stub
		System.out.println("Shape Abstract Class!" + name);

	}

}
