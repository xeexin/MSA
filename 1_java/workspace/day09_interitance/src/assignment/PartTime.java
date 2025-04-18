package assignment;

public class PartTime extends Employee {

	private int workingDay;
	private int sigeop;

	public PartTime(int workingDay, int sigeop) {
		super();
		this.workingDay = workingDay;
		this.sigeop = sigeop;
	}

	@Override
	public void disp() {
		super.disp();
		System.out.println("알바비 : " + calcPt());
	}

	public int calcPt() {
		return (this.workingDay * this.sigeop);
	}

}
