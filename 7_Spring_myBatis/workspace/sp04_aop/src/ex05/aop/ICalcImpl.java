package ex05.aop;

public class ICalcImpl implements ICalc {

	@Override
	public int add(int x, int y) {
		// 보조관심(cross-cutting-concern)
		int ret = x + y;
		// 보조관심(cross-cutting-concern)
		System.out.println("add 주관심사");
		return ret;
	}

	@Override
	public int mul(int x, int y) {
		// 보조관심(cross-cutting-concern)
		int ret = x * y;
		// 보조관심(cross-cutting-concern)
		System.out.println("mul 주관심사");
		return ret;
	}

	@Override
	public int sub(int x, int y, int z) {
		
		if(y>x) {
			throw new IllegalArgumentException("y값이 x 보다 큽니다.");
		}
		
		// 보조관심(cross-cutting-concern)
		int ret = x - y - z;
		// 보조관심(cross-cutting-concern)
		System.out.println("sub 주관심사");
		return ret;
	}

}
