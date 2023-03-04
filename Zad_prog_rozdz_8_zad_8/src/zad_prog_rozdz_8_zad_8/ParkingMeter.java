
package zad_prog_rozdz_8_zad_8;

/**
 * Klasa ParkingMeter
 * @author Magdalena
 */
public class ParkingMeter {
    
    private int purchasedMinutes;

    public ParkingMeter() {
        
        this.purchasedMinutes = 0;
    }
    
    public ParkingMeter(int purchasedMinutes) {
        
        this.purchasedMinutes = purchasedMinutes;
    }
    
    public ParkingMeter(ParkingMeter object2) {
        
        this.purchasedMinutes = object2.purchasedMinutes;
    }
    
    public void setPurchasedMinutes(int purchasedMinutes) {
        
        this.purchasedMinutes = purchasedMinutes;
    }

    public int getPurchasedMinutes() {
        
        return purchasedMinutes;
    }
}
