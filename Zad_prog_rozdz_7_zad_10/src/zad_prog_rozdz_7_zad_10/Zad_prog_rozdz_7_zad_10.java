
package zad_prog_rozdz_7_zad_10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Średnia liczba zrobionych kroków
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_10 {

    public static void main(String[] args) throws IOException {
        
        ArrayList<Integer> values = new ArrayList<>();

        int[] sum = new int[12];

        getValues(values);

        getSum(values, sum);

        JOptionPane.showMessageDialog(null, String.format("Średnia liczba kroków w styczniu: %.0f\n"
                                                        + "Średnia liczba kroków w lutym: %.0f\n"
                                                        + "Średnia liczba kroków w marcu: %.0f\n"
                                                        + "Średnia liczba kroków w kwietniu: %.0f\n"
                                                        + "Średnia liczba kroków w maju: %.0f\n"
                                                        + "Średnia liczba kroków w czerwcu: %.0f\n"
                                                        + "Średnia liczba kroków w lipcu: %.0f\n"
                                                        + "Średnia liczba kroków w sierpniu: %.0f\n"
                                                        + "Średnia liczba kroków we wrześniu: %.0f\n"
                                                        + "Średnia liczba kroków w październiku: %.0f\n"
                                                        + "Średnia liczba kroków w listopadzie: %.0f\n"
                                                        + "Średnia liczba kroków w grudniu: %.0f",
                                                          sum[0]/31.0, sum[1]/28.0, sum[2]/31.0, sum[3]/30.0,
                                                          sum[4]/31.0, sum[5]/30.0, sum[6]/31.0, sum[7]/31.0,
                                                          sum[8]/30.0, sum[9]/31.0, sum[10]/30.0, sum[11]/31.0));
    }
        
    private static void getValues(ArrayList<Integer> aValues) throws IOException {
        
        File file = new File("steps.txt");
        Scanner inputFile = new Scanner(file);

            while(inputFile.hasNext()) {

                aValues.add(Integer.parseInt(inputFile.nextLine()));
            }

        inputFile.close();
    }
    
    private static void getSum(ArrayList<Integer> aValues, int[] aSum) {
        
        for (int index = 0; index < aValues.size(); index++) {
            
            if (index >= 0 && index <= 30) {
                
                aSum[0] += aValues.get(index);
            }
            else if (index >= 31 && index <= 58) {
                
                aSum[1] += aValues.get(index);
            }
            else if (index >= 59 && index <= 89) {
                
                aSum[2] += aValues.get(index);
            }
            else if (index >= 90 && index <= 119) {
                
                aSum[3] += aValues.get(index);
            }
            else if (index >= 120 && index <= 150) {
                
                aSum[4] += aValues.get(index);
            }
            else if (index >= 151 && index <= 180) {
                
                aSum[5] += aValues.get(index);
            }
            else if (index >= 181 && index <= 211) {
                
                aSum[6] += aValues.get(index);
            }
            else if (index >= 212 && index <= 242) {
                
                aSum[7] += aValues.get(index);
            }
            else if (index >= 243 && index <= 272) {
                
                aSum[8] += aValues.get(index);
            }
            else if (index >= 273 && index <= 303) {
                
                aSum[9] += aValues.get(index);
            }
            else if (index >= 304 && index <= 333) {
                
                aSum[10] += aValues.get(index);
            }
            else if (index >= 334 && index <= 364) {
                
                aSum[11] += aValues.get(index);
            }
            else {

            }
        }
    }    
}
