public class Circle extends Shape{//pi*radius
    private double radius;
    public Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }
    public void setradius(double radius){
        this.radius = radius;
    }
    public double getradius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public static void main (String [] args){
        Circle c = new Circle("C1", 2);//12.56
        System.out.println("Area of " + c.getname() + " is " + c.getArea());
    }

}