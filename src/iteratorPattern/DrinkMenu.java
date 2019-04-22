package iteratorPattern;

import java.util.ArrayList;

public class DrinkMenu implements Iterator {
	private ArrayList<String> menu;
	private int index;
	public DrinkMenu() {
		menu = new ArrayList<String>();
		menu.add("TEA");
		menu.add("COKE");
		menu.add("COFFEE");
		menu.add("ORANGE JUICE");
	}

	public ArrayList<String> getMenu() {
		return menu;
	}

	@Override
	public boolean hasnext() {
		if (index == menu.size())
			return false;
		else
			return true;
	}

	@Override
	public String next() {
		return menu.get(index++);
	}
	public String toString() {
		return "_____Drink Menu_____";
	}

}
