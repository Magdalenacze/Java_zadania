
package zad_prog_rozdz_8_zad_12;

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

                this.sideUp = "orzeł";
            }
            else {

                this.sideUp = "reszka";
            }
    }
    
    public void toss() {
        
        Random rand = new Random();
        
            if(rand.nextInt(2) == 0) {

                this.sideUp = "orzeł";
            }
            else {

                this.sideUp = "reszka";
            }
    }
    
    public String getSideUp() {
        
        return sideUp;
    }
    
}
