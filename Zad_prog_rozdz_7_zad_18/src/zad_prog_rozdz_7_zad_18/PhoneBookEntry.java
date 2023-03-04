
package zad_prog_rozdz_7_zad_18;

/**
 * Klasa PhoneBookEntry
 * @author Magdalena
 */
public class PhoneBookEntry {
    
    private String name;
    private int phone;
    
    public PhoneBookEntry() {
        
        name = "";
        phone = 0;
    }
    
    public PhoneBookEntry(String aName, int aPhone) {
        
        name = aName;
        phone = aPhone;
    }
    
    public void setName(String aName) {
        
        name = aName;
    }
    
    public void setPhone(int aPhone) {
        
        phone = aPhone;
    }
    
    public String getName() {
        
        return name;
    }
    
    public int getPhone() {
        
        return phone;
    }  
}
