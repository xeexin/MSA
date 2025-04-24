package ex03.io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) throws IOException { //예외 처리 위임하기 (JVM에게 위임)

		InputStream is = System.in; // 표준입력

		System.out.print("단일 문자 입력 : ");

		int su = is.read() - 48; // 예외 처리 필요 read는 int값 리턴해야함.
//			System.out.println((char) su);

		is.read(); // 여기서 엔터를 입력 받아볼까?
		is.read(); // 여기서 엔터를 입력 받아볼까? 왜냐 2byte니까 두번 받자!

		int su2 = is.read() - 48;

//			System.out.println(su); // 아스키 코드 값 출력
		System.out.println(su + su2);

	}
}
