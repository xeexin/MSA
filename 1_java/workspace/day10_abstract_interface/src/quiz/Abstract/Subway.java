package quiz.Abstract;

public class Subway extends Trans {

	@Override
	public void start(String name) {
		System.out.println("[" + name + "행] 지하철 출발");

	}

	@Override
	public void stop(String name) {
		System.out.println("[" + name + "행] 지하철 멈춤");
	}

}
