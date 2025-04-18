package ex02.staticMember;

class Atm {
	int cnt; // 인스턴스 멤버
	static int total; // 스태틱 멤버 - 초기화 딱 1회만,,, 이전에 있던 값을 가지고 쓰게 된다.

	public Atm(int amount) {
		cnt += amount;
		total += amount;
	}

	// static member에서 일반 멤버변수는 사용 할 수 없다.
	public static void view() {
		total = total + 100;
		// *에러(스택에 저장되어 있는 일반 변수이기때문) cnt = cnt + 100;
	}

	public void display() {
		cnt += 100;
		total += 30;
		System.out.println("count = " + cnt);
		System.out.println("total = " + total);
	}

} // ATM END

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display();
		System.out.println("----------------");
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("----------------");
		Atm at3 = new Atm(1000);
		at3.display();

	}

}
