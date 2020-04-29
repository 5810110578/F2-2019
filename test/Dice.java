//import java.util.*;
public class Dice{
    private int score;

    public Dice(int slot){
        score = 1;
    }
    public void roll(){
        score = (int)(Math.random() * 6 )+ 1;
    }
    public int getval(){
        return score;
    }
}