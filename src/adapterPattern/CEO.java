package adapterPattern;

public class CEO extends Staff {

    private int experiencePoint;
    private int experienceRate;

    public CEO(/*int overtime,*/int experiencePoint, int experienceRate) {
        //this.overtime=overtime;
        this.experiencePoint = experiencePoint;
        this.experienceRate = experienceRate;
    }

    public int getExperiencePoint() {
        return experiencePoint;
    }

    public void setExperiencePoint(int experiencePoint) {
        this.experiencePoint = experiencePoint;
    }

    public int getExperienceRate() {
        return experienceRate;
    }

    public void setExperienceRate(int experienceRate) {
        this.experienceRate = experienceRate;
    }

    @Override
    public int getPayment() {
        this.baseSalary = 100000;
        this.rate = 5000;
        int total = this.baseSalary + /*(this.rate * this.overtime) +*/
                (this.experiencePoint * this.experienceRate);
        return total;
    }
    @Override
    public String getRole(){
        return "CEO : ";
    }
}
