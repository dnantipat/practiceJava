package template;

public class Box extends ThreeDShape {
	private final double width;
	private final double height;
	private final double length;
	public Box(double width,double length,double height) {
		this.width = width;
		this.height =height;
		this.length =length;
	}
	@Override
	public double getBaseArea() {
		return width*height*length;
	}

	@Override
	public double getHeight() {
		return height;
	}

}
