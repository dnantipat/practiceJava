package adapterPattern;
public class OperationAdapter implements IPayment{
	private IOperation adaptee;
	public OperationAdapter(IOperation adaptee) {
		this.adaptee = adaptee;
	}
	@Override
	public int getPayment() {
		return adaptee.getMonthlyCost();
	}
	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return "electricity cost : ";
	}
	
}
