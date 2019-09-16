package dollStore;

public class ThinDoll implements Doll{
    private int price;
    public ThinDoll(){
        price=15;
    }
    @Override
    public void assemble() {
        System.out.println("A Thin Teddy cost:"+price);
    }
    @Override
    public int totalPrice() {
        return price;
    }
}
