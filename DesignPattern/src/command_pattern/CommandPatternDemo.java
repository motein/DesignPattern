package command_pattern;

public class CommandPatternDemo { // 一种数据驱动的设计模式，它属于行为型模式。

	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.placeOrders();
	}

}
