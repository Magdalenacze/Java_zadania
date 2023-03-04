
package zad_prog_rozdz_7_zad_12_13;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Posortowana lista cen benzyny z 1994 r.
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_12_13 {

    public static void main(String[] args) throws IOException {
        
        ArrayList<Double> values = new ArrayList<>();
        
        ArrayList<String> months = new ArrayList<>();
        
        double[] sum = new double[12];
       
        getValues(values);

        getSum(values, sum);
        
        getMonths(values, months);
        
        getFiles(values, months);

        JOptionPane.showMessageDialog(null, String.format("Najniższa średnia cena z roku to: %.3f $, wystąpiła w %d tygodniu roku, w miesiącu: %s\n"
                                                        + "Najwyższa średnia cena z roku to: %.3f $, wystąpiła w %d tygodniu roku, w miesiącu: %s\n"
                                                        + "Średnia cena benzyny w styczniu: %.3f $\n"
                                                        + "Średnia cena benzyny w lutym: %.3f $\n"
                                                        + "Średnia cena benzyny w marcu: %.3f $\n"
                                                        + "Średnia cena benzyny w kwietniu: %.3f $\n"
                                                        + "Średnia cena benzyny w maju: %.3f $\n"
                                                        + "Średnia cena benzyny w czerwcu: %.3f $\n"
                                                        + "Średnia cena benzyny w lipcu: %.3f $\n"
                                                        + "Średnia cena benzyny w sierpniu: %.3f $\n"
                                                        + "Średnia cena benzyny we wrześniu: %.3f $\n"
                                                        + "Średnia cena benzyny w październiku: %.3f $\n"
                                                        + "Średnia cena benzyny w listopadzie: %.3f $\n"
                                                        + "Średnia cena benzyny w grudniu: %.3f $",
                                                          getLowest(values), getLowestIndex(values), months.get(getLowestIndex(values)),
                                                          getHighest(values), getHighestIndex(values), months.get(getHighestIndex(values)),
                                                          sum[0]/4, sum[1]/4, sum[2]/5, sum[3]/4,
                                                          sum[4]/4, sum[5]/4, sum[6]/5, sum[7]/5,
                                                          sum[8]/4, sum[9]/5, sum[10]/4, sum[11]/4));
    }
        
    private static void getValues(ArrayList<Double> aValues) throws IOException {
        
        File file = new File("1994_Weekly_Gas_Averages.txt");
        Scanner inputFile = new Scanner(file);

            while(inputFile.hasNext()) {

                aValues.add(Double.parseDouble(inputFile.nextLine()));
            }

        inputFile.close();
    }
    
    private static void getSum(ArrayList<Double> aValues, double[] aSum) {
        
        for (int index = 0; index < aValues.size(); index++) {
            
            if (index >= 0 && index <= 3) {
                
                aSum[0] += aValues.get(index);
            }
            else if (index >= 4 && index <= 7) {
                
                aSum[1] += aValues.get(index);
            }
            else if (index >= 8 && index <= 12) {
                
                aSum[2] += aValues.get(index);
            }
            else if (index >= 13 && index <= 16) {
                
                aSum[3] += aValues.get(index);
            }
            else if (index >= 17 && index <= 20) {
                
                aSum[4] += aValues.get(index);
            }
            else if (index >= 21 && index <= 24) {
                
                aSum[5] += aValues.get(index);
            }
            else if (index >= 25 && index <= 29) {
                
                aSum[6] += aValues.get(index);
            }
            else if (index >= 30 && index <= 34) {
                
                aSum[7] += aValues.get(index);
            }
            else if (index >= 35 && index <= 38) {
                
                aSum[8] += aValues.get(index);
            }
            else if (index >= 39 && index <= 43) {
                
                aSum[9] += aValues.get(index);
            }
            else if (index >= 44 && index <= 47) {
                
                aSum[10] += aValues.get(index);
            }
            else if (index >= 48 && index <= 51) {
                
                aSum[11] += aValues.get(index);
            }
            else {

            }
        }
    }
    
    private static String getMonths(ArrayList<Double> aValues, ArrayList<String> aMonths) {
        
        for (int index = 0; index < aValues.size(); index++) {
            
            if (index >= 0 && index <= 3) {
                
                aMonths.add("Styczeń");
            }
            else if (index >= 4 && index <= 7) {
                
                aMonths.add("Luty");
            }
            else if (index >= 8 && index <= 12) {
                
                aMonths.add("Marzec");
            }
            else if (index >= 13 && index <= 16) {
                
                aMonths.add("Kwiecień");
            }
            else if (index >= 17 && index <= 20) {
                
                aMonths.add("Maj");
            }
            else if (index >= 21 && index <= 24) {
                
                aMonths.add("Czerwiec");
            }
            else if (index >= 25 && index <= 29) {
                
                aMonths.add("Lipiec");
            }
            else if (index >= 30 && index <= 34) {
                
                aMonths.add("Sierpień");
            }
            else if (index >= 35 && index <= 38) {
                
                aMonths.add("Wrzesień");
            }
            else if (index >= 39 && index <= 43) {
                
                aMonths.add("Październik");
            }
            else if (index >= 44 && index <= 47) {
                
                aMonths.add("Listopad");
            }
            else if (index >= 48 && index <= 51) {
                
                aMonths.add("Grudzień");
            }
            else {

                return "";
            }
        }
        
    return "";
    
    }

    private static double getHighest(ArrayList<Double> aValues) {
        
        double highest = aValues.get(0);

            for (int index = 1; index < aValues.size(); index++) {

                if (aValues.get(index) > highest) {

                    highest = aValues.get(index);
                }
            }

            return highest;
    }
        
    private static int getHighestIndex(ArrayList<Double> aValues) {
        
        double highest = aValues.get(0);
        int maxIndex = 0;
        
        for (int index = 1; index < aValues.size(); index++) {
            
            if (aValues.get(index) > highest) {
                
                highest = aValues.get(index);
                
                maxIndex = index;
            }
        }
        
        return maxIndex;
    }
    
    private static double getLowest(ArrayList<Double> aValues) {
        
    double lowest = aValues.get(0);
        
        for (int index = 1; index < aValues.size(); index++) {
            
            if (aValues.get(index) < lowest)
                
                lowest = aValues.get(index);
        }
        
        return lowest;
    }
    
    private static int getLowestIndex(ArrayList<Double> aValues) {

        double lowest = aValues.get(0);
        int minIndex = 0;

            for (int index = 1; index < aValues.size(); index++) {

                if (aValues.get(index) < lowest) {

                    lowest = aValues.get(index);
        
                    minIndex = index;
                }
            }

            return minIndex;
        }
    
    private static void getFiles(ArrayList<Double> aValues, ArrayList<String> aMonths) throws IOException {

        String month = "Styczeń";
        
        String filename = month + ".txt";
        
        PrintWriter outputFile = new PrintWriter(filename);
        
        for (int i = 1; i < aValues.size(); i++) {
                
            if (month != aMonths.get(i)) {
                
                outputFile.close();
                
                month = aMonths.get(i);
                
                filename = month + ".txt";
                
                outputFile = new PrintWriter(filename);
            }
            
            outputFile.println(aValues.get(i));
        }
            
        outputFile.close();
    }
}

    

