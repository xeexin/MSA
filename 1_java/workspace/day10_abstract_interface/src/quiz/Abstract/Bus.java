package quiz.Abstract;

public class Bus extends Trans {

	@Override
	public void start(String name) {
		System.out.println("버스가 [" + name + "] 정류소에서 출발합니다.");

	}

	@Override
	public void stop(String name) {
		System.out.println("버스가 [" + name + "] 정류소에서 정차합니다.");

	}
}
