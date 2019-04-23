package singleton;

public class Main {

	public static void main(String[] args) {
	Salary s1= Salary.getInstance();
	Salary s2= Salary.getInstance();
	s1.addSalary();
	s2.addSalary();

	}

}
