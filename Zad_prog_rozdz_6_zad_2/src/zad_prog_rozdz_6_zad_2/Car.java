
package zad_prog_rozdz_6_zad_2;

import javax.swing.JOptionPane;

/**
 * Klasa Car
 * @author Magdalena
 */
public class Car {
    
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int aYearModel, String aMake) {
    
        yearModel = aYearModel;
        make = aMake;
        speed = 0;   
    }   

    public int getYearModel() {
        
        return yearModel;
    }
    
    public String getMake() {
        
        return make;
    }
    
    public int getSpeed() {
        
        return speed;
    }
    
    public void accelerate() {
        
        speed = speed + 5;
    }
    
    public void brake() {
        
        speed = speed - 5;
    }
}
