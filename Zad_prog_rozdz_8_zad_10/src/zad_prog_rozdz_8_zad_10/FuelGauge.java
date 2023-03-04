
package zad_prog_rozdz_8_zad_10;

/**
 * Klasa FuelGauge
 * @author Magdalena
 */
public class FuelGauge {
    
    private double amountOfFuel;
    
    public FuelGauge() {
        
        amountOfFuel = 0.0;
    }
    
    public FuelGauge(double amountOfFuel) {
        
        this.amountOfFuel = amountOfFuel;
    }
    
    public FuelGauge(FuelGauge object2) {
        
        this.amountOfFuel = object2.amountOfFuel;
    }

    public void setAmountOfFuel(double amountOfFuel) {
        
        this.amountOfFuel = amountOfFuel;
    }

    public double getAmountOfFuel() {
        
        return amountOfFuel;
    }
    
    public void refueling() {
        
        amountOfFuel += 1;
            
    }
        
    public void combustion() {
        
        amountOfFuel -= 1;
    }
}

