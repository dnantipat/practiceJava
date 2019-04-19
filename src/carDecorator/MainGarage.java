package carDecorator;

public class MainGarage {

	public static void main(String[] args) {
		//basic 
		Car basicCar = new BasicCar();
		
		//Decorator
		Car luxuryCar =new LuxuryCar(basicCar);
		luxuryCar.assemble();
		System.out.println("______________________________________");
		//Decorator
		Car sportCar = new SportCar(basicCar);
		sportCar.assemble();

		System.out.println("______________________________________");
		
		Car superCar = new LuxuryCar(new SportCar(basicCar));
		superCar.assemble();
	}

}
