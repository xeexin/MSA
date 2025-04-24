package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMIMAIN {

	static BMIManager bm = new BMIManager();

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("1.입력 , 2:삭제, 3:출력, 4:수정, 5:파일 저장, 6:파일 불러오기,  7:종료 : ");
			int num = Integer.parseInt(br.readLine());

			switch (num) {
			case 1: {
				bm.add();
				System.out.println("추가되었습니다.");

				break;

			}
			case 2: {
				bm.delete();
				System.out.println("삭제되었습니다.");
				break;

			}
			case 3: {
				bm.display();
				break;

			}case 5: {
				bm.saveFile();
				break;
				
			}case 6:{
				bm.loadFile();
				break;
			}
			case 4: {
				bm.set();
				System.out.println("수정되었습니다.");

				break;

			}
			case 7: {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			default:
				System.out.println("올바른 번호를 입력하세요. ");
				break;
			}

		}

	}

}
