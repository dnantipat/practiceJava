package template;

public abstract class ThreeDShape {
	public abstract double getBaseArea();
	public abstract double getHeight();
	
	public double getVolumeTemplate() {
		return getBaseArea()*getHeight();
	}
}
