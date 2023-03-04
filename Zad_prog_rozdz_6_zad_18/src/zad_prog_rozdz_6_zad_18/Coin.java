
package zad_prog_rozdz_6_zad_18;

import java.util.Random;

/**
 * Klasa Coin
 * @author Magdalena
 */
public class Coin {
    
    private String sideUp;
    private double value;
    
    public Coin(double aValue) {
        
        Random rand = new Random();
        
        if(rand.nextInt(2) == 0) {
        
            sideUp = "orzeł";
        }
        else {
            
            sideUp = "reszka";
        }
        
        value = aValue;
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
    
    public double getValue() {
        
        return value;
    }
}
