public class Ex05 {
    private static String p;
    public static void main(String []args){
      //  p = "Hello";
        try{
            doIt();
        }catch(Exception e){
            System.out.println("Something wrong");
        }
    }
    public static void doIt(){
        if(p == null){
            throw new IllegalStateException("p must be defined first");
        }
        System.out.println(p.length());
    }

}