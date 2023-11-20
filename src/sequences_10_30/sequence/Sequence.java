package sequences_10_30.sequence;

import java.util.ArrayList;

abstract public class Sequence {
    
    protected int max = 1000;
    protected ArrayList<Integer> sequence = new ArrayList<>();
    private String name;
    
    public Sequence(String name){
        this.name=name;
    }
    
    /**
     * Compute the sum of n initial elements in the sequence
     * @param n ...
     * @return sum of n initial elements
     */
    public int getSum(int n){
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=sequence.get(i);
        }
        return sum;
    }
    
    public void setMax(int max){
        this.max=max;
        sequence.clear();
        initialize();
    }
    
    public ArrayList<Integer> getSequence(){
        return sequence;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sequence: "+name+" [max: "+max+"]";
    }
    
    abstract void initialize();
    
}
