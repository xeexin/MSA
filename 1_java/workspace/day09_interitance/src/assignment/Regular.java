package assignment;

public class Regular extends Employee {

	protected int salary; // 정규직 급여

	public Regular() {
		super();
		this.salary = 250; // 안 적을 시 기본급 250
	}

	public Regular(int id, String name, String dept, int phone) {
		super(id, name, dept, phone);
		this.salary=250;
		
	}

	public Regular(int salary) {
		super();
		this.salary = salary;
	}

	public Regular(int num, String name, String dept, int phone, int salary) {
		super(num, name, dept, phone);
		this.salary = salary;
	}

	@Override
	public void disp() {
		super.disp();
		System.out.println("급여 : " + salary);
	}

}
