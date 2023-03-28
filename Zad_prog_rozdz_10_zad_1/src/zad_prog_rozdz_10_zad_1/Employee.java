
package zad_prog_rozdz_10_zad_1;

/**
 * Klasa Employee
 * @author Magdalena
 */
public class Employee {
    
    private String employeeName;
    private String employeeNumber;
    private String dateOfEmployment;
    
    public Employee() {
        
        this.employeeName = "";
        this.employeeNumber = "";
        this.dateOfEmployment = "";
    }

    public Employee(String employeeName, String employeeNumber, String dateOfEmployment) {
        
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.dateOfEmployment = dateOfEmployment;
    }

    public void setEmployeeName(String employeeName) {
        
        this.employeeName = employeeName;
    }

    public void setEmployeeNumber(String employeeNumber) {
        
        this.employeeNumber = employeeNumber;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getEmployeeName() {
        
        return employeeName;
    }

    public String getEmployeeNumber() {
        
        return employeeNumber;
    }

    public String getDateOfEmployment() {
        
        return dateOfEmployment;
    }
    
    @Override
    public String toString() {
        
        String str = "Nazwisko pracownika: " + getEmployeeName() + "\n"
                   + "Numer pracownika: " + getEmployeeNumber() + "\n" 
                   + "Data zatrudnienia pracownika: " + getDateOfEmployment();
               
        return str;
    }
}
