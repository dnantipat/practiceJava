package dollStore;

public class Shirt extends DollDecorator{
    private String color;
    public Shirt(Doll doll,String color){
        super(doll,10);
        this.color = color;
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Optional["+color+"-Shirt] cost:"+10);
    }
}
