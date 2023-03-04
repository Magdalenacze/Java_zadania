
package zad_prog_rozdz_8_zad_3;

/**
 * Klasa RoomDimension
 * @author Magdalena
 */
public class RoomDimension {
    
    private double length;
    private double width;
    
    public RoomDimension() {
        
        length = 0.0;
        width = 0.0;
    }
    
    public RoomDimension(double aLength, double aWidth) {
        
        length = aLength;
        width = aWidth;
    }
    
    public RoomDimension(RoomDimension object2) {
        
        length = object2.length;
        width = object2.width;
    }
    
    public void setLength(double aLength) {
        
        length = aLength;
    }
    
    public void setWidth(double aWidth) {

        width = aWidth;
    }
    
    public double getArea() {
        
        return length * width;
    }
    
    public String toString() {
        
        String str = "Powierzchnia pomieszczenia: " + getArea() + " m2";
               
        return str;
    }
}
