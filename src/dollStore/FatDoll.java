package dollStore;

public class FatDoll implements Doll{
    private int price;
    public FatDoll(){
        price=20;
    }
    @Override
    public void assemble() {
        System.out.println("A Fat Teddy cost:"+price);
    }

    @Override
    public int totalPrice() {
        return price;
    }
}
