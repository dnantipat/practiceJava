package testCommand;

public class Rectangle implements Shape{
    int high;
    int width;
    Rectangle(int high,int width){
        this.width=width;
        this.high=high;
    }
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    public int getArea() {
        return high*width;
    }
}
