package dollStore;

public class CreamSkin extends DollDecorator{

    public CreamSkin(Doll doll){
        super(doll,50);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Skin[Cream] cost:"+50);
    }
}
