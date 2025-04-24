package ex09.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileObjectLoad {
	public static void main(String[] args) throws IOException {

		String name = null;
		String id = null;
		String pwd = null;
		boolean gender = true;
		int age = 0;
		String phone = null;

		
		File f = new File("member.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);

			name = (String) ois.readObject();
			id = (String) ois.readObject();
			pwd = (String) ois.readObject();
			gender = (Boolean) ois.readObject();
			age = (Integer) ois.readObject();
			phone = (String) ois.readObject();

			System.out.println("\t\t\t >>> 회원 정보 <<< \n");
			System.out.println("이름 \t 아이디 \t\t 비밀번호 \t 성별 \t 나이 \t  전화번호   ");
			System.out.println();
			System.out.print(name + "\t" + id + "\t" + pwd + "\t");
			if (gender == true)
				System.out.print("남자");
			else
				System.out.print("여자");
			System.out.print("\t" + age + "\t" + phone);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ois.close();
			fis.close();

		}

	}
}
