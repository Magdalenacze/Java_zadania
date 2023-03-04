
package zad_prog_rozdz_6_zad_16;

/**
 * Klasa RoulettePocket
 * @author Magdalena
 */
public class RoulettePocket {
    
    private int number;
    
    public RoulettePocket() {
        
        number = 0;
    }
    
    public RoulettePocket(int aNumber) {
        
        number = aNumber;
    }
    
    public void setNumber(int aNumber) {
        
        number = aNumber;
    }
    
    public int getNumber() {
        
        return number;
    }

    public String pocketColor() {
        
        if(number == 0) {
    
            return "zielony";
        }
        else if(number >= 1 && number <= 10) {
            
            if ((number % 2) == 0) {
            
                return "czarny";
            }
            else {
                
                return "czerwony";
            }
        }
        else if(number >= 11 && number <= 18) {
                    
            if ((number % 2) == 0) {
            
                return "czerwony";
            }
            else {
                
                return "czarny";
            }            
        }
        else if(number >= 19 && number <= 28) {
                    
            if ((number % 2) == 0) {
            
                return "czarny";
            }
            else {
                
                return "czerwony";
            }            
        }
        else if(number >= 29 && number <= 36) {
                    
            if ((number % 2) == 0) {
            
                return "czerwony";
            }
            else {
                
                return "czarny";
            }            
        }
        else {
            
            return "";
        }
    }
}
