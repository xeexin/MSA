package quiz.Abstract;

public class Bicycle extends Trans {

	@Override
	public void start(String name) {
		System.out.println("자전거가 [" + name + "]에서 출발합니다.");
	}

	@Override
	public void stop(String name) {
		System.out.println("자전거가 [" + name + "]에서 멈춥니다.");

	}

}
