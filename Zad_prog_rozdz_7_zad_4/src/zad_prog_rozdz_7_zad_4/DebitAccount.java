
package zad_prog_rozdz_7_zad_4;

import java.io.*;
import java.util.Scanner;

/**
 * Klasa Debit Account
 * @author Magdalena
 */
public class DebitAccount {
    
    private int[] accountNumbers;
    
    public DebitAccount() throws IOException {
        
        File file = new File("accountNumbers.txt");
        Scanner inputFile = new Scanner(file);
        
        int total = 0;
        int index = 0;
        
        while(inputFile.hasNext()) {

            total += 1;
            inputFile.nextLine();
        }
        
        accountNumbers = new int[total];
        
        inputFile.close();
        
        inputFile = new Scanner(file);
        
        while(inputFile.hasNext()) {

            accountNumbers[index] = Integer.parseInt(inputFile.nextLine());
            
            index++;
        }
   
        inputFile.close();
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
