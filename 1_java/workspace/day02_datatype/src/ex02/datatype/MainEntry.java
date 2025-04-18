package ex02.datatype;

public class MainEntry {
	

	static int Num;
	static String str;

	public static void main(String[] args) {// 시작점(진입점)

		/*
		 * int xx; // 지역 변수는 반드시 초기화 하고 사용해야한다. System.out.println(xx);
		 */

		System.out.println(Num); //정수형: 0, 실수형:0.0, 문자열:NULL
		System.out.println(str);
		
		int x = 99;
		System.out.println(x);

		int su = 30;
		System.out.println(su); // 4 byte
		System.out.println(100); // 4byte int

		long num = 200;
		System.out.println(num); // 8byte
		System.out.println(1000L); // 8byte

		double d = 12.34;
		System.out.println(d); // double
		System.out.println(34.56); // double
		System.out.println(5.67f); // float

//		float f = 12.34; //에러 : 더블을 플롯에 넣으려고 해서!
		float f = 12.34F; // 오른쪽에서 왼쪽으로 읽는 버릇 들이기
		System.out.println(f);
	}

}
