package template;
import java.util.ArrayList;
public class MainTemplate {
	public static void main(String[] args) {
		ArrayList<ThreeDShape> threeDShapes = new ArrayList<ThreeDShape>();
		threeDShapes.add(new Box(10,10,20));
		threeDShapes.add(new Cylinder(23,30));
		for(ThreeDShape threeDshape : threeDShapes)
			System.out.println("Volume of Shapes "+threeDshape.getClass()+ ":"+threeDshape.getVolumeTemplate());
	}	
}
