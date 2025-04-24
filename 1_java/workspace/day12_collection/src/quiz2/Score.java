package quiz2;

public class Score {
	static int cnt = 1;
	int num = 0;
	String name;
	int kor, eng, com;
	int tot;
	double avg;
	char grade;

	public Score(String name, int kor, int eng, int com) {
		this.num = cnt++;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.tot = kor + eng + com;
		avg = tot / 3;
		grade = getGrade(tot);
	}

	private char getGrade(int tot2) {
		char ch;
		switch ((tot2 / 30)) {
		case 10:
		case 9: {
			ch = 'A';
			break;
		}
		case 8: {
			ch = 'B';
			break;
		}
		case 7: {
			ch = 'C';
			break;

		}
		case 6: {
			ch = 'D';
			break;

		}
		default:
			ch = 'F';
			break;
		}
		return ch;
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
