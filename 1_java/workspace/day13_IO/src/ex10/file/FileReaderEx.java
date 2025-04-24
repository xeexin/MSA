package ex10.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {

		int i = 0;
		String file;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("읽어 올 파일 이름 입력해주세요. ('파일명.확장자') : ");
		file = br.readLine();

		System.out.println("문서 내용은 -------------------------------------");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);

		while ((i = reader.read()) != -1) {
			System.out.print((char) i + " ");
			if (fr.equals("\n"))
				System.out.println();
		}

		fr.close();
	}

}
