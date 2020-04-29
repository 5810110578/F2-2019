public class Counter{
    private int initial;
    private int value;
    public Counter(){
        this(0);
    }
    public Counter(int initial){
        this.initial = initial;
        this.value = initial;

    }
    public void count(){
        value++;
    }
    public int getValue(){
        return value;
    }
    public void reset(){
        value = initial;
    }
}