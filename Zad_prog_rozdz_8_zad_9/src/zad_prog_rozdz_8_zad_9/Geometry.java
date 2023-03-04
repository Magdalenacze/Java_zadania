
package zad_prog_rozdz_8_zad_9;

import javax.swing.JOptionPane;

/**
 * Klasa Geometry
 * @author Magdalena
 */
public class Geometry {
    
    public static double circle(double aRadius) {     
        
        if (aRadius < 0) {
            
            JOptionPane.showMessageDialog(null, "Błędne dane wejściowe! Proszę podać liczbę nieujemną.");
            
            return 0;
            
        } else {
        
            return Math.PI * Math.pow(aRadius, 2);
        }
    }
    
    public static double rectangle(double aWidth, double aLength) {
        
        if (aWidth < 0 || aLength < 0) {
            
            JOptionPane.showMessageDialog(null, "Błędne dane wejściowe! Proszę podać liczbę nieujemną.");
            
            return 0;
            
        } else {
        
            return aWidth * aLength;
        } 
    }
    
    public static double triangle(double aTriangleBase, double aHeight) {
        
        if (aTriangleBase < 0 || aHeight < 0) {
            
            JOptionPane.showMessageDialog(null, "Błędne dane wejściowe! Proszę podać liczbę nieujemną.");
            
            return 0;
            
        } else {
        
            return aTriangleBase * aHeight * 0.5;
        } 
    }
}
