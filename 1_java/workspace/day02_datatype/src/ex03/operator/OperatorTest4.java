package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest4 {

	// 대입 연산자 (배정 연산자) : =, +=, -=, *=, /=, <<= ...
	public static void main(String[] args) {

		int x = 2, y = 3, ret;

		ret = x + y;
		System.out.println(ret);

		
		x += y; //x = x + y;

		System.out.println(x);
		
		x *= y;
		System.out.println(x);
		
		x = x+1; // x += 1, x++  -> 다 같은 의미
		System.out.println(x);
		
	}
}
