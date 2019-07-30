package business_delegate_pattern;

public class BusinessDelegatePatternDemo { // 对表示层和业务层解耦。

	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		Client client = new Client(businessDelegate);
		client.doTask();
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
