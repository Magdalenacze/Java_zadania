
package zad_prog_rozdz_6_zad_11;

/**
 * Klasa FreezingBoilingTemperature
 * @author Magdalena
 */
public class FreezingBoilingTemperature {
    
    private int temperature;
    
    public FreezingBoilingTemperature(int aTemperature) {
    
        temperature = aTemperature;
    }
    
    public FreezingBoilingTemperature() {
        
         temperature = 0;
    }
    
    public void setTemperature(int aTemperature) {
        
        temperature = aTemperature;
    }
    
    public int getTemperature() {
        
        return temperature;
    }
    
    public boolean isEthylFreezing() {
        
        if(temperature <= -114) {
            
            return true;
        }
        else {
            
            return false;
        }
    }
    
    public boolean isEthylBoiling() {
        
        if(temperature >= 78) {
            
            return true;
        }
        else {
            
            return false;
        }
    }
    
    public boolean isOxygenFreezing() {
        
        if(temperature <= -218) {
            
            return true;
        }
        else {
            
            return false;
        }
    }
    
    public boolean isOxygenBoiling() {
        
        if(temperature >= -183) {
            
            return true;
        }
        else {
            
            return false;
        }
    }
    
    public boolean isWaterFreezing() {
        
        if(temperature <= 0) {
            
            return true;
        }
        else {
            
            return false;
        }
    }
    
    public boolean isWaterBoiling() {
        
        if(temperature >= 100) {
            
            return true;
        }
        else {
            
            return false;
        }
    }
}
