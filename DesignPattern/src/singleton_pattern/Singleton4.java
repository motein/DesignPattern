package singleton_pattern;

public class Singleton4 { // 双检锁模式，安全且多线程下保持高性能
	private volatile static Singleton4 singleton;
	private Singleton4 (){}
	
	public static Singleton4 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}
