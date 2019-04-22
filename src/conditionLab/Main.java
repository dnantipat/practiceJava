package conditionLab;

public class Main {
    public static void main(String[] args){
        ConditionTest conA = new ConditionTest("A");
        ConditionTest conB = new ConditionTest("B");
        ConditionTest conC = new ConditionTest("C");
        ConditionTest conD = new ConditionTest("D");
        ConditionTest conE = new ConditionTest("E");
        conA.setCondition(true);
        conB.setCondition(false);
        conC.setCondition(false);
        conD.setCondition(true);
        conE.setCondition(true);

        if(conA.isCondition()&&conB.isCondition()||conC.isCondition()&&conA.isCondition()){
            System.out.println("Hey");
        }
    }
}
