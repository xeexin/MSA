package ex03.Abstract;

public class Triangle extends Shape {

	int w = 4, h = 2;

	@Override
	public double calc(double r) {
		ret = w * h / 2;
		return ret;
	}

	@Override
	public void show(String name) {
		calc(5.0);
		System.out.println(name + "의 넓이는 " + ret + "입니다.");

	}

}
