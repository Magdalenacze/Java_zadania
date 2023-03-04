
package zad_prog_rozdz_5_zad_15;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Licznik liczb parzystych i nieparzystych
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_15 {

    public static void main(String[] args) {
        
        int licznik = 0;
        
        Random randomNumbers = new Random();
        
        for (int count = 1; count <= 100; count++) {
        
            if (isEven(randomNumbers.nextInt())) {

                licznik++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Liczb parzystych wylosowano " + licznik + ".\nLiczb nieparzystych wylosowano " + (100 - licznik) + ".");
    }
    public static boolean isEven(int aNumber) {

        if ((aNumber % 2) == 0) {
            
            return true;
        }
        else {
            
            return false;
        }
    }
}
