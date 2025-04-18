package assignment;

public class Sales extends Regular {

	private double commission;

	public Sales(double commission) {
		super();
		this.commission = commission;
	}

	@Override
	public void disp() {
		super.disp();
		System.out.println("커미션 : " + calcComission());
	}

	public double calcComission() {
		commission *= this.salary;
		return commission;
	}

}
