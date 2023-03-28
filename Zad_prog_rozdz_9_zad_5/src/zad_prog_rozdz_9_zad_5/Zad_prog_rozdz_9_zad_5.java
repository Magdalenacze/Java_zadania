
package zad_prog_rozdz_9_zad_5;

import javax.swing.JOptionPane;

/**
 * Sprawdzanie poprawności haseł
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_5 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Podaj hasło składające się z co najmniej: "
                                                       + "sześciu znaków, jednej wielkiej i małej litery, oraz jednej cyfry: ");
   
        while(!(CreatePassword.characterCountValidation(input) && CreatePassword.letterValidation(input) && CreatePassword.digitValidation(input))) {
                
            input = JOptionPane.showInputDialog(null, "Wprowadzone hasło nie spełnia wymaganych kryteriów!\n\n"
                                                    + "Podaj hasło składające się z co najmniej: sześciu znaków, "
                                                    + "jednej wielkiej i małej litery, oraz jednej cyfry: ");
        }
       
        JOptionPane.showMessageDialog(null, "Wprowadzone hasło spełnia wszystkie kryteria. Dziękuję!");
    }
}
