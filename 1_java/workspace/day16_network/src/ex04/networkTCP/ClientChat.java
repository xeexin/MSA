package ex04.networkTCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class ClientChat {
	public static void main(String[] args) throws IOException {

		//192.168.230.23
		
		int port = 8000;
		String ip, str;

		PrintStream ps = new PrintStream(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드로부터 입력 받기

		ps.print("접속할 서버 IP ====> ");
		ip = br.readLine();
		str = br.readLine();

		byte[] buffer = str.getBytes("UTF-8");
		String msg = new String(buffer, "UTF-8");

		Socket client = new Socket(ip, port);
		
		OutputStream out = client.getOutputStream(); //네트워크 통해서 출력 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
		
		bw.write(msg,0,msg.length());
		bw.flush();
		
		bw.close();
		client.close();
		ps.println("[" +ip +"에서 메세지 전송 성공]");
		ps.close();

	}

}
