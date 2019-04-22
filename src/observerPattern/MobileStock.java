package observerPattern;

public class MobileStock implements IObserver{

	@Override
	public void update(double val) {
		System.out.println("Mobile Stock Update : "+val);
		
	}

}
