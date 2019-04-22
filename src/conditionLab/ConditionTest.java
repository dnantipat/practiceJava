package conditionLab;

public class ConditionTest {
    public String conditionName;
    public boolean condition;
    ConditionTest(String conditionName){
        this.conditionName = conditionName;
    }

    public boolean isCondition() {
        System.out.println(conditionName+" : "+condition);
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public String toString () {
        if (condition) {
            return conditionName+" is True.";
        } else {
            return conditionName+" is True.";
        }
    }
}
