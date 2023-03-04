
package zad_proj_rozdz_6_zad_15;

import java.util.Random;

/**
 * Klasa Die
 * @author Magdalena
 */
public class Die {
    
    private int sides;
    private int value;
    
    public Die(int aSides) {
        
        sides = aSides;
    }
    
    public int getSides() {
        
        return sides;
    }
    
    public int getValue() {
        
        return value;
    }
    
    public void roll() {
        
        Random rand = new Random();
        
        value = rand.nextInt(sides) + 1;
    }
}
