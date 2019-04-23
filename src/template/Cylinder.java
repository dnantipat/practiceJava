package template;

public class Cylinder extends ThreeDShape {
	private final double radius;
	private final double height;
	
	public Cylinder(double radius,double height) {
		this.radius = radius;
		this.height =height;
	}

	@Override
	public double getBaseArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double getHeight() {
		return height;
	}

}
