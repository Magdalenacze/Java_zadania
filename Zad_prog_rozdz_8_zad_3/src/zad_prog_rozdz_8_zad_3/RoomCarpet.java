
package zad_prog_rozdz_8_zad_3;

/**
 * Klasa RoomCarpet
 * @author Magdalena
 */
public class RoomCarpet {
    
    private double price;
    private RoomDimension roomDimension;
    
    public RoomCarpet(double aPrice, RoomDimension aRoomDimension) {
        
        price = aPrice;
        roomDimension = new RoomDimension(aRoomDimension);
    }
    
    public void setPrice(double aPrice) {
        
        price = aPrice;
    }
    
    public RoomDimension getRoomDimension() {
        
        return new RoomDimension(roomDimension);
    }
    
    public double getTotalPrice() {
        
        return price * roomDimension.getArea();
    }
    
    public String toString() {
        
        String str = "Całkowity koszt wykładziny: " + getTotalPrice() + " pln";
               
        return str;
    }
}
