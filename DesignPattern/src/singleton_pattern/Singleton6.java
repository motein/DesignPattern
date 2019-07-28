package singleton_pattern;

class SingletonClass {
    int i = 0;
    public SingletonClass() {
        System.out.println("SingletonClass����ʼ�� " + ++i + " ��");
    }
}

public enum Singleton6 {
	INSTANCE;
	private SingletonClass instance;
	Singleton6() {
        this.instance = new SingletonClass();
        System.out.println("ö���๹�캯��");
    }
	
	public SingletonClass getInstance() {
        return this.instance;
    }
}
