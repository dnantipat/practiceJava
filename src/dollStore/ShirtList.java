package dollStore;
import java.util.ArrayList;

public class ShirtList implements Iterator{
    private int index = 0;
    ArrayList<String> Shirt = new ArrayList();
    public ShirtList(){
        this.Shirt.add("Red Shirt                    : 10.-");
        this.Shirt.add("Yellow Shirt                 : 10.-");
        this.Shirt.add("Blue Shirt                   : 10.-");
        this.Shirt.add("Black Shirt                  : 10.-");
        this.Shirt.add("Pink Shirt                   : 10.-");
    }

    
    public ArrayList<String> getMenu(){
        return  this.Shirt;
    }
    
    public boolean hasnext(){
        if(this.index == this.Shirt.size()){
            return false;
        }else{
            return true;
        }
    }
    
    public String next(){
        String output = this.Shirt.get(this.index);
        this.index++;
        return output;
    }
}
    
