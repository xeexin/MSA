package ex01.Abstract;

abstract class Shape { // 추상클래스, 슈퍼클래스
	double ret = 0.0;

	public abstract double calc(); // 추상 메서드

	public abstract void draw();

	public void show() {
		System.out.println("super class Shape call");

	}

} // shape end

class Circle extends Shape { // 서브클래스

	double r = 5.0;

	@Override
	public double calc() {
		ret = r * r * Math.PI;
		return ret;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		calc();
		System.out.println("원의 넓이는 " + ret + "입니다.");

	}

} // Circle end

class Rect extends Shape {
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

public class MainEntry {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.draw();
		
		Rect r= new Rect();
		r.draw();

	}

}
