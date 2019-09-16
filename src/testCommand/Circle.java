package testCommand;

import java.sql.SQLOutput;

public class Circle implements Shape {
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public int getArea() {
        return Math.PI*radius*radius;
    }
}
