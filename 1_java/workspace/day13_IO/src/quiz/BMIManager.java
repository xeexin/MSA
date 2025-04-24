package quiz;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BMIManager {

	ArrayList<BMIClass> arr = new ArrayList<BMIClass>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void add() throws IOException {
		System.out.print("이름을 입력하세요 : ");
		String name = br.readLine();

		System.out.print("성별을 입력하세요 [M/F] : ");
		String temp = br.readLine();
		Boolean gender;
		if (temp.equalsIgnoreCase("m")) {
			gender = true;
		} else {
			gender = false;
		}

		System.out.print("신장을 입력하세요 : ");
		double height = Double.parseDouble(br.readLine());

		System.out.print("체중을 입력하세요 : ");
		double weight = Double.parseDouble(br.readLine());

		String ret = getBMI(height, weight);

		arr.add(new BMIClass(name, gender, height, weight, ret));

	}

	public String getBMI(double height, double weight) {
		double bmi = weight / ((height / 100) * (height / 100));

		if (bmi < 18.5)
			return "저체중";

		else if (bmi >= 18.5 && bmi < 23)
			return "정상";

		else if (bmi >= 23 && bmi < 25)
			return "과체중";
		else
			return "비만";

	}

	public void delete() throws IOException {
		// 이름을 찾아서 삭제
		System.out.print("삭제할 이름을 입력하세요 : ");
		String deleteName = br.readLine();
		display();

		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x).getName().equals(deleteName)) {
				arr.remove(x);
			}
		}

	}

	public void display() {
		// 리스트 출력
		for (int x = 0; x < arr.size(); x++) {
			System.out.println(arr.get(x).toString());
		}

	}

	public void set() throws IOException {
		// 이름을 찾아서 수정
		display();
		System.out.print("수정할 이름을 입력하세요 : ");
		String setName = br.readLine();

		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x).getName().equals(setName)) {

				System.out.print("수정할 이름을 다시 입력하세요 : ");
				String name = br.readLine();
				arr.get(x).setName(name);

				System.out.print("수정할 성별을 다시 입력하세요 [M/F] : ");
				String temp = br.readLine();
				Boolean gender;
				if (temp.equalsIgnoreCase("m")) {
					gender = true;
				} else {
					gender = false;
				}
				arr.get(x).setGender(gender);

				System.out.print("신장을 입력하세요 : ");
				double height = Double.parseDouble(br.readLine());
				arr.get(x).setHeight(height);

				System.out.print("체중을 입력하세요 : ");
				double weight = Double.parseDouble(br.readLine());
				arr.get(x).setWeight(weight);

				String ret = getBMI(height, weight);
				arr.get(x).setRet(ret);

			}
		}

	}

	public void saveFile() throws IOException {

		File file = new File("BMI.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		String name = null;
		Boolean gender = null;
		double weight = 0.0;
		double height = 0.0;
		String ret = null;

		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			for (BMIClass bmi : arr) {
				name = bmi.getName();
				gender = bmi.getGender();
				weight = bmi.getWeight();
				height = bmi.getHeight();
				ret = bmi.getRet();
				
				
				oos.writeObject(name);
				oos.writeObject(gender);
				oos.writeObject(height);
				oos.writeObject(weight);
				oos.writeObject(ret);
			}

			System.out.println("파일 저장 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
			fos.close();
		}

	}

	public void loadFile() throws IOException, ClassNotFoundException {

		File file = new File("bmi.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		String name = null;
		Boolean gender = null;
		double weight = 0.0;
		double height = 0.0;
		String ret = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			System.out.println("    >> 사람 정보 << \n");
			System.out.println("이름 \t 성별 \t 키 \t 몸무게 \t bmi");

			while (true) {
				name = (String) ois.readObject();
				gender = (Boolean) ois.readObject();
				height = (Double) ois.readObject();
				weight = (Double) ois.readObject();
				ret = (String) ois.readObject();
				System.out.print(name + "\t" + gender + "\t" + height + "\t" + weight + "\t" + ret + "\r\n");
			}

		} catch (EOFException e) {
			System.out.println("파일 로드 완료");
		} finally {
			fis.close();
			ois.close();
		}
	}

}
