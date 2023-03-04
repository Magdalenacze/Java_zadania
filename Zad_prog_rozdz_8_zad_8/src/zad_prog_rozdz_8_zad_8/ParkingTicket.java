
package zad_prog_rozdz_8_zad_8;

/**
 * Klasa ParkingTicket
 * @author Magdalena
 */
public class ParkingTicket {
    
    private ParkedCar parkedCar;
    private ParkingMeter parkingMeter;
    private String officerName;
    private int officerNumber;
    
    public ParkingTicket() {
       
        this.parkedCar = new ParkedCar();
        this.parkingMeter = new ParkingMeter();
        this.officerName = "";
        this.officerNumber = 0;
    }

    public ParkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter, String officerName, int officerNumber) {
        
        this.parkedCar = new ParkedCar(parkedCar);
        this.parkingMeter = new ParkingMeter(parkingMeter);
        this.officerName = officerName;
        this.officerNumber = officerNumber;
    }

    public void setParkedCar(ParkedCar parkedCar) {
        
        this.parkedCar = new ParkedCar(parkedCar);
    }
    
    public void setParkingMeter(ParkingMeter parkingMeter) {
        
        this.parkingMeter = new ParkingMeter(parkingMeter);
    }
    
    public void setOfficerName(String officerName) {
        
        this.officerName = officerName;
    }
    
    public void setOfficerNumber(int officerNumber) {
        
        this.officerNumber = officerNumber;
    }

    public ParkedCar getParkedCar() {
        
        return new ParkedCar(parkedCar);
    }
    
    public ParkingMeter getParkingMeter() {
        
        return new ParkingMeter(parkingMeter);
    }

    public String getOfficerName() {
        
        return officerName;
    }
    
    public int getOfficerNumber() {
        
        return officerNumber;
    }
    
    public int getValues() {
        
        return parkedCar.getNumberOfMinutes() - parkingMeter.getPurchasedMinutes();
    }
    
    public String getMandate() {
        
        int cost = 0;
        int minutes = getValues();
        String output;
        
        if (minutes > 0) {
            
            output = "Została przekroczona wykupiona liczba minut parkowania! ";
            
            cost = 50;
            
            minutes -= 60;
            
            while (minutes > 0) {
                
                cost += 20;
                
                minutes -= 60;  
            }
            
            output += "Przyznano mandat w wysokości: " + cost + " pln";
            
        } else {
            
            output = "Nie została przekroczona wykupiona liczba minut parkowania.";
        }
        
        return output;
    }
}
