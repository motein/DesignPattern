package singleton_pattern;

public class Singleton { // ����ģʽ���̲߳���ȫ

	private static Singleton instance;
	private Singleton (){}
	
	public static Singleton getInstance() {
		if (instance == null) { 
			instance  = new Singleton();
		}
		return instance;
	}
}
