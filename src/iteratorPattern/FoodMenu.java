package iteratorPattern;

public class FoodMenu implements Iterator{
	private String[] menu;
	private int index;
	public FoodMenu(){
		menu = new String[]{"PAD THAI","TOM YUM KUN","STAR EGG"};
	}
	public String[] getMenu() {
		return menu;
	}
	public boolean hasnext() {
		if(index == menu.length)
			return false;
		else
			return true;
	}
	public String next() {
		return menu[index++];
	}
	public String toString() {
		return "_____Food Menu_____";
	}
}
