package sequences_10_30;

import sequences_10_30.exceptions.CantDecomposeException;
import sequences_10_30.exceptions.OutOfBoundsException;
import sequences_10_30.printer.Printer;
import sequences_10_30.printer.PrinterFile;
import sequences_10_30.printer.PrinterStdOut;
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
        Printer printerStdOut = new PrinterStdOut();
        Printer printerFile = new PrinterFile("integers.txt");

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
        try {
            System.out.println(sq.decompose(666));

            //Primes
            sq = new Primes();
            sq.setMax(10000);
            System.out.println(sq.decompose(30));
            printerStdOut.print(sq);
            printerFile.print(sq);

            //Fibonacci
            sq = new Fibonacci();
            System.out.println(sq.decompose(666));
            printerStdOut.print(sq);
            printerFile.print(sq);
        } catch (CantDecomposeException ex) {
            System.out.println(ex.getMessage());
        }

        sq = new Squares();
        printerStdOut.print(sq);

    }
}
