package ex05.Interface;

public class MainEntry {
	public static void main(String[] args) {

		// 1. 자기자신으로 객체 생성
		BB b = new BB();
		b.draw();
		System.out.println(b.su);
		
		// 2. 부모로 객체 생성
		IDraw id = new BB();
		id.draw();
		System.out.println(id.su);

	}

}
