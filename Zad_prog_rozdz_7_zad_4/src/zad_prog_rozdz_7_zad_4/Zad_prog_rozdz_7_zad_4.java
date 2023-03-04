
package zad_prog_rozdz_7_zad_4;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * Zmodyfikowane zadanie z kontem obciążeniowym
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_4 {

    public static void main(String[] args) throws IOException {
        
        DebitAccount da = new DebitAccount();
        
        boolean result;
        
        result = da.sequentialSearch(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj nr rachunku obciążeniowego w postaci 7 cyfr: ")));
        
        if (result) {
            
            JOptionPane.showMessageDialog(null, "Podany nr konta jest prawidłowy.");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Podany nr konta nie jest prawidłowy.");
        }
    }
}
