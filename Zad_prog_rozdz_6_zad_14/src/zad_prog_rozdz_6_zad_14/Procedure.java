
package zad_prog_rozdz_6_zad_14;

import javax.swing.JOptionPane;

/**
 * Klasa Procedure
 * @author Magdalena
 */
public class Procedure {
    
    private String examination;
    private String date;
    private String doctor;
    private double fee;
    
    public Procedure() {
        
        examination = "";
        date = "";
        doctor = "";
        fee = 0.00;
    }
    
    public Procedure(String aExamination, String aDate, String aDoctor, double aFee) {
        
        examination = aExamination;
        date = aDate;
        doctor = aDoctor;
        fee = aFee;
    }
    
    public void setExamination(String aExamination) {
        
        examination = aExamination;
    }
    
    public void setDate(String aDate) {
        
        date = aDate;
    }
    
    public void setDoctor(String aDoctor) {
        
        doctor = aDoctor;
    }
    
    public void setFee(double aFee) {
        
        fee = aFee;
    }
    
    public String getExamination() {
        
        return examination;
    }
    
    public String getDate() {
        
        return date;
    }
     
    public String getDoctor() {
        
        return doctor;
    }
      
    public double getFee() {
        
        return fee;
    }
}
