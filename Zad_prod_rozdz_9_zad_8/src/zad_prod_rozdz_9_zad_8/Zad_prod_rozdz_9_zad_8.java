
package zad_prod_rozdz_9_zad_8;

import javax.swing.JOptionPane;

/**
 * Suma liczb z łańcucha znaków
 * @author Magdalena
 */
public class Zad_prod_rozdz_9_zad_8 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Podaj dowolną serię liczb całkowitych rozdzielonych przecinkami, bez spacji (np. 1,2,3,4,5,6): ");
        
        String[] tokens = input.split(",");
        
        int total = 0;
        
        for (String s : tokens) {

            total += Integer.parseInt(s);
        }
        
        JOptionPane.showMessageDialog(null, "Suma wszystkich podanych liczb wynosi: " + total);
    }
}
