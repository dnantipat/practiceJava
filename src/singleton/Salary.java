package singleton;

public class Salary {
	private double salary;
	private static Salary ss = new Salary();
	private Salary() {
		salary = 15000;
		System.out.println("set salary = "+salary);
	}
	public static Salary getInstance() {
		return ss;
	}
	public void addSalary() {
		salary+=1000;
		System.out.println("add salary>>"+salary);
	}
}
