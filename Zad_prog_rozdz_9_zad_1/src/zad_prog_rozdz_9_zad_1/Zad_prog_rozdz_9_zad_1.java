
package zad_prog_rozdz_9_zad_1;

import javax.swing.JOptionPane;

/**
 * Łańcuch znaków czytany wspak
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_1 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Podaj dowolny łańcuch znaków: ");
        
        JOptionPane.showMessageDialog(null, "Podany łańcuch znaków czytany wspak brzmi: " + readBackwards(input));
    }
    
    private static String readBackwards(String input) {

        char[] array = input.toCharArray();
        String output = "";
        
        for (int i = input.length()-1; i > -1; i--) {
            
            output += array[i];
        }
        
        return output;
    }
}
