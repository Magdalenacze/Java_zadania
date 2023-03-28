
package zad_prog_rozdz_9_zad_9;

import javax.swing.JOptionPane;

/**
 * Suma cyfr w łańcuchu znaków
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_9 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Podaj dowolną serię jednocyfrowych liczb bez żadnego separatora (np. 123456): ");
        
        char[] array = input.toCharArray();
        
        JOptionPane.showMessageDialog(null, "Suma wszystkich podanych liczb wynosi: " + sumOfValues(array) + "\n"
                                          + "Najmniejsza cyfra wśród podanych to: " + minValue(array) + "\n"
                                          + "Największa cyfra wśród podanych to: " + maxValue(array));
    }
    
    private static int sumOfValues(char[] array) {
        
        int total = 0;
        
        for (int index = 0; index < array.length; index++) {
            
            if (Character.isDigit(array[index])) {
            
                total += Integer.parseInt(String.valueOf(array[index]));
            }
        }
        
        return total;
    }
    
    private static int minValue(char[] array) {
        
        int lowest = Integer.parseInt(String.valueOf(array[0]));
        
        for (int index = 1; index < array.length; index++) {
            
            if (Integer.parseInt(String.valueOf(array[index])) < lowest) {
                
                lowest = Integer.parseInt(String.valueOf(array[index]));
            }
        }
        
        return lowest;
    }
    
    private static int maxValue(char[] array) {
        
        int highest = Integer.parseInt(String.valueOf(array[0]));
        
        for (int index = 1; index < array.length; index++) {
            
            if (Integer.parseInt(String.valueOf(array[index])) > highest) {
                
                highest = Integer.parseInt(String.valueOf(array[index]));
            }
        }
        
        return highest;
    }
}
