package singleton_pattern;

public class Singleton2 { // 懒汉模式，线程安全

	private static Singleton2 instance;
	private Singleton2() {}
	
	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		
		return instance;
	}
}
