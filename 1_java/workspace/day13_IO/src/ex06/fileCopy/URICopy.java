package ex06.fileCopy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class URICopy {
	public static void main(String[] args) throws MalformedInputException, IOException {

		URL url = new URL("https://i.pinimg.com/736x/c5/44/dd/c544dd602617106132b1c2fadab602ba.jpg");

		// 읽기 객체
		InputStream is = url.openStream();

		// 쓰기 객체
		OutputStream os = new FileOutputStream("pinterest.jpg");

		byte[] buffer = new byte[1024 * 8];

		while (true) {
			int inputData = is.read(buffer);
			if (inputData == -1)
				break;
			os.write(buffer, 0, inputData);
		}
		os.close();
		is.close();
		
		
		System.out.println("웹에서 파일 복사 성공했습니다. ");
	}
}
