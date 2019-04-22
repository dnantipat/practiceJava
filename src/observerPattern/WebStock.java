package observerPattern;

public class WebStock implements IObserver{

	@Override
	public void update(double val) {
		System.out.println("Web Stock Update : " +val);
	}

}
