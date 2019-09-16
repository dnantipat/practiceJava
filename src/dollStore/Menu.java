package dollStore;

import java.util.ArrayList;

public class Menu {
    void shapeOfBodyMenu(){
        System.out.println("Pick shape of body");
        Iterator menu = new ShapeList();
        int index=1;
        while (menu.hasnext()){
            String item = menu.next();
            System.out.println((index++)+" ."+item);
        }
        System.out.print("Select:");
    }
    void skinToneMenu(){
        System.out.println("Pick color of body");
        Iterator menu = new SkinToneList();
        int index = 1;
        while (menu.hasnext()){
            String item = menu.next();
            System.out.println((index++)+" ."+item);
        }
        System.out.print("Select:");
    }
    void optionalMenu(){
        System.out.println("Pick optional");
        ArrayList<Iterator> allmenu = new ArrayList();
        Iterator shirtList = new ShirtList();
        Iterator optionalList = new OptionalList();
        allmenu.add(shirtList);
        allmenu.add(optionalList);
        int index = 0;
        System.out.println((index++)+". None");
        for(Iterator menu : allmenu) {
            while (menu.hasnext()) {
                String item = menu.next();
                System.out.println((index++)+". "+item);
            }
        }
        System.out.print("Select:");
    }
}
