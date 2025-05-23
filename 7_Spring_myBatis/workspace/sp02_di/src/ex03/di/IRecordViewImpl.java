package ex03.di;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class IRecordViewImpl implements IRecordView {

	private IRecordImpl record;

	public void setRecord(IRecordImpl record) {
		this.record = record;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("KOR : ");
		record.setKor(sc.nextInt());
		
		System.out.print("ENG : ");
		record.setEng(sc.nextInt());
		
		System.out.print("COM : ");
		record.setCom(sc.nextInt());
	}

	@Override
	public void print() {
		System.out.println("\n\nKOR : " + record.getKor());
		System.out.println("ENG : " + record.getEng());
		System.out.println("COM : " + record.getCom());
		
		System.out.println(record.total());
		System.out.println(record.avg());
	}

}
