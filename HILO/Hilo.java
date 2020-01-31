//import java.util.*;
public class Hilo{
    private final int val;
    private int sum;
    private final Dice dice1;
    private final Dice dice2;

    public Hilo(final int num) {
        sum = 0;
        val = num;
        dice1 = new Dice( val );
        dice2 = new Dice( val );
    }
    public void play(){
        dice1.roll();
        dice2.roll();
        total();
    }
    public void total(){   
        sum = dice1.getval() + dice2.getval();
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