
package zad_prog_rozdz_6_zad_5;

import javax.swing.JOptionPane;

/**
 * Klasa Payroll
 * @author Magdalena
 */
public class Payroll {
    
    private String name;
    private int idNumber;
    private double hourlyRate;
    private int numberOfHours;
    
    public Payroll(String aName, int aIdNumber, double aHourlyRate, int aNumberOfHours) {
        
        name = aName;
        idNumber = aIdNumber;
        hourlyRate = aHourlyRate;
        numberOfHours = aNumberOfHours;
    }
    
    public Payroll() {
        
        this("", 0, 0.0, 0);
    }
    
    public void setName(String aName) {
        
        name = aName;
    }
    
    public void setIdNumber(int aIdNumber) {
        
        idNumber = aIdNumber;
    }
    
    public void setHourlyRate(double aHourlyRate) {
        
        hourlyRate = aHourlyRate;
    }
    
    public void setNumberOfHours(int aNumberOfHours) {
        
        numberOfHours = aNumberOfHours;
    }
     
    public String getName() {
        
       return name; 
    }
    
    public int getIdNumber() {
        
       return idNumber; 
    }
    
    public double getHourlyRate() {
        
       return hourlyRate; 
    }
    
    public int getNumberOfHours() {
        
       return numberOfHours; 
    }
    
    public double grossSalary() {
        
        return hourlyRate * numberOfHours;
    }
    
    public double result() {
        
        return hourlyRate * numberOfHours;
    }
    
    public void input() {
        
        name = JOptionPane.showInputDialog(null, "Podaj imię i nazwisko pracownika: ");
        
        idNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj identyfikator pracownika: "));
        
        hourlyRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj stawkę godzinową pracownika: "));
        
        numberOfHours = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę przepracowanych godzin przez pracownika: "));
    }
    
    public void output() {
        
        JOptionPane.showMessageDialog(null, "Imię i nazwisko: " + name + "\n"
                                          + "Identyfikator: " + idNumber + "\n"
                                          + "Stawka godzinowa: " + hourlyRate + "\n"
                                          + "Liczba przepracowanych godzin: " + numberOfHours + "\n"
                                          + "Wynagrodzenie brutto: " + result());
    }
}
