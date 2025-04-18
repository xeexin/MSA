package ex01.UserException;

public class MainEntry {

	public void test1(String[] n) throws UserException {
		System.out.println("Test1");
		if (n.length < 1)
			throw new UserException("아무것도 없음"); // 강제 exception 발생
		else
			throw new UserException("최종 예선 ", 703); // 강제 exception 발생
	}

	public static void main(String[] args) {
		MainEntry ut = new MainEntry();
		try {
			ut.test1(args);

		} catch (UserException ue) {
			// TODO: handle exception
			ue.printStackTrace();
		}
	}

}
