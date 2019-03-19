package payroll;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Payment> staffs = new ArrayList();

        Developer dev1 = new Developer(15,5,5000);
        staffs.add(dev1);

        Developer dev2 = new Developer(35,4,2000);
        staffs.add(dev2);

        Developer dev3 = new Developer(-5,1,4000);
        staffs.add(dev3);

        CEO ceo1 = new CEO(5,10000);
        staffs.add(ceo1);

        Driver driver1=new Driver(3,1000);
        staffs.add(driver1);

        Cleaner cleaner1=new Cleaner(15,300);
        staffs.add(cleaner1);
        int totalPayment = 0;
        for (Payment staff: staffs) {
            System.out.println(staff.getRole()+staff.getPayment());
            totalPayment += staff.getPayment();
        }
        System.out.print("Total:");
        System.out.println(totalPayment);
    }
}
