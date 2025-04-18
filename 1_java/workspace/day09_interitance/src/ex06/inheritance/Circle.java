package ex06.inheritance;

import java.util.Scanner;

// sub class
public class Circle extends Shape {

	public Circle() {
		super(2, 3); // 반드시 첫줄에!
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		this.w = sc.nextInt(); // 부모 것도 내 것!!
	}

	// 함수 재정의
	@Override
	public double calc() {
		// TODO Auto-generated method stub
		this.ret = (w * w * Math.PI);
		return ret;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("반지름 = " + w + " 원의 넓이 :" + calc());

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
