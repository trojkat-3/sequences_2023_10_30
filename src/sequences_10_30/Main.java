package sequences_10_30;

import java.util.ArrayList;
import sequences_10_30.printer.IntegersPrinter;

public class Main {

    final static int MAX = 1000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntegersPrinter printerStdOut=new IntegersPrinter();
        IntegersPrinter printerFile=new IntegersPrinter("integers.txt");
        //Integers
        ArrayList<Integer> list=new ArrayList();
        for (int i = 1; i <= MAX; i++) {
            list.add(i);
        }
        printerStdOut.printIntegers(list);
        //Squares
        list.clear();
        for (int i = 1; i*i <= MAX; i++) {
            list.add(i*i);
        }
        printerFile.printIntegers(list);
    }
}

