package ex04.di;

public class Singleton {
	private Singleton() {
	}

	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

}
