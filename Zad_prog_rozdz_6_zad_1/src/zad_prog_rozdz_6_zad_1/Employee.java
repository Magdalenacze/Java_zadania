
package zad_prog_rozdz_6_zad_1;

import javax.swing.JOptionPane;

/**
 * Klasa Employee
 * @author Magdalena
 */
public class Employee {
    
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    public Employee(String aName, int aIdNumber, String aDepartment, String aPosition) {
        
       name = aName;
       idNumber = aIdNumber;
       department = aDepartment;
       position = aPosition;   
    }
    
    public Employee(String aName, int aIdNumber) {
        
        this(aName, aIdNumber, "", "");  
    }
    
    public Employee() {
        
        this("", 0, "", "");
    }
    
    public void setName(String aName) {
        
        name = aName;
    }
    
    public void setIdNumber(int aIdNumber) {
        
        idNumber = aIdNumber;
    }
    
    public void setDepartment(String aDepartment) {
        
        department = aDepartment;
    }
    
     public void setPosition(String aPosition) {
        
        position = aPosition;
    }
     
     public String getName() {
        
        return name;
     }
     
     public int getIdNumber() {
        
         return idNumber;
     }
     
     public String getDepartment() {
        
        return department;
     }
     
     public String getPosition() {
        
        return position;
     }
     
     public void show() {
         
        JOptionPane.showMessageDialog(null, "Imię i nazwisko: " + name + " \n" + "Identyfikator: " + idNumber + " \n"
                                           + "Dział: " + department + " \n" + "Stanowisko: " + position);
     }
}
