package dollStore;

public class DollDecorator implements Doll {
    protected Doll doll;
    protected int totalPrice;
    public DollDecorator(Doll doll,int totalPrice){
        this.doll=doll;
        this.totalPrice=totalPrice;
    }

    @Override
    public void assemble() {
        doll.assemble();
    }
    @Override
    public int totalPrice() {
        return doll.totalPrice()+totalPrice;
    }
}
