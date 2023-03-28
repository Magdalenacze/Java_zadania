
package zad_prog_rozdz_9_zad_3;

import javax.swing.JOptionPane;

/**
 * Metoda zmieniająca pierwsze litery zdań na wielkie
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_3 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Podaj dowolny łańcuch znaków (składający się z kilku krótkich zdań zaczynających się od małej litery): ");
        
        JOptionPane.showMessageDialog(null, "Zmodyfikowany łańcuch znaków: " + inputUpdate(input));
    }
    
    private static StringBuilder inputUpdate(String input) {
        
        input = input.trim();
        
        StringBuilder sb = new StringBuilder(input);

        boolean dot = true;
        
        for (int i = 0; i < sb.length(); i++) {
            
            if (sb.charAt(i) == '.' && dot == false) {
            
                dot = true;
            }
            
            if (dot == true && Character.isLetter(sb.charAt(i))) {
                
                dot = false;

                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        
        return sb;
    }   
}
