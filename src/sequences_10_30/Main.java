package sequences_10_30;

import java.util.ArrayList;
import sequences_10_30.printer.IntegersPrinter;

public class Main {

    final static int MAX = 1000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Integers
        ArrayList<Integer> list=new ArrayList();
        for (int i = 1; i <= MAX; i++) {
            list.add(i);
        }
        IntegersPrinter.printIntegers(list);
        //Squares
        list.clear();
        for (int i = 1; i*i <= MAX; i++) {
            list.add(i*i);
        }
        IntegersPrinter.printIntegers(list);
    }
}

