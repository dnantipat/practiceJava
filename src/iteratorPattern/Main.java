package iteratorPattern;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * FoodMenu foodMenu = new FoodMenu(); DrinkMenu drinkMenu = new DrinkMenu();
		 * 
		 * String[] foods = foodMenu.getMenu();
		 * System.out.println("Food Menu-------------------"); for(int
		 * i=0;i<foods.length;i++) { System.out.println(foods[i]); }
		 * System.out.println("Drink Menu-------------------"); ArrayList<String> drinks
		 * = drinkMenu.getMenu(); for(String drink :drinks) { System.out.println(drink);
		 * }
		 */
		System.out.println("\n\n======ITERATOR========");
		Iterator foodMenu = new FoodMenu();
		Iterator drinkMenu = new DrinkMenu();
		/*
		 * for(;foodMenu.hasnext();) {//noob System.out.println(foodMenu.next()); }
		 * for(;drinkMenu.hasnext();) { System.out.println(drinkMenu.next()); }
		 */
		ArrayList<Iterator> allmenu = new ArrayList<Iterator>();
		allmenu.add(foodMenu);
		allmenu.add(drinkMenu);
		for (Iterator menu : allmenu) {
			System.out.println(menu);
			while (menu.hasnext())
				System.out.println(menu.next());
			
		}
	}

}
