package singleton_pattern;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonClass instance1 = Singleton6.INSTANCE.getInstance();
        SingletonClass instance2 = Singleton6.INSTANCE.getInstance();
        System.out.println("instance1 == instance2: " + (instance1 == instance2));
	}

}
