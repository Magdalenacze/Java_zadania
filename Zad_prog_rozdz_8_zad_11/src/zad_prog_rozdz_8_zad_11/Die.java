
package zad_prog_rozdz_8_zad_11;

import java.util.Random;

/**
 * Klasa Die
 * @author Magdalena
 */
public class Die {
  
    private int sides;
    private int value;
    
    public Die() {
        
        this.sides = 0;
        this.value = 0;
    }
    
    public Die(int sides) {
        
        this.sides = sides;
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
