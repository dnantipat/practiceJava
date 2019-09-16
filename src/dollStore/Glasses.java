package dollStore;

public class Glasses extends DollDecorator{
    public Glasses(Doll doll){
        super(doll,10);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Optional[Glass] cost"+10);
    }
}
