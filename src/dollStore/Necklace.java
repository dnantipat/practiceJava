package dollStore;

public class Necklace extends DollDecorator{
    public Necklace(Doll doll){
        super(doll,10);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Optional[Necklace] cost"+10);
    }
}
