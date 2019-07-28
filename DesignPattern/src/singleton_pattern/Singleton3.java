package singleton_pattern;

public class Singleton3 { // ����ģʽ
	private static Singleton3 instance = new Singleton3();
	private Singleton3 (){}
	
	public static Singleton3 getInstance() {
		return instance;
	}
}
