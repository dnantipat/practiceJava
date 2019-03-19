package payroll;

public class Driver implements Payment {
    private int NoOfTrip;
    private int rate;

    public Driver(int noOfTrip, int rate) {
        this.NoOfTrip = noOfTrip;
        this.rate = rate;
    }

    public int getNoOfTrip() {
        return NoOfTrip;
    }

    public void setNoOfTrip(int noOfTrip) {
        NoOfTrip = noOfTrip;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return this.NoOfTrip*this.rate;
    }

    @Override
    public String getRole() {
        return "Driver : ";
    }
}
