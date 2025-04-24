package ex04.networkTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest { // 소켓 두개 필요

	public static void main(String[] args) {

		ServerSocket ss = null;
		Socket s = null; // client socket

		System.out.println("[Server Start]");

		try {
			ss = new ServerSocket(9000); // 0 ~1024 포트 넘버는 예약되어 있음
			s = ss.accept(); // 응답 대기 Client socket
			// IO
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write

			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));

			System.out.println("보낼 문자열 입력 :");
			String msg = new Scanner(System.in).nextLine();
			os.write(msg.getBytes());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
