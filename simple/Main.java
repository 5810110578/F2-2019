import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle("R1", 2, 8));//16
        shapes.add(new Rectangle("R2", 3, 5));//15
        shapes.add(new Circle("C1", 3));//28.27

        double total = 0.0;
        for(Shape shape : shapes){
            total += shape.getArea();
        }
        System.out.printf("Total area = %.2f \n", total);
    }
}