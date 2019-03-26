package adapterPattern;

public abstract class Staff implements IPayment{

    protected int baseSalary;
    protected int overtime;
    protected int rate;

    public int getBaseSalary() {
        return baseSalary;
    }
    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getRate() {
        return rate;
    }

    public abstract int getPayment();
    public abstract String getRole();

}
