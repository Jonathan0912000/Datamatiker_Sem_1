package task4;

import java.util.ArrayList;

public class shapeBuilder {

    private final ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s){
        shapes.add(s);
    }

    public double getTotalArea(){
        double totalArea = 0;
        for(Shape s : shapes){
            totalArea += s.getArea();
        }
        return totalArea;

    }

}
