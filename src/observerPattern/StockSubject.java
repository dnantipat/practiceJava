package observerPattern;
import java.util.ArrayList;
public class StockSubject {
	private ArrayList<IObserver> observers;
	private double val;
	public StockSubject() {
		observers = new ArrayList<IObserver>(); 
	}
	public void register(IObserver obs) {
		observers.add(obs);
	}
	public void unregister(IObserver obs) {
		observers.remove(obs);
	}
	
	public void notifyObserver() {
		for(IObserver obs:observers)
			obs.update(val);
	}
	public void updateStock(double val) {
		System.out.println("Stock Updated");
		this.val = val;
		this.notifyObserver();
	}
	
}
