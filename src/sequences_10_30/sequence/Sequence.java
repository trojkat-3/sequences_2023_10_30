package sequences_10_30.sequence;

import java.util.ArrayList;

abstract public class Sequence {
    
    protected int max = 1000;
    protected ArrayList<Integer> sequence = new ArrayList<>();
    private String name;
    
    public Sequence(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sequence: "+name+" ["+max+"]";
    }
    
    abstract void initialize();
    
}