public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }
    public void setwidth(double width){
        this.width = width;
    }
    public double getwidth(){
        return width;
    }
    public void setheight(double height){
        this.height = height;
    }
    public double getheight(){
        return height;
    }
    public double getArea(){
        return width * height;
    }
    public static void main (String [] args){
        Rectangle c = new Rectangle("R1", 2, 3);//6
        System.out.println("Area of " + c.getname() + " is " + c.getArea());
    }
}