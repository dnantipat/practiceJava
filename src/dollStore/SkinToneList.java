package dollStore;
import java.util.ArrayList;

public class SkinToneList implements Iterator{
    private int index = 0;
    ArrayList<String> Skintone = new ArrayList();
    public SkinToneList(){
        this.Skintone.add("Brown                 : 40.-");
        this.Skintone.add("Cream                 : 50.-");
        this.Skintone.add("White                 : 60.-");
    }

    
    public ArrayList<String> getMenu(){
        return  this.Skintone;
    }
    
    public boolean hasnext(){
        if(this.index == this.Skintone.size()){
            return false;
        }else{
            return true;
        }
    }
    
    public String next(){
        String output = this.Skintone.get(this.index);
        this.index++;
        return output;
    }
}
    
