package Quiz;

public class 산술연산문제 {
	public static void main(String[] args) {

		// 연산자 중에서 /와 %를 이용하여 만원 몇장, 천원 몇장, 백원 몇개, 십원 몇개?

		// 1.변수 선언
		int pay = 567890;
		int man, chun, back, sip; // 몫 저장 변수
		int m_na, ch_na, b_na; // 나머지 저장 변수

		// 2. 메시지 출력 및 입력 받기

		// 3.처리(계산)
		man = pay / 10000;
		m_na = pay % 10000;

		chun = m_na / 1000;
		ch_na = m_na % 1000;

		back = ch_na / 100;
		b_na = ch_na % 100;

		sip = b_na / 10;

		// 4. 결과출력(화면)
		System.out.println("\n\n만원 : " + man + "장\n천원 : " + chun + "장\n백원 : " + back + "개\n십원 : " + sip + "개");

	}
}

//public class 산술연산문제 {
//	public static void main(String[] args) {
//
//		// 연산자 중에서 /와 %를 이용하여 만원 몇장, 천원 몇장, 백원 몇개, 십원 몇개?
//
//		int pay = 567890;
//		int money = 10000;
//
//		System.out.println("만원 : " + pay / 10000 + "장");
//		System.out.println("천원 : " + (pay % 10000) / 1000 + "장");
//		System.out.println("백원 : " + (pay % 1000) / 100 + "개");
//		System.out.println("십원 : " + (pay % 100) / 10 + "개");
//
//	}
//}

//public class 산술연산문제 {

//	public static void main(String[] args) {
//		
//		// 연산자 중에서 /와 %를 이용하여 만원 몇장, 천원 몇장, 백원 몇개, 십원 몇개?
//		
//		int pay = 567890;
//		int money = 10000;
//
//		while (money > 1) {
//			int ret = (pay / money);
//			System.out.println(money + "원 : " + ret + "장");
//
//			pay  %= money;
//			money /= 10;
//		}
//	}
//}