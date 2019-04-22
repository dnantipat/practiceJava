package observerPattern;

public class Main {

	public static void main(String[] args) {
		StockSubject subject = new StockSubject();
		IObserver web = new WebStock();
		IObserver mobile = new MobileStock();
		
		subject.register(web);
		subject.register(mobile);
		subject.updateStock(1.0);
		subject.updateStock(1.21);
		subject.updateStock(1.4);
		subject.updateStock(1.5);
	}

}
