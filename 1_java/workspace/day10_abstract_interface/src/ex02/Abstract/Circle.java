package ex02.Abstract;

public class Circle extends Shape {

	double r = 5.0;

	@Override
	public double calc() {

		ret = r * r * Math.PI;
		return ret;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이는 " + ret + "입니다.");

	}

}
