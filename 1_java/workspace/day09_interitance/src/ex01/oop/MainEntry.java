package ex01.oop;

public class MainEntry {
	public static void main(String[] args) {
		Pointt pt= new Pointt(); //객체생성, 메모리에 할당, 생성자함수 자동호출
		pt.disp();
		System.out.println(pt.hashCode()); //주소를 10진수 형태로
		System.out.println("---------------------------");
		
		Pointt pt2= new Pointt(100,200);
		pt2.disp();
		System.out.println(pt2.hashCode()); //주소를 10진수 형태로
		System.out.println("---------------------------");

		
		Pointt pt3 = new Pointt(500);
		pt3.disp();
		System.out.println(pt3.hashCode()); //주소를 10진수 형태로
		System.out.println("---------------------------");

	}

}
