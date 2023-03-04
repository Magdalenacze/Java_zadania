
package zad_prog_rozdz_7_zad_3;

import javax.swing.JOptionPane;

/**
 * Sprawdzanie poprawności rachunku obciążeniowego
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_3 {

    public static void main(String[] args) {
        
        boolean result;
        
        DebitAccount da = new DebitAccount();
        
        result = da.sequentialSearch(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj nr rachunku obciążeniowego w postaci 7 cyfr: ")));
        
        if (result) {
            
            JOptionPane.showMessageDialog(null, "Podany nr konta jest prawidłowy.");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Podany nr konta nie jest prawidłowy.");
        }
    }
}

