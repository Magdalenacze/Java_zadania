
package zad_prog_rozdz_6_zad_8;

/**
 * Temperature
 * @author Magdalena
 */
public class Temperature {
    
    private double fTemp;
    
    public Temperature(double aFTemp) {
        
        fTemp = aFTemp;
    }
    
     public Temperature() {
        
        this(0.0);
    }
     
    public void setFahrenheit(double aFTemp) {
        
        fTemp = aFTemp;
    }
    
    public double getFahrenheit() {
        
        return fTemp;
    }
    
    public double celsius() {
        
        return ((5.0 / 9.0) * (fTemp - 32));
    }
    
    public double kelvin() {
        
        return ((5.0 / 9.0) * (fTemp - 32) + 273);
    }
}
