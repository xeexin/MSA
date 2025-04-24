package ex04.networkTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest { // 소켓 하나 필요
	public static void main(String[] args) {
		Socket s = null;

		// 192.168.230.23

		try {
			s = new Socket("192.168.230.41", 9000); // server IP & port number를 가지고 소켓 생성

			// IO
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write

			System.out.println("보낼 문자열을 입력하세요 : ");
			String str = new Scanner(System.in).nextLine();
			os.write(str.getBytes());

			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
