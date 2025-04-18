package ex04.quiz;

public class Sawoen {
	// 사번, 이름, 직급, 부서, 급여, 연락처
	// 생성자 함수 -3개
	// getter setter
	// output method

	private int id;
	private String name;
	private String jigeop;
	private String dept;
	private int sal;
	private int phone;

	// 생성자 함수 3개 정도,,,
	public Sawoen() {
		this(1, "gildong", "manager", "-", 2000000, 123456789);

	}

	public Sawoen(String jigeop, String dept, int sal) {
		this.jigeop = jigeop;
		this.dept = dept;
		this.sal = sal;

	}

	public Sawoen(int id, String name, String jigeop, String dept, int sal, int phone) {
		this.id = id;
		this.name = name;
		this.jigeop = jigeop;
		this.dept = dept;
		this.sal = sal;
		this.phone = phone;

	}

	// getter setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJigeop() {
		return jigeop;
	}

	public void setJigeop(String jigeop) {
		this.jigeop = jigeop;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void disp() {
		System.out.printf("사번 %d\t이름 %s\t직급 %s\t부서 %s\t월급 %d\t핸드폰번호 %d\n", id, name, jigeop, dept, sal, phone);

	}

}
