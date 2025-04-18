//*
package ex04.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요 (s,d,b,j) =  ");
		String str = new Scanner(System.in).next();

		switch (str) { // Long 형을 제외한 정수형, 문자형 올 수 있다 [실수형 불가능]
		case "s":// 값 : 숫자, '문자', "문자열"
			System.out.print("서울");
			break;
		case "d":
			System.out.print("대구");
			break;
		case "b":
			System.out.print("부산");
			break;
		case "j":
			System.out.print("제주");
			break;

		default: // 생략 가능함 - 에러 메세지 넣는 것 권장
			System.out.println("잘못 눌렀습니다. s,d,b,j 중 하나를 적으세요.");
			System.exit(0); // 프로그램 강제 종료
		}
		// switch end
		System.out.println("를(을) 선택하셨습니다.");
	}

}

//*

/*
 * package ex03.Switch;
 * 
 * import java.util.Scanner;
 * 
 * public class MainEntry { public static void main(String[] args) {
 * System.out.print("도시를 선택하세요 (s,d,b,j) =  "); String str = new
 * Scanner(System.in).next();
 * 
 * switch (str) { // Long 형을 제외한 정수형, 문자형 올 수 있다 [실수형 불가능] case "s":// 값 : 숫자,
 * '문자', "문자열" System.out.print("서울"); break; case "d": System.out.print("대구");
 * break; case "b": System.out.print("부산"); break; case "j":
 * System.out.print("제주"); break;
 * 
 * default: // 생략 가능함 - 에러 메세지 넣는 것 권장
 * System.out.println("잘못 눌렀습니다. s,d,b,j 중 하나를 적으세요."); System.exit(0); //프로그램
 * 강제 종료 } // switch end System.out.println("를(을) 선택하셨습니다."); }
 * 
 * } //
 */

/*
 * package ex03.Switch;* import java.util.Scanner;**
 * 
 * public class MainEntry { public static void main(String[] args) {
 * System.out.println("POINT = ?(1,2,3) "); int point = new
 * Scanner(System.in).nextInt();
 * 
 * switch (point) { // Long 형을 제외한 정수형, 문자형 올 수 있다 [실수형 불가능] case 1:// 값 : 숫자,
 * '문자', "문자열" System.out.println("포인트 점수 1점 입니다."); break; case 2:
 * System.out.println("포인트 점수 2점 입니다."); break; case 3:
 * System.out.println("포인트 점수 3점 입니다."); break;
 * 
 * default: //생략 가능함 - 에러 메세지 넣는 것 권장
 * System.out.println("없는 포인트를 넣으셨네요. 1,2,3 중 선택하세요"); } //switch end //
 * System.out.println("main end!!"); }** } //
 */