package ex03.operator;

//최단산쉬관논삼대콤
//public class OperatorTest {
//	public static void main(String[] args) {
//		// 쉬프트 연산 : <<(=좌측쉬프트), >>(=우측쉬프트) (꼭지점 방향 보고 확인!)
//		int x = 8, result;
//		result = x << 2; // left shift : 원래값 *2^bit수 --> 8 * 2^2 = 32
//		System.out.println("left shift ret : " + result);
//
//		int xx = 8, ret;
//		ret = x >> 3; //right shift : 원래값 / 2^bit수 --> 8 / 2^3 = 1
//
//	}
//
//}

public class OperatorTest {
	public static void main(String[] args) {
		// 관계 연산 : >, <, >=, <=, ==, !=

		int x = 20, y = 20;
		
		if(x != y) {
			System.out.println("NOT SAME");
		}else {
			System.out.println("SAME");
		}
		
		if(x==y) {
			System.out.println("SAME2");
		}else {
			System.out.println("NOT SAME2");
		}

	}

}
