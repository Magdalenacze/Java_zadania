
package zad_prog_rozdz_9_zad_4;

import javax.swing.JOptionPane;

/**
 * Samogłoski i spółgłoski
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_4 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Podaj dowolny łańcuch znaków: ");
          
        char menu = ' ';
        
        while (menu != 'e') {
            
            menu = JOptionPane.showInputDialog(null, "Wybierz jedną z poniżej podanych opcji (a-e):\n\n"
                                                   + "a. zliczanie samogłosek w łańcuchu znaków,\n"
                                                   + "b. zliczanie spółgłosek w łańcuchu znaków,\n"
                                                   + "c. zliczanie sumy samogłosek i spółgłosek,\n"
                                                   + "d. wprowadzenie następnego łańcucha znaków,\n"
                                                   + "e. zakończenie pracy programu.").charAt(0);
            switch (menu) {

                case 'a':
                    
                    JOptionPane.showMessageDialog(null, "Suma samogłosek w podanym łańcuchu znaków wynosi: " + Alphabet.getSumOfVowels(input));    
                break;
                case 'b':

                    JOptionPane.showMessageDialog(null, "Suma spółgłosek w podanym łańcuchu znaków wynosi: " + Alphabet.getSumOfConsonants(input));
                break;
                case 'c':

                    JOptionPane.showMessageDialog(null, "Suma samogłosek i spółgłosek w podanym łańcuchu znaków wynosi: " + Alphabet.getSumOfTotal(input));
                break;
                case 'd':

                    input = JOptionPane.showInputDialog(null, "Podaj następny łańcuch znaków: ");
                break;
                case 'e':
                    
                    JOptionPane.showMessageDialog(null, "Dziękuję!");
                break;
                default:

                    JOptionPane.showMessageDialog(null, "Błędny wybór!");
            }
        }
    }
}
