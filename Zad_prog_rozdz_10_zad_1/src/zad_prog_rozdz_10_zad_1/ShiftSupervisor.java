
package zad_prog_rozdz_10_zad_1;

/**
 * Klasa ShiftSupervisor
 * @author Magdalena
 */
public class ShiftSupervisor extends Employee {
    
    private double annualSalary;
    private double annualBonus;
    
    public ShiftSupervisor() {
        
        this.annualSalary = 0.00;
        this.annualBonus = 0.00;
    }
    
    public ShiftSupervisor(double annualSalary, double annualBonus) {
        
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        
        this.annualSalary = annualSalary;
    }

    public void setAnnualBonus(double annualBonus) {
        
        this.annualBonus = annualBonus;
    }

    public double getAnnualSalary() {
        
        return annualSalary;
    }

    public double getAnnualBonus() {
        
        return annualBonus;
    }
    
    @Override
    public String toString() {
        
        String str = super.toString();
        
        str += "\nRoczne wynagrodzenie: " + getAnnualSalary() + " pln\n"
             + "Roczna premia: " + getAnnualBonus() + " pln";
               
        return str;
    }
}
