package sequences_10_30.printer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class IntegersPrinter {
    private final static int MAX_IN_LINE = 15;
    String filename;
    
    public IntegersPrinter(){
        this.filename=null;
    }
    public IntegersPrinter(String filename){
        this.filename=filename;
    }
    
     private int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    public void printIntegers(ArrayList<Integer> list) {
        String output = "";
        for (int i = 0; i <list.size(); i++) {
            int n=list.get(i);
            output += Integer.toString(n);
            if (i < list.size()-1) {
                output += ", ";
            }
            int maxLength=getNumberOfDigits(Collections.max(list));
            for (int j = 0; j < maxLength - getNumberOfDigits(n); j++) {
                output += " ";
            }
            if ((i+1) % MAX_IN_LINE == 0) {
                output += "\n";
            }
        }
        output += "\n";
        if (filename!=null) {
            try (FileWriter fw = new FileWriter("output/"+filename);) {
                fw.write(output);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.print(output);
        }
    }
}
