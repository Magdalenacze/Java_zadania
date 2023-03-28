
package zad_prog_rozdz_9_zad_11;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Analiza sprzedaży
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_11 {

    public static void main(String[] args) throws IOException {

        double[][] sale = twoDimensionalArray(separation(openingTheFile()));
        
        double[] weekly = weeklyTotal(sale);
        
        for (int count = 0; count < weekly.length; count++) {
            
            String values = "Łączna wartość sprzedaży z " +  (count + 1) + " tygodnia wynosi: " + weekly[count] + "\n";
        }
        
        JOptionPane.showMessageDialog(null,  + "\n" 
                                          + "Średnia dzienna wartość sprzedaży z każdego tygodnia: " +  + "\n" 
                                          + "Łączna wartość sprzedaży ze wszystkich tygodni: " +  + "\n" 
                                          + "Średnia tygodniowa wartość sprzedaży: " +  + "\n" 
                                          + "Numer tygodnia z najwyższą wartością sprzedaży: " +  + "\n"
                                          + "Numer tygodnia z najniższą wartością sprzedaży: " + );
    }
    
    private static String openingTheFile() throws IOException {
            
        File file = new File("SalesData.txt");
        Scanner inputFile = new Scanner(file);
        
        String input = "";
        
        while (inputFile.hasNext()) {
            
            input += inputFile.nextLine() + "\n";
        }
        
        inputFile.close();
        
        return input;
    }
    
    private static String[] separation(String input) {
    
        String[] tokens = input.split(",");
        
        return tokens;
    }
    
    private static double[][] twoDimensionalArray(String[] tokens) {
        
        double array[][] = new double[3][7];
        
        for (int row = 0; row < 3; row++) {
            
            for (int col = 0; col < 7; col++) {
                
                array[row][col] = Double.parseDouble(tokens[row*7 + col]);
            }
        }
        
        return array;
    }

    private static double[] weeklyTotal(double[][] sale) {
        
        double[] weekly = new double[3];
        
        for (int row = 0; row < sale.length; row++) {
            
            weekly[row] = 0.00;
            
            for (int col = 0; col < sale[row].length; col++) {
                
                weekly[row] += sale[row][col];
            }
        }
 
        return weekly;
    }
    
    private static double[] dailyWeeklyAverage(double[] weekly) {
        
        double[] daily = new double[3];
        
        for (int index = 0; index < weekly.length; index++) {
            
            daily[index] = weekly[index] / 7;
        }

        return daily;
    }
    
    private static double getTotal(double[] weekly) {
        
        double total = 0.00;
        
        for (int index = 0; index < weekly.length; index++) {
            
            total += weekly[index];
        }
        
        return total;
    }
    
    private static double getAverage(double[] weekly, double total) {
 
        double average = 0.00;
        
        average = total / weekly.length;
        
        return average;
    }
    
    private static double getHighest() {
        
        
    }
}
