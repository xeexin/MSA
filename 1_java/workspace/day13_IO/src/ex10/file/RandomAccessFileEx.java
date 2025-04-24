package ex10.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw"); // rw : 해당 파일 없으면 생성하면서 write해 줌! (있으면 기존 파일에
																		// 기재)

		for (int x = 0; x <= 100; x++) {
			raf.seek(x * 100);
			String str = "Hello " + x;
//			raf.writeUTF(str);
			raf.writeInt(x);
		}

		for (int x = 0; x <= 100; x++) {
			raf.seek(x * 100);
//			System.out.println(raf.readUTF());
			System.out.println(raf.readInt());
		}
		
		System.out.println("Stirng print Success~");
		raf.close();

	}

}
