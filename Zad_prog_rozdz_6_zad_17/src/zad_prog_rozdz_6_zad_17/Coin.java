
package zad_prog_rozdz_6_zad_17;

import java.util.Random;

/**
 * Klasa Coin
 * @author Magdalena
 */
public class Coin {
    
    private String sideUp;
    
    public Coin() {

        Random rand = new Random();
        
        if(rand.nextInt(2) == 0) {
        
            sideUp = "orzeł";
        }
        else {
            
            sideUp = "reszka";
        }
    }
    
    public void toss() {
        
        Random rand = new Random();
        
        if(rand.nextInt(2) == 0) {
        
            sideUp = "orzeł";
        }
        else {
            
            sideUp = "reszka";
        }
    }
    
    public String getSideUp() {
        
        return sideUp;
    }
}
