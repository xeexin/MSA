package ex04.networkTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		ServerSocket server = new ServerSocket(port);
		Socket client = null;

		System.out.println("[Chat Server Start]");

		while (true) {
			client = server.accept(); // 응답 대기
			InputStream in = client.getInputStream(); // 네트워크 통해서 읽기
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			PrintStream ps = new PrintStream(System.out);

			ps.print(client.getInetAddress().getHostAddress());
			String str = br.readLine();
			byte[] buffer = str.getBytes("UTF-8");
			String msg = new String(buffer, "utf-8");

			ps.println("                  : 에서 수신 메세지 ===> " + msg);
			
//			ps.close(); -> PrintStream은 닫으면 안됨!	
			br.close();
			client.close();
		} // end while

	}
}
