package payroll;

public class Cleaner implements Payment {
    private int DayOfWork;
    private int rate;

    public Cleaner(int dayOfWork, int rate) {
        this.DayOfWork = dayOfWork;
        this.rate = rate;
    }

    public int getDayOfWork() {
        return DayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        DayOfWork = dayOfWork;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return this.DayOfWork*this.rate;
    }

    @Override
    public String getRole() {
        return "Cleaner : ";
    }
}
