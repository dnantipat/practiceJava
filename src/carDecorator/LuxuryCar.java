package carDecorator;

public class LuxuryCar extends CarDecorator {
	
	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Added Features of Luxury Car");
	}


}
	