//import java.util.*;
public class Hilo{
    private int val;
    private int sum;
    private Dice d1;
    private Dice d2;

    public Hilo( int f) {
        sum = 0;
        val = f;
        d1 = new Dice( val );
        d2 = new Dice( val );
    }
    public void shack(){
        d1.roll();
        d2.roll();
        total();
    }
    public void total(){   
        sum = d1.getval() + d2.getval();
        show();
    }
    public void show(){
        if(sum < 6){
            System.out.println("LO");
        }
        else if (sum >= 6){
            System.out.println("HI");
        }
    }
}