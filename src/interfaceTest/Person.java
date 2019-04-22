package interfaceTest;

public class Person implements Human{
    private String name;
    private int old;
    private String gender;
    public Person(String name,int old,String gender){
        this.name = name;
        this.old = old;
        this.gender = gender;
    }
    @Override
    public void eat() {
        System.out.println(name+" is Eating");
    }

    @Override
    public void run() {
        System.out.println(name+" is Running");
    }

    @Override
    public void walk() {
        System.out.println(name+" is Walking");
    }
}
