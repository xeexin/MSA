package ex03.operator;

//최단산쉬관논삼대콤
public class MainEntry {

	public static void main(String[] args) {
		// 산술연산자 : +,-,*,/,%,^
		int x = 10, y = 20;
		int gop = x * y;

		System.out.println(gop);
		System.out.println("x * y = " + (x * y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println("----------------------------");

		// 정수 산술연산자(+,-,*,/,%,^) 정수 = 정수
		System.out.println("\n\n7/3 = " + (7 / 3));
		System.out.println("7 % 3 = " + (7 % 3));

		System.out.println("\n7 / 3 = " + (7 / 3));
		System.out.println("7 / 3.0 = " + (7 / 3.0)); //2.3333 -> 큰 수 따라감
		System.out.println("7.0 / 3. = " + (7. / 3.)); //2.3333


	}
}

/*
 * package ex03.operator;
 * 
 * //최단산쉬관논삼대콤 public class MainEntry {
 * 
 * public static void main(String[] args) {
 * 
 * // 최우선 연산자_(),[],. 안의 연산이 가장 먼저 수행 System.out.println(3 + 4 * 5); // 23
 * System.out.println((3 + 4) * 5); // 35
 * 
 * // 단항 : 증감 ++, --, ~,... int x = 10, y; y = x++; // 후위 연산 (대입 먼저, 연산 나중) //y
 * = ++x; // 전위 연산 ( 연산 먼저, 대입 나중) System.out.println("x : " + x + "\ty = " +
 * y);
 * 
 * int xx = 10,yy; yy=~xx; //비트부정 (10 = 00001010) || (~10 = 11110101) //비트 부정 :
 * -(원래값+1) } }
 */

/*
 * package ex03.operator;
 * 
 * //최단산쉬관논삼대콤 public class MainEntry {
 * 
 * public static void main(String[] args) {
 * 
 * // 최우선 연산자_(),[],. 안의 연산이 가장 먼저 수행 System.out.println(3 + 4 * 5); // 23
 * System.out.println((3 + 4) * 5); // 35
 * 
 * // 단항 : 증감 ++, --, ~,... int x = 10, y; y = x++; // 후위 연산 (대입 먼저, 연산 나중) //y
 * = ++x; // 전위 연산 ( 연산 먼저, 대입 나중) System.out.println("x : " + x + "\ty = " +
 * y); } } //
 */
