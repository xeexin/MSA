package ex02.nonDI;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IRecordImpl implements IRecord {

	private int kor, eng, com;

	public IRecordImpl() {
		this(0, 0, 0);
	}

	public IRecordImpl(int kor, int eng, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}

	@Override
	public int total() {
		return kor + eng + com;
	}

	@Override
	public float avg() {
		return total() / 3.0f;
	}

}
