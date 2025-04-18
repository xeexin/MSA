package assignment;

public class Employee {
	// 사번, 이름, 부서, 연락처
	int id;
	String name;
	String dept;
	int phone;

	// 생성자
	public Employee() {
		this.id = 0;
		this.name = "hong gildong";
		this.dept = "NOT FOUND";
		this.phone = 0000;

	}

	public Employee(int id, String name, String dept, int phone) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
	}

	// 메서드
	public void disp() {
		System.out.println("사번 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
		System.out.println("전화번호 : " + phone);
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
