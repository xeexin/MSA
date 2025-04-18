package assignment;

public class MainEntry {
	public static void main(String[] args) {

		Employee emp = new Employee(1, "heejin", "digital", 52239091);
		emp.disp();

		System.out.println("-------------------");
		System.out.println("-------------------");

		Regular reg = new Regular(2, "hj", "it", 1234, 900);
		reg.disp();
		System.out.
		println("-------------------");
		Regular reg2 = new Regular();
		reg2.disp();
		System.out.println("-------------------");
		Regular reg3 = new Regular(3,"puding","marketing",12345678);
		reg3.disp();

		System.out.println("-------------------");
		System.out.println("-------------------");

		Sales sales = new Sales(0.5);
		sales.disp();

		System.out.println("-------------------");
		PartTime pt = new PartTime(20, 10000);
		pt.disp();

	}
}
