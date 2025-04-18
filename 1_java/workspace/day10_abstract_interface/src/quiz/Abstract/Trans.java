package quiz.Abstract;

public abstract class Trans {

	public abstract void start(String name); //추상메서드

	public abstract void stop(String name);

	public void view() {
		System.out.println("SUPER CLASS TRANS!");
	}

}
