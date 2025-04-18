package ex03.Abstract;

public class Circle extends Shape {

	@Override
	public double calc(double r) {
		ret = r * r * Math.PI;
		return ret;
	}

	@Override
	public void show(String name) {
		calc(5.5);
		System.out.println(name + "의 넓이는 " + ret + "입니다.");
	}

}
