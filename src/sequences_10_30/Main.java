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
    
    private static int Fibonacci(int n, ArrayList<Integer> list){
        if (n<=1){
            return n;
        } else if (n<list.size()){
            return list.get(n);
        } else {
            return Fibonacci(n-1, list)+Fibonacci(n-2, list);
        }
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
        printerStdOut.print(list, "Integers");
        printerFile.print(list, "Integers");
        //Squares
        list.clear();
        for (int i = 1; i * i <= MAX; i++) {
            list.add(i * i);
        }
        printerStdOut.print(list, "Squares");
        printerFile.print(list, "Squares");
        list.clear();
        //Primes
        for (int i = 1; i <= MAX; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        printerStdOut.print(list, "Primes");
        printerFile.print(list, "Primes");
        //Fibonacci
        list.clear();
        int i=0;
        int fib;
        while((fib=Fibonacci(i, list))<=MAX){
            list.add(fib);
            i++;
        }
        printerStdOut.print(list, "Fibonacci numbers");
        printerFile.print(list, "Fibonacci numbers");
        
    }
}








