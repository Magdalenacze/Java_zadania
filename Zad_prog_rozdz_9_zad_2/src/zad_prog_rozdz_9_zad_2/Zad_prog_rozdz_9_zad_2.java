
package zad_prog_rozdz_9_zad_2;

import javax.swing.JOptionPane;

/**
 * Licznik słów
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_2 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Podaj dowolny łańcuch znaków (składający się z kilku słów): ");
        
        JOptionPane.showMessageDialog(null, "Liczba słów w podanym łańcuchu znaków wynosi: " + numberOfWords(input));
    }
    
    private static int numberOfWords(String input) {
        
        input = input.trim();
        char[] array = input.toCharArray();
        int whitespaces = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            if (Character.isWhitespace(array[i])) {
            
                whitespaces++;
            }
        }
        
        return whitespaces + 1;
    }
}
