package ex01.nonDI;

public class NewRecordView {
	// 필요한 객체를

	private NewRecord record; // 단지 선언

	// 생성자 함수를 통해서
	/*
	 * public NewRecordView() { record = new NewRecord(); // 객체 생성 }
	 */

	public NewRecordView(int kor, int eng, int math, int com) {
		record = new NewRecord(kor, eng, math, com); // 객체 생성
	}

	public void print() {
		System.out.println("KOR : " + record.getKor());
		System.out.println("TOTAL : " + record.total() + " AVG : " + record.avg());
		System.out.println("---------------------------------");
		record.disp();
		System.out.println(record);
	}

}
