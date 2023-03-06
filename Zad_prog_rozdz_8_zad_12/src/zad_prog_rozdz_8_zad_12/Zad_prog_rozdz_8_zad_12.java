
package zad_prog_rozdz_8_zad_12;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Orzeł czy reszka?
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_12 {

    public static void main(String[] args) {
        
        ArrayList<Player> players = new ArrayList<>();
        Coin c = new Coin();
        
        int numberOfPlayers;
        String playerChoice;
        int winner = -1;
        
        numberOfPlayers = Integer.parseInt(JOptionPane.showInputDialog(null, "Witaj! Zagrasz w 'orzeł czy reszka'? To gra przeznaczona dla co najmniej dwóch graczy.\n\n"
                                                                           + "Podaj liczbę graczy (minimalna liczba graczy to 2): "));
        
        for (int count = 0; count < numberOfPlayers; count++) {

                    players.add(new Player(JOptionPane.showInputDialog(null, "Podaj nazwę gracza nr: " + (count + 1))));
                }
        
        while (winner == -1) {
            
            for (int count = 0; count < numberOfPlayers; count++) {
                
                c.toss();
                
                
                
                if (players.get(count).updatePlayerPoints(c.getSideUp().equals(JOptionPane.showInputDialog(null, "Gracz: " + players.get(count).getPlayerName() + "\n\n Aktualna liczba punktów: " + players.get(count).getPlayerPoints() + "\n\n Podaj swój wybór - orzeł czy reszka: "))) == 5) {
                    
                    winner = count;
                }
                    
                    
                
                
                
            }
        }
        
        JOptionPane.showMessageDialog(null, "Wygrał: " + players.get(winner).getPlayerName());
    }
}
