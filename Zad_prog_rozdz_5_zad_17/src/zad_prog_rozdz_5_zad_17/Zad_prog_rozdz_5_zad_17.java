
package zad_prog_rozdz_5_zad_17;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * "Kamień, papier, nożyce"
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_17 {

    public static void main(String[] args) {
    
        int game = 0;
        int user;
        int computer;
        
        while (game == 0) {
        
        computer = getComputer();
        
        user = getUser();
        
        game = getGame(user, computer);
        
        showResult(user, computer, game);
        }
    }
    
    public static int getComputer() {
        
        Random randomNumbers = new Random();
        
        return randomNumbers.nextInt(3) + 1;
    }

    public static int getUser() {
 
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Witaj! Zagramy w kamień, papier, nożyce?\n\n"
                                                                + "Podaj swój wybór, gdzie:\n"
                                                                + "* cyfra 1 oznacza kamień,\n"
                                                                + "* cyfra 2 oznacza papier,\n"
                                                                + "* cyfra 3 oznacza nożyce."));
    }

    public static int getGame(int aUser, int aComputer) {
        
        if ((aUser == 1 && aComputer == 3) || (aUser == 2 && aComputer == 1) || (aUser == 3 && aComputer == 2)) {
        
            return 1;
        }
        else if (aUser != aComputer) {
        
            return 2;
        }   
        else {
                
            return 0;
        }
    }
    
    public static void showResult(int aUser, int aComputer, int aWinner) {
        
       String[] options = {"kamień", "papier", "nożyce"};
       
       String[] gameResult = {"Remis", "Użytkownik", "Komputer"};
       
       JOptionPane.showMessageDialog(null, "Komputer wybrał: " + options[aComputer - 1] + "\n"
                                         + "Użytkownik wybrał: " + options[aUser - 1] + "\n"
                                         + "Wygrał: " + gameResult[aWinner] + "\n"
                                         + "Dziękuję za wspólną grę! :)");
    }
}
