
package zad_prog_rozdz_10_zad_1;

/**
 * Klasa ProductionWorker
 * @author Magdalena
 */
public class ProductionWorker extends Employee {
    
    private int shift;
    private double hourlyRate;
 
    public ProductionWorker() {
        
        this.shift = 1;
        this.shift = 2;
        this.hourlyRate = 0.0;
    }

    public ProductionWorker(int shift, double hourlyRate) {
        
        this.shift = shift;
        this.hourlyRate = hourlyRate;
    }

    public void setShift(int shift) {
        
        this.shift = shift;
    }

    public void setHourlyRate(double hourlyRate) {
        
        this.hourlyRate = hourlyRate;
    }

    public int getShift() {
        
        return shift;
    }

    public double getHourlyRate() {
        
        return hourlyRate;
    }
    
    @Override
    public String toString() {
        
        String str = super.toString();
        
        str += "\nZmiana: " + getShift() + "\n"
             + "Stawka godzinowa: " + getHourlyRate() + " pln";
               
        return str;
    }
}
