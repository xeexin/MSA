package ex02.Abstract;

public class Rect extends Shape {

	int w = 7, h = 8;

	@Override
	public double calc() {
		ret = w * h;

		return ret;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형으 넓이는 " + ret + "입니다.");
	}

}
