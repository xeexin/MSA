package ex06.inheritance;
// super class
public class Shape {
	protected int w, h;
	protected double ret;

	public Shape() { // 생성자 함수 - 멤버변수의 초기화 담당
		w = h = 0;
		ret = 0.0;
	}

	public Shape(int w, int h) {
		this.w = w;
		this.h = h;
	}

	//추가 메서드
	public void show() {
		System.out.println(w + ", " + h);
	}
	
	public double calc() {
		return ret;
	}

	// getter setter

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getRet() {
		return ret;
	}

	public void setRet(double ret) {
		this.ret = ret;
	}

}
