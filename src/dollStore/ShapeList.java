package dollStore;
import java.util.ArrayList;

public class ShapeList implements Iterator{
    private int index = 0;
    ArrayList<String> Shape = new ArrayList();
    public ShapeList(){
        this.Shape.add("A Normal Teddy               : 15.-");
        this.Shape.add("A Thin Teddy                 : 15.-");
        this.Shape.add("A Fat Teddy                  : 20.-");
    }

    
    public ArrayList<String> getMenu(){
        return  this.Shape;
    }
    
    public boolean hasnext(){
        if(this.index == this.Shape.size()){
            return false;
        }else{
            return true;
        }
    }
    
    public String next(){
        String output = this.Shape.get(this.index);
        this.index++;
        return output;
    }
}
    

