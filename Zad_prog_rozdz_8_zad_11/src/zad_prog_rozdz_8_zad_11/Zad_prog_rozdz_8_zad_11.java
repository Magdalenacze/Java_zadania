
package zad_prog_rozdz_8_zad_11;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Gra w "wyścig do jedynki"
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_11 {

    public static void main(String[] args) {
        
        ArrayList<Player> players = new ArrayList<>();

        int numberOfPlayers;
        int gameMode;
        
        gameMode = Integer.parseInt(JOptionPane.showInputDialog(null, "Witaj! Zagrasz w 'wyścig do jedynki'? To gra przeznaczona dla co najmniej dwóch graczy.\n\n"
                                                                    + "Masz do wyboru dwa tryby gry:\n"
                                                                    + "1. Rozgrywka trwa do czasu uzyskania przez jednego z graczy dokładnie jednego punkta.\n"
                                                                    + "2. Rozgrywka trwa przez określoną liczbę kolejek - wygrywa gracz z liczbą punktów najbliższą jedynce po zakończeniu wszystkich kolejek.\n\n"
                                                                    + "Wpisz cyfrę 1 lub 2 jako wybrany tryb gry, bądź 0, jeżeli chcesz zakończyć."));
        
        if(gameMode != 0) {
            
            Die d = new Die(6);
            int winner = -1;
        
            numberOfPlayers = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę graczy (minimalna liczba graczy to 2): "));
        
                for (int count = 0; count < numberOfPlayers; count++) {

                    players.add(new Player(JOptionPane.showInputDialog(null, "Podaj nazwę gracza nr: " + (count + 1))));
                }
      
            if (gameMode == 1) {
       
                while (winner == -1) {
                    
                    for (int i = 0; i < numberOfPlayers; i++) {
                        
                        d.roll();
                        
                        if (players.get(i).actPlayerPoints(d.getValue()) == 1) {
                            
                            winner = i;
                        }   
                    }
                }
            } else if (gameMode == 2) {
                
                int numberOfQueues;
                winner = 0;
                
                numberOfQueues = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę kolejek/rund gry: "));
                
                for (int count = 1; count <= numberOfQueues; count++) {
                    
                    for (int i = 0; i < numberOfPlayers; i++) {
                        
                        d.roll();
                        
                        players.get(i).actPlayerPoints(d.getValue()); 
                    } 
                }
                
                int minValue = players.get(0).getPlayerPoints();
                
                for (int index = 1; index < numberOfPlayers; index++) {
            
                    if (players.get(index).getPlayerPoints() < minValue)

                        minValue = players.get(index).getPlayerPoints();
                        winner = index;
                }
            } else {

                JOptionPane.showMessageDialog(null, "Błędne dane wejściowe. Wybierz cyfrę 1 lub 2.");
            }
            
            String output = "W grze 'wyścig do jedynki' wygrał gracz: " + players.get(winner).getPlayerName() + " z wynikiem: " + players.get(winner).getPlayerPoints() + "\n\n"
                          + "Wyniki:\n";
                          
                for (int i = 0; i < numberOfPlayers; i++) {

                    output += "Gracz: " + players.get(i).getPlayerName() + ", wynik: " + players.get(i).getPlayerPoints() + "\n";
                }
            
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
