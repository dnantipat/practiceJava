package adapterPattern;

public class Electricity implements IOperation{
	private int usedUnit;
	private int unitPrice;
	
	public Electricity(int usedUnit, int unitPrice) {
		this.usedUnit = usedUnit;
		this.unitPrice = unitPrice;
	}

	public int getUsedUnit() {
		return usedUnit;
	}

	public void setUsedUnit(int usedUnit) {
		this.usedUnit = usedUnit;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public int getMonthlyCost() {
		return this.unitPrice*this.usedUnit;
	}
}
