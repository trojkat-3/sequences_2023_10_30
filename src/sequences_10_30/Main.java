package sequences_10_30;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author xenon
 */
public class Main {

    final static int MAX = 20;
    final static int MAX_IN_LINE = 15;
    final static int MAX_LENGTH = getNumberOfDigits(MAX);

    private static int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        try {
            FileWriter fw = new FileWriter("output/integers.txt");
            fw.write("Data written to file");
            fw.close();

            for (int i = 1; i < MAX; i++) {
                fw.write(i);
                if (i < MAX - 1) {
                    System.out.print(", ");
                }
                if (getNumberOfDigits(i) < MAX_LENGTH) {
                    for (int j = 0; j < MAX_LENGTH - getNumberOfDigits(i); j++) {
                        System.out.print(" ");
                    }
                }
                if (i % MAX_IN_LINE == 0) {
                    System.out.print("\n");
                }
            }
            System.out.print("\n");
        } catch (IOException ex) {
            System.out.println("File not found");
            System.out.println(ex.getMessage());
        }
    }

}
