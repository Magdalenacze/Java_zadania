
package zad_prog_rozdz_7_zad_2;

import javax.swing.JOptionPane;

/**
 * Payroll
 * @author Magdalena
 */
public class Payroll {
    
    final int LICZBA_PRACOWNIKOW = 7;
    private int[] employeeId;
    private int[] hours;
    private double[] payRate;
    private double[] wages;
    
    public Payroll() {
        
        employeeId = new int[LICZBA_PRACOWNIKOW];
        employeeId[0] = 5658845;
        employeeId[1] = 4520125;
        employeeId[2] = 7895122; 
        employeeId[3] = 8777541; 
        employeeId[4] = 8451277; 
        employeeId[5] = 1302850; 
        employeeId[6] = 7580489;
        hours = new int[LICZBA_PRACOWNIKOW];
        payRate = new double[LICZBA_PRACOWNIKOW];
        wages = new double[LICZBA_PRACOWNIKOW];
    }
    
    public Payroll(int[] aHours, double[] aPayRate) {
        
        employeeId = new int[LICZBA_PRACOWNIKOW];
        employeeId[0] = 5658845;
        employeeId[1] = 4520125;
        employeeId[2] = 7895122; 
        employeeId[3] = 8777541; 
        employeeId[4] = 8451277; 
        employeeId[5] = 1302850; 
        employeeId[6] = 7580489;
        wages = new double[LICZBA_PRACOWNIKOW];
       
        hours = new int[aHours.length];
        
        for (int index = 0; index < aHours.length; index++) {
            
            hours[index] = aHours[index];
        }
        
        payRate = new double[aPayRate.length];
        
        for (int index = 0; index < aPayRate.length; index++)
            
            payRate[index] = aPayRate[index];

    }
    
    public void setHours(int[] aHours) {
        
        hours = new int[aHours.length];
        
        for (int index = 0; index < aHours.length; index++) {
            
            hours[index] = aHours[index];
        }
    }
    
    public void setPayRate(double[] aPayRate) {
        
        payRate = new double[aPayRate.length];
        
        for (int index = 0; index < aPayRate.length; index++) {
            
            payRate[index] = aPayRate[index];
        }
    }
    
    public int getLiczbaPracownikow() {
        
        return LICZBA_PRACOWNIKOW;
    }
    
    public int[] getEmployeeId() {
        
        return employeeId;
    }
    
    public void updateWages() {
        
        for (int index = 0; index < LICZBA_PRACOWNIKOW; index++)
            
            wages[index] = hours[index] * payRate[index];
    }
    
    public double unitWages(int aEmployeeId) {
        
        int index = 0;
        
        for (int i = 0; i < LICZBA_PRACOWNIKOW; i++) {
           
            if (employeeId[i] == aEmployeeId)
                
               index = i;
        }
                   
        return wages[index];
    }
}
