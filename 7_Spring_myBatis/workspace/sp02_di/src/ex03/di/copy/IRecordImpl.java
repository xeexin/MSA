package ex03.di.copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IRecordImpl implements IRecord { // DTO

	private int kor, eng, com;

	@Override
	public int total() {
		return kor + eng + com;
	}

	@Override
	public float avg() {
		return total() / 3.0f;
	}

}
