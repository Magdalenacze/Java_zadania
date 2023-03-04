
package zad_prog_rozdz_8_zad_4;

/**
 * Klasa LandTrack
 * @author Magdalena
 */
public class LandTrack {
    
    private double length;
    private double width;
    public static int counter;
    private int number;
    
    public LandTrack() {
        
        length = 0.0;
        width = 0.0;
        number = counter + 1;
    }
    
    public LandTrack(double aLength, double aWidth) {
        
        length = aLength;
        width = aWidth;
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
    
    public boolean equals(LandTrack object2) {

        boolean status;
        
        if (this.getArea() == object2.getArea()) {
            
            status = true;
            
        } else {
            
            status = false;
        }
        
        return status;
    }
    
    public String toString() {
        
        String str = "Powierzchnia działki nr " + number + ": " + getArea() + " m2";
               
        return str;
    }
}
