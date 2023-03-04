
package zad_prog_rozdz_7_zad_17;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Operacje na tablicy dwuwymiarowej
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_17 {

    public static void main(String[] args) {
        
        int[][] array = { { 1, 2, 3 }, 
                          { 4, 5, 6 },
                          { 7, 8, 9 } };
        
        JOptionPane.showMessageDialog(null, String.format("Suma wszystkich wartości z tablicy: %d\n"
                                                        + "Średnia wszystkich wartości z tablicy: %.2f\n"
                                                        + "Suma wszystkich wartości ze wskazanego wiersza: %d\n"
                                                        + "Suma wszystkich wartości ze wskazanej kolumny: %d\n"
                                                        + "Największa wartość ze wskazanego wiersza: %d\n"
                                                        + "Najmniejsza wartość ze wskazanego wiersza: %d",
                                                          getTotal(array), getAverage(array, getTotal(array)), 
                                                          getRowTotal(array, 2), getColTotal(array, 2),
                                                          getHighestInRow(array, 0), getLowestInRow(array, 0)));
    }
    
    private static int getTotal (int[][] aArray) {
        
        int total = 0;
        
        for (int row = 0; row < aArray.length; row++) {
            
            for (int col = 0; col < aArray[row].length; col++)
                
                total += aArray[row][col];
        }
        
        return total;
    }
    
    private static double getAverage (int[][] aArray, int aTotal) {
        
        return (double) aTotal / (double) aArray.length;
    }
    
    private static int getRowTotal (int[][] aArray, int indexRow) {
        
        int rowTotal = 0;

            for (int col = 0; col < aArray[indexRow].length; col++)
                
                rowTotal += aArray[indexRow][col];
        
        return rowTotal;
    }
    
    private static int getColTotal (int[][] aArray, int indexCol) {

        int colTotal = 0;
            
            for (int row = 0; row < aArray[indexCol].length; row++)
                
                colTotal += aArray[row][indexCol];

        return colTotal;
    }
    
    private static int getHighestInRow(int[][] aArray, int indexRow) {
        
        int highest = aArray[indexRow][0];
        
        for (int col = 1; col < aArray[indexRow].length; col++) {
            
            if (aArray[indexRow][col] > highest) {
                
                highest = aArray[indexRow][col];
            }
        }
            
        return highest;
    }
    
    private static int getLowestInRow(int[][] aArray, int indexRow) {
        
        int lowest = aArray[indexRow][0];
        
        for (int col = 1; col < aArray[indexRow].length; col++) {
            
            if (aArray[indexRow][col] < lowest) {
                
                lowest = aArray[indexRow][col];
            }
        }
            
        return lowest;
    }
}
