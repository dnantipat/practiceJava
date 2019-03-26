package adapterPattern;

public class Marketing extends Staff {

    private int extraLanguage;
    private int extraLanguageRate;

    public Marketing(int overtime,int extraLanguage, int extraLanguageRate) {
        this.overtime=overtime;
        this.extraLanguage = extraLanguage;
        this.extraLanguageRate = extraLanguageRate;
    }

    public int getExtraLanguage() {
        return extraLanguage;
    }

    public void setExtraLanguage(int extraLanguage) {
        this.extraLanguage = extraLanguage;
    }

    public int getExtraLanguageRate() {
        return extraLanguageRate;
    }

    public void setExtraLanguageRate(int extraLanguageRate) {
        this.extraLanguageRate = extraLanguageRate;
    }
    @Override
    public int getPayment(){
        this.baseSalary=20000;
        this.rate=400;
        return this.baseSalary+(this.overtime*this.rate)+(this.extraLanguage*this.extraLanguageRate);
    }
    @Override
    public String getRole(){
        return "Marketing : ";
    }
}
