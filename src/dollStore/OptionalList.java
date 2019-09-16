package dollStore;
import java.util.ArrayList;

public class OptionalList implements Iterator{
    private int index = 0;
    ArrayList<String> Optional = new ArrayList();
    public OptionalList(){
        this.Optional.add("Hat                     : 10.-");
        this.Optional.add("Glasses                 : 10.-");
        this.Optional.add("Necklace                : 10.-");
    }

    
    public ArrayList<String> getMenu(){
        return  this.Optional;
    }
    
    public boolean hasnext(){
        if(this.index == this.Optional.size()){
            return false;
        }else{
            return true;
        }
    }
    
    public String next(){
        String output = this.Optional.get(this.index);
        this.index++;
        return output;
    }
}
    
