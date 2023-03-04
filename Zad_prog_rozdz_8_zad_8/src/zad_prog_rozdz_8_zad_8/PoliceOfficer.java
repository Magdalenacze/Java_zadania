
package zad_prog_rozdz_8_zad_8;

/**
 * Klasa PoliceOfficer
 * @author Magdalena
 */
public class PoliceOfficer {
    
    private String name;
    private int number;
    
    public PoliceOfficer() {
    
        this.name = "";
        this.number = 0;
    }
    
    public PoliceOfficer(String name, int number) {
       
        this.name = name;
        this.number = number;
    }
    
    public void setName(String name) {
        
        this.name = name;
    }

    public void setNumber(int number) {
        
        this.number = number;
    }
    
    public String getName() {
        
        return name;
    }

    public int getNumber() {
        
        return number;
    }
    
    public boolean getValues(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        
        if (parkedCar.getNumberOfMinutes() > parkingMeter.getPurchasedMinutes()) {
            
            return true;
        
        } else {
            
            return false;
        }
    }
    
    public ParkingTicket generateTicket (ParkedCar parkedCar, ParkingMeter parkingMeter) {
        
        ParkingTicket pt = new ParkingTicket(parkedCar, parkingMeter, name, number);
        
        return pt;
    }
}
