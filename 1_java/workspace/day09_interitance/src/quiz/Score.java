package quiz;

import java.util.Scanner;

public class Score {
	int num;
	String name;
	int kor, eng, com, tot;
	double avg;
	char grade;

	// 생성자
//	public Score(int num, String name, int kor, int eng, int com) {
//		this.num = num;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.com = com;
//	}

	public Score() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		this.num = sc.nextInt();
		System.out.print("이름 입력 : ");
		this.name = sc.next();
		System.out.print("국어 성적 입력 : ");
		this.kor = sc.nextInt();
		System.out.print("영어 성적 입력 : ");
		this.eng = sc.nextInt();
		System.out.print("전산 성적 입력 : ");
		this.com = sc.nextInt();
	}

	// 메서드 (총합 구하기, 평균 구하기, 등급 구하기)
	public int sum() {
		this.tot = kor + eng + com;
		return tot;
	}

	public double calcAvg() {
		return sum() / 3;
	}

	public char calcGrade() {
		switch (tot / 30) {

		case 10:
		case 9: {

			grade = 'A';
			break;
		}
		case 8: {

			grade = 'B';
			break;
		}
		case 7: {

			grade = 'C';
			break;
		}
		case 6: {

			grade = 'D';
			break;
		}
		default:
			grade = 'F';
			break;
		}

		return grade;
	}

	public void disp() {
		System.out.printf("학번 : %d\t이름 : %s\t국어 : %d\t영어 : %d\t전산 : %d\n총점 : %d\t평균 : %.2f\t등급 : %c\n", num, name, kor, eng, com,
				sum(), calcAvg(),calcGrade());
	}

	// getter setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;

	}
}
