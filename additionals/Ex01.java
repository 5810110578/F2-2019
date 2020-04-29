public class Ex01{
    public static void main(String []args){
        String s  = "s";
        try{
            int v = Integer.parseInt(s);
            System.out.print(v);
        }catch(NumberFormatException e){
            System.out.println("Invalid !");
        }
    }
}