public class Ex04 {
    public static void main(String[] agrs){
        /*try{
            Thread.sleep(2000);
            System.out.println("OK!");
        }catch(InterruptedException e){

        }*/String s  = "s";
        try{
            int v = Integer.parseInt(s);
            System.out.print(v);
        }catch(NumberFormatException e){
            System.out.println("Invalid !");
        }finally{
            System.out.println("Donel");
        }
    }

}