package dollStore;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Doll> dolls = new ArrayList<Doll>();
        Scanner src = new Scanner(System.in);
        Scanner Start = new Scanner(System.in);

        while (true){
            System.out.println("Add : A\n" +
                    "History : H");
            String start = Start.nextLine();
            if(start.equalsIgnoreCase("A")){
                Menu menu = new Menu();
                Command showShapeOfBodyMenu = new ShowShapeOfBodyMenu(menu);
                Command showColorOfBodyMenu = new ShowSkinToneMenu(menu);
                Command showOptionalMenu = new ShowOptionalMenu(menu);


                showShapeOfBodyMenu.execute();
                String choice =src.nextLine();
                Doll doll = DollFactory.createDollBody(choice);

                showColorOfBodyMenu.execute();
                choice =src.nextLine();
                doll = DollFactory.createDollColor(choice,doll);

                showOptionalMenu.execute();
                choice =src.nextLine();
                doll = DollFactory.createDollOptional(choice,doll);
                doll.assemble();
                System.out.println("Total price :"+doll.totalPrice());
                System.out.println("Confirm (Y/N)");
                if(src.nextLine().equalsIgnoreCase("y")){
                    dolls.add(doll);
                    System.out.println("The doll was ordered.");
                }

                else
                    System.out.println("The order was canceled");
            }if(start.equalsIgnoreCase("H")){
                int index=1;
                for(Doll doll:dolls){
                    System.out.println("Order:"+index++);
                    doll.assemble();
                    System.out.println("Total price :"+doll.totalPrice());
                    System.out.println("-------------------------------------------");
                }
            }

        }


    }
}
