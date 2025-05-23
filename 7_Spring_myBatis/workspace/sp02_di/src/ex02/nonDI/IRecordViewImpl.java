package ex02.nonDI;

import java.util.Scanner;

public class IRecordViewImpl implements IRecordView {

	private IRecordImpl recordImpl;

	// setter로 주입하기
	public void setRecordImpl(IRecordImpl recordImpl) {
		this.recordImpl = recordImpl;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("KOR : ");
		recordImpl.setKor(sc.nextInt());
		
		System.out.print("ENG : ");
		recordImpl.setEng(sc.nextInt());
		
		System.out.print("COM : ");
		recordImpl.setCom(sc.nextInt());
	}

	@Override
	public void print() {
		System.out.println("\n\nKOR : " + recordImpl.getKor());
		System.out.println("ENG : " + recordImpl.getEng());
		System.out.println("COM : " + recordImpl.getCom());
	}

}
