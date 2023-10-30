package sequences_10_30;

import java.util.ArrayList;
import sequences_10_30.printer.IntegersPrinter;

public class Main {

    final static int MAX = 1000;

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntegersPrinter printerStdOut = new IntegersPrinter();
        IntegersPrinter printerFile = new IntegersPrinter("integers.txt");
        //Integers
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= MAX; i++) {
            list.add(i);
        }
        printerStdOut.printIntegers(list);
        //Squares
        list.clear();
        for (int i = 1; i * i <= MAX; i++) {
            list.add(i * i);
        }
        printerFile.printIntegers(list);
        list.clear();
        //Primes
        for (int i = 1; i <= MAX; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        printerStdOut.printIntegers(list);
        //Fibonacci
    }
}
