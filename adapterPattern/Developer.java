package adapterPattern;

public class Developer extends Staff {

    private int codingHour;
    private int codingRate;

    public Developer(int overtime, int codingHour, int codingRate) {
        this.overtime = overtime;
        this.codingHour = codingHour;
        this.codingRate = codingRate;
    }

    public int getCodingHour() {
        return codingHour;
    }

    public void setCodingHour(int codingHour) {
        this.codingHour = codingHour;
    }

    public int getCodingRate() {
        return codingRate;
    }

    public void setCodingRate(int codingRate) {
        this.codingRate = codingRate;
    }

    @Override
    public int getPayment() {
        this.baseSalary = 20000;
        this.rate = 300;
        int total = this.baseSalary + (this.rate * this.overtime) +
                (this.codingHour * this.codingRate);
        return total;
    }

    @Override
    public String getRole() {
        return "Dev : ";
    }
}
