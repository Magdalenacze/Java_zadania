
package zad_prog_rozdz_5_zad_13;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Metoda isPrime
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_13 {

    public static void main(String[] args) {
        
        int number;
        
        Random randomNumbers = new Random();
        
        number = randomNumbers.nextInt(1000);
        
        if (isPrime(number)) {
            
            JOptionPane.showMessageDialog(null, "Wygenerowana losowo liczba całkowita " + number + " jest liczbą pierwszą.");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Wygenerowana losowo liczba całkowita " + number + " nie jest liczbą pierwszą.");
        }
    }
    
    public static boolean isPrime(int aNumber) {
        
        for (int count = 2; count < aNumber; count++) {
            
           if ((aNumber % count) == 0) {
               
               return false;
           }
        }
         return true; 
    }
}
