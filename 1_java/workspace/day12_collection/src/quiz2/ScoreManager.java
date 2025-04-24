package quiz2;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManager extends Score {

	static ArrayList<Score> arr = new ArrayList<Score>();
	static Scanner sc= new Scanner(System.in);

	public ScoreManager(String name, int kor, int eng, int com) {
		super(name, kor, eng, com);
		// TODO Auto-generated constructor stub

	}

	public static void add() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("국어 성적을 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 성적을 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("전산 성적을 입력하세요 : ");
		int com = sc.nextInt();

		Score score = new ScoreManager(name, kor, eng, com);
		arr.add(score);
	}

	public static void show() {
		System.out.printf("[학생 수 : %d]\n", arr.size());
		for (int x = 0; x < arr.size(); x++) {
			System.out.println("------------------------------------------------------");
			System.out.printf("학생 번호 : %d\t이름 : %s\t국어점수 : %d\t영어점수 : %d\t전산점수 : %d\n총점 : %d\t평균 : %.2f\t등급 : %c\n",
					arr.get(x).getNum(), arr.get(x).getName(), arr.get(x).getKor(), arr.get(x).getEng(),
					arr.get(x).getCom(), arr.get(x).getTot(), arr.get(x).getAvg(), arr.get(x).getGrade());
		}
	}

	public static void delete() {
		show();
		System.out.print("삭제할 학생의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int x=0;x<arr.size();x++) {
			arr.remove(num-1);
		}
		
	}

	public static void set() {
		show();
		System.out.print("수정할 학생의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int x=0;x<arr.size();x++) {
			if(arr.get(x).equals(num-1)) {
				String name = sc.next();
				arr.get(x).setName(name);
			}
		}
	}

}
