package ex02.Abstract;

public abstract class Shape {

	protected double ret = 0.0;

	public abstract double calc(); // 추상 메서드

	public abstract void draw(); // 추상메서드

	public void show() {

		System.out.println("super calss Shape call!");
	}

}
