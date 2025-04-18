package quiz;

public class MainEntry2 {
	public static void main(String[] args) {
		// 로또 프로그램 [1~45까지 숫자 중 6개 추출]
		// 조건 : 같은 수 안됨 -> 다시 추출하기

		int lotto1 = (int) (Math.random() * 45) + 1;
		int lotto2 = (int) (Math.random() * 45) + 1;
		if(lotto1 == lotto2) lotto2 = (int) (Math.random() * 45) + 1;
		int lotto3 = (int) (Math.random() * 45) + 1;
		int lotto4 = (int) (Math.random() * 45) + 1;
		int lotto5 = (int) (Math.random() * 45) + 1;
		int lotto6 = (int) (Math.random() * 45) + 1;

	}

}
