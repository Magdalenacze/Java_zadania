
package zad_prog_rozdz_6_zad_16;

import javax.swing.JOptionPane;

/**
 * Kolory w ruletce
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_16 {

    public static void main(String[] args) {
        
        RoulettePocket rp = new RoulettePocket(Integer.parseInt(JOptionPane.showInputDialog(null, "Koło ruletki obejmuje przedziały o numerach od 0 do 36. Podaj wybrany numer przedziału: ")));
        
        while(rp.getNumber() < 0 || rp.getNumber() > 36) {
            
            rp.setNumber(Integer.parseInt(JOptionPane.showInputDialog(null, "Błędne dane wejściowe! Koło ruletki obejmuje przedziały o numerach od 0 do 36. Podaj wybrany numer przedziału: ")));
        }
        
        JOptionPane.showMessageDialog(null, "Przedział dla wybranego numeru ma kolor: " + rp.pocketColor());
    }
}
