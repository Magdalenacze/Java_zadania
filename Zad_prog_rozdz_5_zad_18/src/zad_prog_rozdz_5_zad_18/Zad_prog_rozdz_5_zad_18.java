
package zad_prog_rozdz_5_zad_18;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Badanie postrzegania pozazmysłowego
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_18 {

    public static void main(String[] args) {
        
        int game = 0;
        int user;
        int computer;
        int total = 0;
        
        for (int count = 1; count <= 10; count++) {
        
        computer = getComputer();
        
        user = getUser();
        
            if (getGame(user, computer)) {

            total++;
            }
            showComputer(computer);
        }
        showResult(total);
    }
        
    public static int getComputer() {
        
        Random randomNumbers = new Random();
        
        return randomNumbers.nextInt(4);
    }

    public static int getUser() {
 
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Witaj! Chcesz zbadać swoje zdolności pozazmysłowe?\n\n"
                                                                + "Podaj kolor wybrany losowo przez komputer, gdzie:\n"
                                                                + "* cyfra 0 oznacza kolor czerwony,\n"
                                                                + "* cyfra 1 oznacza kolor zielony,\n"
                                                                + "* cyfra 2 oznacza kolor niebieski,\n"
                                                                + "* cyfra 3 oznacza kolor pomarańczowy,\n"
                                                                + "* cyfra 4 oznacza kolor żółty."));
    }

    public static boolean getGame(int aUser, int aComputer) {
        
        if (aUser == aComputer) {
        
            return true;
        }
        else {
                
            return false;
        }
    }
    
    public static void showComputer(int aComputer) {
        
       String[] options = {"czerwony", "zielony", "niebieski", "pomarańczowy", "żółty"};
       
       JOptionPane.showMessageDialog(null, "Komputer wylosował kolor: " + options[aComputer]);
    }
    
    public static void showResult(int aTotal) {
        
        JOptionPane.showMessageDialog(null, "Odgadłeś poprawnie " + aTotal + " kolor.");
    }
}
