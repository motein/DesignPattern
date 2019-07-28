package singleton_pattern;

class SingletonClass {
    int i = 0;
    public SingletonClass() {
        System.out.println("SingletonClass被初始化 " + ++i + " 次");
    }
}

public enum Singleton6 {
	INSTANCE;
	private SingletonClass instance;
	Singleton6() {
        this.instance = new SingletonClass();
        System.out.println("枚举类构造函数");
    }
	
	public SingletonClass getInstance() {
        return this.instance;
    }
}
