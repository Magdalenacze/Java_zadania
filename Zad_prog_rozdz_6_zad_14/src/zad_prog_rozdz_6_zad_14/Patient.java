
package zad_prog_rozdz_6_zad_14;

/**
 * Klasa Patient
 * @author Magdalena
 */
public class Patient {
    
    private String name;
    private String address;
    private String phone;
    private String contactPerson;
    
    public Patient() {
        
        name = "";
        address = "";
        phone = "";
        contactPerson = "";
    }
    
    public Patient(String aName, String aAddress, String aPhone, String aContactPerson) {
        
        name = aName;
        address = aAddress;
        phone = aPhone;
        contactPerson = aContactPerson;
    }
    
    public void setName(String aName) {
        
        name = aName;
    }
    
    public void setAddress(String aAddress) {
        
        address = aAddress;
    }
    
    public void setPhone(String aPhone) {
        
        phone = aPhone;
    }
    
    public void setContactPerson(String aContactPerson) {
        
        contactPerson = aContactPerson;
    }
    
    public String getName() {
        
        return name;
    }
    
    public String getAddress() {
        
        return address;
    }
     
    public String getPhone() {
        
        return phone;
    }
      
       public String getContactPerson() {
        
        return contactPerson;
    }
}
