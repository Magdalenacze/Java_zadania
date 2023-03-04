
package zad_prog_rozdz_6_zad_4;

import javax.swing.JOptionPane;

/**
 * Klasa RetailItem
 * @author Magdalena
 */
public class RetailItem {
    
    private String description;
    private int unitsOnHand;
    private double price;
    
    public RetailItem(String aDescription, int aUnitsOnHand, double aPrice) {
        
        description = aDescription;
        unitsOnHand = aUnitsOnHand;
        price = aPrice;  
    } 
    
    public void setDescription(String aDescription) {
        
        description = aDescription;
    }
    
    public void setUnitsOnHand(int aUnitsOnHand) {
        
        unitsOnHand = aUnitsOnHand;
    }
    
    public void setPrice(double aPrice) {
        
        price = aPrice;
    }
    
    public String getDescription() {
        
        return description;
    }
    
    public int getUnitsOnHand() {
        
        return unitsOnHand;
    }
    
    public double getPrice() {
        
        return price;
    }
    
    public void show() {
         
        JOptionPane.showMessageDialog(null, "Opis: " + description + "\n" + "Liczba sztuk: " + unitsOnHand + "\n"
                                          + "Cena: " + price);
     }
}
