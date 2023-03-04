
package zad_prog_rozdz_6_zad_3;

import javax.swing.JOptionPane;

/**
 * Klasa z danymi osobowymi
 * @author Magdalena
 */
public class PersonalData {
    
    private String name;
    private String address;
    private int age;
    private int phoneNumber;
    
    public PersonalData(String aName, String aAddress, int aAge, int aPhoneNumber) {
        
        name = aName;
        address = aAddress;
        age = aAge;
        phoneNumber = aPhoneNumber;
    }
    
    public void setName(String aName) {
        
        name = aName;
    }
    
    public void setAddress(String aAddress) {
        
        address = aAddress;
    }
    
    public void setAge(int aAge) {
        
        age = aAge;
    }
    
    public void setPhoneNumber(int aPhoneNumber) {
        
        phoneNumber = aPhoneNumber;
    }
    
    public String getName() {
        
        return name;
    }
    
    public String getAddress() {
        
        return address;
    }
     
    public int getAge() {
        
        return age;
    }
    
    public int getPhoneNumber() {
        
        return phoneNumber;
    }
    
    public void show() {
         
        JOptionPane.showMessageDialog(null, "Imię i nazwisko: " + name + " \n" + "Adres: " + address + " \n"
                                          + "Wiek: " + age + " \n" + "Numer telefonu: " + phoneNumber);
     }
}
