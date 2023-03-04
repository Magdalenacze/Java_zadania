
package zad_prog_rozdz_7_zad_15;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Dane o liczbie mieszkańców
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_15 {

    public static void main(String[] args) throws IOException {
        
        ArrayList<Integer> values = new ArrayList<>();

        getValues(values);
        
        JOptionPane.showMessageDialog(null, String.format("Średnia roczna zmiana liczby mieszkańców z danego okresu wynosi: %.2f.\n"
                                                        + "Rok z największym wzrostem liczby mieszkańców z danego okresu to: %d\n"
                                                        + "Rok z najmniejszym wzrostem liczby mieszkańców z danego okresu to: %d\n",
                                                           getSum(values)/(values.size()-1.0), getHighestIndex(values)+1950, getLowestIndex(values)+1950));
    }
    
    private static void getValues(ArrayList<Integer> aValues) throws IOException {
        
        File file = new File("USPopulation.txt");
        Scanner inputFile = new Scanner(file);

            while(inputFile.hasNext()) {

                aValues.add(Integer.parseInt(inputFile.nextLine()));
            }

        inputFile.close();
    }
    
    private static int getSum(ArrayList<Integer> aValues) {
        
        int total = 0;
        
        for (int index = 1; index < aValues.size(); index++) {
            
            total += aValues.get(index) - aValues.get(index - 1);
        }
        
        return total;
    }
    
    private static int getHighestIndex(ArrayList<Integer> aValues) {
        
        int highest = aValues.get(1) - aValues.get(0);
        int maxIndex = 0;
        
        for (int index = 2; index < aValues.size(); index++) {
            
            if ((aValues.get(index) - aValues.get(index - 1)) > highest) {
                
                highest = aValues.get(index) - aValues.get(index - 1);
                
                maxIndex = index - 1;
            }
        }
            
        return maxIndex;
    }
    
    private static int getLowestIndex(ArrayList<Integer> aValues) {
        
        int lowest = aValues.get(1) - aValues.get(0);
        int minIndex = 0;
        
        for (int index = 2; index < aValues.size(); index++) {
            
            if ((aValues.get(index) - aValues.get(index - 1)) < lowest) {
                
                lowest = aValues.get(index) - aValues.get(index - 1);
                
                minIndex = index - 1;
            }
        }
            
        return minIndex;
    }
}
