package ex03.Abstract;

public abstract class Shape {
	protected double ret = 0;

	public abstract double calc(double r);

	public abstract void show(String name);

	public void view() {
		System.out.println("SUPER CLASS SHAPE!!");
	}

}
