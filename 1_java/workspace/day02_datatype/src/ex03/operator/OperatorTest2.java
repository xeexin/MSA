package ex03.operator;

public class OperatorTest2 {
	public static void main(String[] args) {

		// 논리연산자 : and(&,&&), or(|,||), xor(^), not(!)
		// 2진 논리 결과 : 값(숫자)
		// 10진 논리 결과 : TRUE / FALSE

		int x = 4, y = 7;

		// 2진 논리
		System.out.println("------2진 논리------");
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);

		// 10진 논리
		System.out.println("------10진 논리------");

		int xx = 10, yy = 20, zz = 30;
		boolean flag1 = false;
		boolean flag2 = false;
		
		flag1 = (xx < yy) && (yy > zz); // 참 && 거짓 -> 거짓
		// &&연산은 앞에 것이 거짓이면 뒤에는 수행하지 않는다!
		flag2 = (xx < yy) || (yy > zz); // 참 || 거짓 -> 참
		
		System.out.println(flag1);
		System.out.println(flag2);

	}

}
