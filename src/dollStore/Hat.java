package dollStore;

public class Hat extends DollDecorator{
    public Hat(Doll doll){
        super(doll,10);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Optional[Hat] cost"+10);
    }
}
