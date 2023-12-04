package sequences_10_30.printer;

public class PrinterStdOut extends Printer {

    @Override
    protected void output(String str) {
        System.out.print(str);
    }
}
