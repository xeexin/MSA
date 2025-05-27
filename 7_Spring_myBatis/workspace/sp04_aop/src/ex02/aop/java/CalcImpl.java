package ex02.aop.java;

public class CalcImpl implements Calc {

	@Override
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}

	@Override
	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	@Override
	public int sub(int x, int y, int z) {
		int ret = x - y - z;
		return ret;
	}

}
