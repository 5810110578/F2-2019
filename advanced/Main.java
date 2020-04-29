import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList <Sprite> sprite = new ArrayList<Sprite>();
        Rectangle r1 = new Rectangle("R1", 2, 8);
        sprite.add(r1);
        sprite.add(new Rectangle("R2", 3, 5));
        sprite.add(new Circle("C1", 3));
        sprite.add(new Dot());
        ZoomAll(sprite,2.0);
        System.out.println("Area of "+ r1.getName()+" is "+r1.getWidth());
        System.out.println("Area of "+ r1.getName()+" is "+r1.getHeight());
        System.out.println("Area of "+ r1.getName()+" is "+r1.getArea());

    }
    public static void ZoomAll(ArrayList<Sprite> sprite, double factor){
        for(Sprite s : sprite ){
            if (s instanceof Zoomable){
                Zoomable z = (Zoomable) s;
                z.zoom(factor);
            }
        }
    }

}