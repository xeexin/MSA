package ex03.Abstract;

public class Rect extends Shape {
	
	int h=10;

	@Override
	public double calc(double r) {
		ret = h * r;
		return ret;
	}

	@Override
	public void show(String name) {
		calc(8.8);
		System.out.println(name + "의 넓이는 " + ret + "입니다.");

	}

}
