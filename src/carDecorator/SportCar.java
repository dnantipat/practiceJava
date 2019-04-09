package carDecorator;

public class SportCar extends CarDecorator {

	public SportCar(Car car) {
		super(car);
	}
	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Added Features of Sport Car");
	}
	
}
