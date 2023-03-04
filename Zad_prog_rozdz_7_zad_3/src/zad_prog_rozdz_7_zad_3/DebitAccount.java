
package zad_prog_rozdz_7_zad_3;

/**
 * Klasa DebitAccount
 * @author Magdalena
 */
public class DebitAccount {
    
    private static int[] accountNumbers = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };
    
    public DebitAccount() {
        
    }
    
    public DebitAccount(int[] aAccountNumbers) {
        
        for (int index = 0; index < aAccountNumbers.length; index++) {
            
            accountNumbers[index] = aAccountNumbers[index];
        }
    }
    
    public void setAccountNumbers(int[] aAccountNumbers) {
        
        for (int index = 0; index < aAccountNumbers.length; index++) {
            
            accountNumbers[index] = aAccountNumbers[index];
        }
    }
    
    public int[] getAccountNumbers() {
        
        return accountNumbers;
    }
    
    public boolean sequentialSearch(int number) {
        
        int index = 0;
        boolean found = false;
        
        while (!found && index < accountNumbers.length) {
            
            if (accountNumbers[index] == number) {
                
                found = true;
            }
            
            index++;
        }
        
        return found;
    }
}
