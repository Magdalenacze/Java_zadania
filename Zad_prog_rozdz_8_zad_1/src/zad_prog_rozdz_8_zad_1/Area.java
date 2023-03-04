
package zad_prog_rozdz_8_zad_1;

/**
 * Klasa Area
 * @author Magdalena
 */
public class Area {

    public static double area(double aRadius) {
        
        return Math.PI * Math.pow(aRadius, 2);
    }
    
    public static double area(double aWidth, double aLength) {
        
        return aWidth * aLength;
    }
    
    public static double area(double PI, double aRadius, double aHeight) {
        
        return  PI * Math.pow(aRadius, 2) * aHeight;
    }
    
}
