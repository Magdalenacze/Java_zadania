
package zad_prog_rozdz_8_zad_11;

/**
 * Klasa Player
 * @author Magdalena
 */
public class Player {
    
    private String playerName;
    private int playerPoints;
    
    public Player() {
        
        this.playerName = "";
        this.playerPoints = 0;
    }
    
    public Player (String playerName) {
        
        this.playerName = playerName;
        this.playerPoints = 50;
    }

    public void setPlayerName(String playerName) {
        
        this.playerName = playerName;
    }

    public void setPlayerPoints(int playerPoints) {
        
        this.playerPoints = playerPoints;
    }

    public String getPlayerName() {
        
        return playerName;
    }

    public int getPlayerPoints() {
        
        return playerPoints;
    }
    
    public int actPlayerPoints(int number) { //aktualizacja liczby punktów
        
        if (playerPoints - number < 0) {
            
            playerPoints += number;
            
        } else {
            
            playerPoints -= number;
        }
        
        return playerPoints;
    }
}
