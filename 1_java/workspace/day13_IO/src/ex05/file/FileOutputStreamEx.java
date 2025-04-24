package ex05.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;

		try {
//			os = new FileOutputStream("memo.txt"); // 상대경로
			os = new FileOutputStream("C:/app/yuna.txt"); // 절대경로
//			os = new FileOutputStream("C:\\app\\yuna.txt"); // 절대경로

			while (true) {
				System.out.println("문자열을 입력해주세요 : ");
				String str = sc.nextLine() + "\r\n";

				// if (str.toUpperCase().equals("EXIT\r\n")) {
				if (str.equalsIgnoreCase("EXIT\r\n")) {
					System.out.println(str.length() + "byte만큼 썼습니다.");
					break;
				} // end if

				os.write(str.getBytes()); // -> 예외처리 해줘야함 (try -catch) //읽어들인 문자 Str의 길이(getByte())만큼 써주세요.
				System.out.println(str); // 화면 출력

			} // end while

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
