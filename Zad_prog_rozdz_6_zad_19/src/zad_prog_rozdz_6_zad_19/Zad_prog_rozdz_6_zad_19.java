
package zad_prog_rozdz_6_zad_19;

import javax.swing.JOptionPane;

/**
 * Symulator gry w wędkowanie
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_19 {

    public static void main(String[] args) {
        
        Die d = new Die(6);
        
        int input = 0;
        int totalPoints = 0;
        int rounds = 0;
        
        input = Integer.parseInt(JOptionPane.showInputDialog(null, "Witaj! Zagrasz w wędkowanie?\n\n"
                                                                 + "Każda rzecz, jaką można wyłowić, jest reprezentowana przez liczbę oczek kostki.\n\n"
                                                                 + "Czy chcesz wykonać pierwszy rzut?\n\n"
                                                                 + "Wpisz cyfrę 1, jeżeli chcesz rozpocząć grę, bądź 0, jeżeli chcesz zakończyć."));
        
        while(input != 0) {
            
            rounds += 1;
            
            d.roll();
                
            totalPoints += d.getValue();
            
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Czy chcesz wykonać kolejny rzut, aby uzyskać więcej punktów?\n\n"
                                                                     + "Wpisz cyfrę 1, jeżeli chcesz, bądź 0, jeżeli chcesz zakończyć grę."));
        }
        
        if((totalPoints / rounds) >= 1 && (totalPoints / rounds) < 2) {
                
            JOptionPane.showMessageDialog(null, "Uzyskana sumaryczna liczba punktów wynosi: " + totalPoints + "\n"
                                              + "Tym razem słaby połów. Spróbuj ponownie!");
        }
        else if((totalPoints / rounds) >= 2 && (totalPoints / rounds) < 4) {
                
            JOptionPane.showMessageDialog(null, "Uzyskana sumaryczna liczba punktów wynosi: " + totalPoints + "\n"
                                              + "Średni połów. Możesz spróbować jeszcze raz!");
        }
        else {
                
            JOptionPane.showMessageDialog(null, "Uzyskana sumaryczna liczba punktów wynosi: " + totalPoints + "\n"
                                              + "To był dobry połów. Gratulacje!");
        }
    }   
}
