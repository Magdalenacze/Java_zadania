
package zad_prog_rozdz_6_zad_2;

import javax.swing.JOptionPane;

/**
 * Car
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_2 {
    
    public static void main(String[] args) {
        
        Car c = new Car(2015, "Ferrari");
        
        for (int count = 0; count < 5; count++) {
            
            c.accelerate();
            
            JOptionPane.showMessageDialog(null, "Aktualna szybkość samochodu wynosi: " + c.getSpeed());
        }
        
        for (int count = 0; count < 5; count++) {
            
            c.brake();
            
            JOptionPane.showMessageDialog(null, "Aktualna szybkość samochodu wynosi: " + c.getSpeed());
        }
    } 
}
