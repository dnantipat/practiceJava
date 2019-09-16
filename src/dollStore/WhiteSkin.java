package dollStore;

public class WhiteSkin extends DollDecorator{
    public WhiteSkin(Doll doll){
        super(doll,60);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Skin[white] cost:"+60);
    }

}
