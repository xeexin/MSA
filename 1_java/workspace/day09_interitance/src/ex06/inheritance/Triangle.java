package ex06.inheritance;

public class Triangle extends Shape {

	public Triangle() {
		super(5, 5);

	}

	@Override
	public void show() {
		System.out.println("삼각형의 넓이 : " + calc());
	}

	@Override
	public double calc() {
		this.ret = (this.h * this.w) / 2;
		return ret;
	}

}
