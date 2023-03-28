
package zad_prog_rozdz_9_zad_4;

/**
 * Klasa Alphabet
 * @author Magdalena
 */
public class Alphabet {
    
    static String vowels = "aąeęiouóy";
    static String consonants = "bcćdfghjklłmnńprsśtwxzżź";
    
    public Alphabet() {
        
    }
    
    public Alphabet (String vowels, String consonants) {
        
        this.vowels = vowels;
        this.consonants = consonants;
    }
    
    public static int getSumOfVowels(String input) {
        
        int totalVowels = 0;
        
        for (int count = 0; count < vowels.length(); count++) {
            
            for (int i = 0; i < input.length(); i++) {
                
                if (vowels.charAt(count) == input.charAt(i)) {
                
                totalVowels += 1;
                }
            }
        }
        
        return totalVowels;
    }
    
    public static int getSumOfConsonants(String input) {
        
        int totalConsonants = 0;
        
        for (int count = 0; count < consonants.length(); count++) {
            
            for (int i = 0; i < input.length(); i++) {
                
                if (consonants.charAt(count) == input.charAt(i)) {
                
                totalConsonants += 1;
                }
            }
        }
        
        return totalConsonants;
    }
    
    public static int getSumOfTotal(String input) {
        
        return getSumOfVowels(input) + getSumOfConsonants(input);
    } 
}
