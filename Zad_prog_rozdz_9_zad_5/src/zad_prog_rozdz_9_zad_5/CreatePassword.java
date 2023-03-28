
package zad_prog_rozdz_9_zad_5;

/**
 * Klasa CreatePassword
 * @author Magdalena
 */
public class CreatePassword {
    
    private String password;
    
    public CreatePassword() {
        
        this.password = "";  
    }
    
    public CreatePassword(String password) {
        
        this.password = password;
    }
    
    public static boolean characterCountValidation(String input) {
        
        boolean user = false;
        int total = 0;
        
            for (int i = 0; i < input.length(); i++) {

                total += 1;
            }
            
            if (total >= 6) {
                
                user = true;
            }
                
        return user;        
    }
    
    public static boolean letterValidation(String input) {
        
        boolean user = false;
        int lowercaseLetter = 0;
        int uppercaseLetter = 0;
        
            for (int i = 0; i < input.length(); i++) {

                if (Character.isLowerCase(input.charAt(i))) {

                    lowercaseLetter += 1;

                } else if (Character.isUpperCase(input.charAt(i))) {

                    uppercaseLetter += 1;

                } else {

                }    
            }
            
            if (lowercaseLetter >= 1 && uppercaseLetter >= 1) {
                
                user = true;
            }
                
        return user;    
    }
    
    public static boolean digitValidation(String input) {
        
        boolean user = false;
        int digit = 0;
        
            for (int i = 0; i < input.length(); i++) {

                    digit += 1;
            }
            
            if (digit >= 1) {
                
                user = true;
            }
                
        return user;       
    }
}
