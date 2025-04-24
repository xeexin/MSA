package ex05.Synchronized;

class ATM {
	private int money;

	public ATM(int money) {
		this.money = money;
	}

	// 입금함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + "님이 입금했습니다. 입금 금액 : " + amount);
	}

	// 출금함수
	public void withdraw(int amount, String name) {
		synchronized (this) {
			if ((money - amount) > 0) {
				Thread.yield(); // 뒤에 작업 오면 양보함. 그럼 뒤에 작업이 cpu에 올라감
				money -= amount;
				System.out.println(name + "님이 출금했습니다. 출금 금액 : " + amount + "출금 후 잔액 : " + money);
			} else {
				System.out.println(name + "님 잔액부족  잔고 : " + money);
			}

		} // synchronized end

	}

	// 통장 장고 확인 함수
	public void getMoney() {
		System.out.println("                   잔액 : " + money);
	}

}

class UserATM extends Thread {

	ATM obj;
	Boolean flag = false;

	public UserATM(ATM obj, String name) {
		super(name); // Thread의 네임 부름
		this.obj = obj;

	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (flag) {
				obj.deposit((int) (Math.random() * 10 + 2) * 100, getName());
			} else {
				obj.withdraw((int) (Math.random() * 10 + 2) * 100, getName());
			} // end if

			flag = true;
			obj.getMoney();

		} // end for

	}

}

public class MainEntry {
	public static void main(String[] args) {

		ATM at = new ATM(1000);
		UserATM user1 = new UserATM(at, "와이프");
		UserATM user2 = new UserATM(at, "남편");
		UserATM user3 = new UserATM(at, "아들");

		user1.start();
		user2.start();
		user3.start();

	}

}
