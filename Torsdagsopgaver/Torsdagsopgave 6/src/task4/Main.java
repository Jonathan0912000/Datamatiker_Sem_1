package task4;

public class Main {
    public static void main(String[] args) {

        shapeBuilder shapeBuilder = new shapeBuilder();

        Circle circle = new Circle(15.0);
        Square square = new Square(5.0);

        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println(circle.getArea());
        System.out.println(square.getArea());

        double totalArea = shapeBuilder.getTotalArea();
        System.out.println(totalArea);

    }
}
