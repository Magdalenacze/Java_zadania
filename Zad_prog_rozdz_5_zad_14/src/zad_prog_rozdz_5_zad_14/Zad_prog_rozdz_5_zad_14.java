
package zad_prog_rozdz_5_zad_14;

import java.io.*;

/**
 * Lista liczb pierwszych
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_14 {

    public static void main(String[] args) throws IOException {
         
        PrintWriter plik = new PrintWriter("liczby pierwsze");
        
        for (int count = 1; count <= 100; count++) {
            
            if (isPrime(count)) {
            
                plik.println(count);
            }
        }
        plik.close();
    }
    
    public static boolean isPrime(int aNumber) {
        
        for (int count = 2; count < aNumber; count++) {
            
            if (aNumber % count == 0) {
               
                return false;
           }
        }
            return true; 
    }
}
