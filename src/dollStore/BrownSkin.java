package dollStore;

public class BrownSkin extends DollDecorator{
    public BrownSkin(Doll doll){
        super(doll,40);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Skin[Brown] cost:"+40);
    }
}
