public abstract class Shape{
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public abstract double getArea();
}