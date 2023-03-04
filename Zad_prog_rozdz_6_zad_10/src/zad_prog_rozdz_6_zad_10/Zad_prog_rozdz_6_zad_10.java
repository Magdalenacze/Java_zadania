
package zad_prog_rozdz_6_zad_10;

import javax.swing.JOptionPane;

/**
 * Gra w oczko
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_10 {

    public static void main(String[] args) {
        
        Die d = new Die(6);
        
        int input = 0;
        int totalUser = 0; 
        int totalComputer = 0;
        
        input = Integer.parseInt(JOptionPane.showInputDialog(null, "Witaj! Zagrasz w oczko?\n\nZadanie polega na próbie wyrzucenia "
                                                                 + "dwoma kostkami o sześciu ściankach sumarycznej wartości wyższej\n"
                                                                 + "niż suma wygenerowana losowo przez komputer. Maksymalna suma "
                                                                 + "w jednej rundzie wynosi 21.\n\nCzy chcesz wykonać pierwszy rzut?\n\n"
                                                                 + "Wpisz cyfrę 1, jeżeli chcesz rozpocząć grę, bądź 0, jeżeli chcesz zakończyć."));
        if(input != 0) {
        
            while(totalUser <= 21 && input != 0) {
                
                d.roll();
                
                totalComputer += d.getValue();
                
                d.roll();
                
                totalComputer += d.getValue();
                
                d.roll();
                
                totalUser += d.getValue();
                 
                d.roll();
                
                totalUser += d.getValue();
                
                input = Integer.parseInt(JOptionPane.showInputDialog(null, "Twoja aktualna suma zdobytych punktów wynosi: " + totalUser + "\n\n"
                                                                         + "Czy chcesz wykonać kolejny rzut, aby uzyskać więcej punktów?\n\n"
                                                                         + "Wpisz cyfrę 1, jeżeli chcesz, bądź 0, jeżeli chcesz zakończyć grę."));
            }
            
            if((totalUser > totalComputer && totalUser <= 21) || (totalUser < totalComputer && totalUser <= 21 && totalComputer > 21)) {
                
                JOptionPane.showMessageDialog(null, "Sumaryczna liczba punktów uzyskana przez komputer wynosi: " + totalComputer + "\n"
                                                  + "Sumaryczna liczba punktów uzyskana przez Ciebie wynosi: " + totalUser + "\n"
                                                  + "Wygrana należy do Ciebie!");
            }
            else if(totalUser == totalComputer) {
                
                JOptionPane.showMessageDialog(null, "Sumaryczna liczba punktów uzyskana przez komputer wynosi: " + totalComputer + "\n"
                                                  + "Sumaryczna liczba punktów uzyskana przez Ciebie wynosi: " + totalUser + "\n"
                                                  + "Remis!");
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Sumaryczna liczba punktów uzyskana przez komputer wynosi: " + totalComputer + "\n"
                                                  + "Sumaryczna liczba punktów uzyskana przez Ciebie wynosi: " + totalUser + "\n"
                                                  + "Tym razem nie udało się. Spróbuj ponownie.");
            }
        }
    }
}
