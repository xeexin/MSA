package ex09.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class FileObjectSave {
	public static void main(String[] args) throws IOException {
		String name = null;
		String id = null;
		String pwd = null;
		boolean gender = true;
		int age = 0;
		String phone = null;
		String temp = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		File f = new File("member.txt");

		try {
			FileOutputStream fos = new FileOutputStream(f, true); // append mode-> 안하면 계속 덮어씀
			oos = new ObjectOutputStream(fos);

			System.out.println("--------------------회원 정보 입력하기-----------------------");

			System.out.print("name >> ");
			name = br.readLine();

			System.out.print("id >> ");
			id = br.readLine();

			System.out.print("pwd >> ");
			pwd = br.readLine();

			System.out.print("gender(m,f) >> ");
			temp = br.readLine();
			if (temp.toLowerCase().equals("m"))
				gender = true;
			else
				gender = false;

			System.out.print("age >> ");
			age = Integer.parseInt(br.readLine());

			System.out.print("phone number >> ");
			phone = br.readLine();

			oos.writeObject(name);
			oos.writeObject(id);
			oos.writeObject(pwd);
			oos.writeObject(gender);
			oos.writeObject(age);
			oos.writeObject(phone);

			System.out.println("Member.txt saved");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
		}

	}

}
