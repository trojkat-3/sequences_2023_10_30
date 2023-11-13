package sequences_10_30;

import java.util.ArrayList;
import sequences_10_30.printer.IntegersPrinter;
import sequences_10_30.sequence.Integers;
import sequences_10_30.sequence.Sequence;

public class Main {



    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntegersPrinter printerStdOut = new IntegersPrinter();
        IntegersPrinter printerFile = new IntegersPrinter("integers.txt");
        


        //Integers
        
       
        printerStdOut.print(list, "Integers");
        printerFile.print(list, "Integers");
        //Squares
        list.clear();
        
        printerStdOut.print(list, "Squares");
        printerFile.print(list, "Squares");
        list.clear();
        //Primes
        
        printerStdOut.print(list, "Primes");
        printerFile.print(list, "Primes");
        //Fibonacci
        list.clear();
        
        printerStdOut.print(list, "Fibonacci numbers");
        printerFile.print(list, "Fibonacci numbers");
        
    }
}








