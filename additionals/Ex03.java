public class Ex03 {
    public static void main(String []args){
        String s  = "s";
        try{
            int v = Integer.parseInt(s);
            Thread.sleep(2000);
            System.out.print(v);
        }catch(NumberFormatException e1){
            System.out.println("Invalid !");
        }/*catch(InterruptedException e2){

        }*/catch(Exception e3){

        }
    }

}