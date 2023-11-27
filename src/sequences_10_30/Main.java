package sequences_10_30;

import java.util.ArrayList;
import sequences_10_30.exceptions.OutOfBoundsException;
import sequences_10_30.printer.IntegersPrinter;
import sequences_10_30.sequence.Arithmetic;
import sequences_10_30.sequence.Fibonacci;
import sequences_10_30.sequence.Integers;
import sequences_10_30.sequence.Primes;
import sequences_10_30.sequence.Sequence;
import sequences_10_30.sequence.Squares;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntegersPrinter printerStdOut = new IntegersPrinter();
        IntegersPrinter printerFile = new IntegersPrinter("integers.txt");

        //Integers
        Sequence sq = new Integers();
        printerStdOut.print(sq);
        printerFile.print(sq);

        sq = new Fibonacci(1, 3);
        printerStdOut.print(sq);
        printerFile.print(sq);

        try {
            System.out.println("SUM: " + sq.getSum(40));

            sq = new Arithmetic(1, 3);
            printerStdOut.print(sq);
            printerFile.print(sq);

            System.out.println("SUM: " + sq.getSum(4));
        } catch (OutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        //Squares
        sq = new Squares();
        printerStdOut.print(sq);
        printerFile.print(sq);

        //Primes
        sq = new Primes();
        sq.setMax(10000);
        printerStdOut.print(sq);
        printerFile.print(sq);

        //Fibonacci
        sq = new Fibonacci();
        printerStdOut.print(sq);
        printerFile.print(sq);

    }
}
