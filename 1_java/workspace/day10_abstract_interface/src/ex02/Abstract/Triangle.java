package ex02.Abstract;

public class Triangle extends Shape {

	int w = 5, h = 8;

	@Override
	public double calc() {
		ret = w * h / 2;
		return ret;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형으 넓이 " + ret + "입니다.");
		// TODO Auto-generated method stub

	}

}
