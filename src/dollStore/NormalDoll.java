package dollStore;

public class NormalDoll implements Doll{
    private int price;
    public NormalDoll(){
        price = 15;
    }
    @Override
    public void assemble() {
        System.out.println("A Normal Teddy cost:"+price);
    }
    @Override
    public int totalPrice() {
        return price;
    }
}
