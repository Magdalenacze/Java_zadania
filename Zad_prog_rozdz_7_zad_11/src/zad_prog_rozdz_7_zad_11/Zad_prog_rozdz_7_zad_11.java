
package zad_prog_rozdz_7_zad_11;

import javax.swing.JOptionPane;

/**
 * Operacje na tablicach
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_11 {

    public static void main(String[] args) {
        
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        JOptionPane.showMessageDialog(null, String.format("Suma wartości z tablicy wynosi: %d\n" +
                                                          "Średnia wartość z tablicy wynosi: %.1f\n" +
                                                          "Największa wartość z tablicy wynosi: %d\n" +
                                                          "Najmniejsza wartość z tablicy wynosi: %d\n",
                                                          getTotal(array),
                                                          getAverage(array),
                                                          getHighest(array),
                                                          getLowest(array)));
    }
    
    private static int getTotal(int[] array) {

        int total = 0;

        for (int index = 0; index < array.length; index++)
            
            total += array[index];

        return total;
    }
    
    private static double getAverage(int[] array) {
        
        return getTotal(array) / (double) array.length;
    }
    
    private static int getHighest(int[] array) {
        
        int highest = array[0];
        
        for (int index = 1; index < array.length; index++) {
            
            if (array[index] > highest) {
                
                highest = array[index];
            }
        }
        
        return highest;
    }
    
    private static int getLowest(int[] array) {
        
        int lowest = array[0];
        
        for (int index = 1; index < array.length; index++) {
            
            if (array[index] < lowest)
                
                lowest = array[index];
        }
        
        return lowest;
    }
}
