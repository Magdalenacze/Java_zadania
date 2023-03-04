
package zad_prog_rozdz_8_zad_6;

/**
 * Klasa CashRegister
 * @author Magdalena
 */
public class CashRegister {
    
    private int number;
    private RetailItem retailItem;
    
    public CashRegister() {
        
        number = 0;
        retailItem = new RetailItem();
    }
    
    public CashRegister(int aNumber, RetailItem aRetailItem) {
        
        number = aNumber;
        retailItem = new RetailItem(aRetailItem);
    }
    
    public void setNumber(int aNumber) {
        
        number = aNumber;
    }
    
    public RetailItem getRetailItem() {
        
        return new RetailItem(retailItem);
    }
    
    public double getSubtotal() {
        
        return number * retailItem.getPrice();
    }
    
    public double getTax() {
        
        return getSubtotal() * 0.23;
    }
    
    public double getTotal() {
        
        return getSubtotal() + getTax();
    }   
}
