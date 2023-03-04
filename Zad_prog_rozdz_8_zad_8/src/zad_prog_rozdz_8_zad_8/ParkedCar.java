
package zad_prog_rozdz_8_zad_8;

/**
 * Klasa ParkedCar
 * @author Magdalena
 */
public class ParkedCar {
    
    private String brand;
    private String model;
    private String color;
    private String registrationNumber;
    private int numberOfMinutes;
    
    public ParkedCar() {
        
        this.brand = "";
        this.model = "";
        this.color = "";
        this.registrationNumber = "";
        this.numberOfMinutes = 0;
    }
    
    public ParkedCar(String brand, String model, String color, String registrationNumber, int numberOfMinutes) {
        
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.numberOfMinutes = numberOfMinutes;
    }
    
    public ParkedCar(ParkedCar object2) {
        
        this.brand = object2.brand;
        this.model = object2.model;
        this.color = object2.color;
        this.registrationNumber = object2.registrationNumber;
        this.numberOfMinutes = object2.numberOfMinutes;
    }

    public void setBrand(String brand) {
        
        this.brand = brand;
    }

    public void setModel(String model) {
        
        this.model = model;
    }

    public void setColor(String color) {
        
        this.color = color;
    }

    public void setRegistrationNumber(String registrationNumber) {
        
        this.registrationNumber = registrationNumber;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        
        this.numberOfMinutes = numberOfMinutes;
    }

    public String getBrand() {
        
        return brand;
    }

    public String getModel() {
        
        return model;
    }

    public String getColor() {
        
        return color;
    }

    public String getRegistrationNumber() {
        
        return registrationNumber;
    }

    public int getNumberOfMinutes() {
        
        return numberOfMinutes;
    } 
}
