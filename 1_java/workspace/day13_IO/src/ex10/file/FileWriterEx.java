package ex10.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		String str, file;
		Date date = new Date();

		str = "파일 생성 시간\r\n" + date + "\r\n";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일 이름 입력하세요('파일명.확장자') : ");
		file = br.readLine();
		System.out.println("저장 할 문자열을 입력하세요 : ");
		str += br.readLine();

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(str);
		bw.close();

		System.out.println(file + " File을 성공적으로 저장했습니다. ");
	}

}
