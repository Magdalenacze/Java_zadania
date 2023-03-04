
package zad_proj_rozdz_7_zad_16;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Mistrzowie ligi baseballu
 * @author Magdalena
 */
public class Zad_proj_rozdz_7_zad_16 {

    public static void main(String[] args) throws IOException {
        
        ArrayList<String> values = new ArrayList<>();

        getValues(values);
        
        String inputUser;
        
        inputUser = JOptionPane.showInputDialog(null, "Podaj nazwę dowolnego zespołu, który wygrał ligę baseballu w latach 1903 - 2009: ");
        
        JOptionPane.showMessageDialog(null, "Podany zespół " + inputUser + " wygrał ligę baseballu w latach 1903 - 2009: " + getTotalCorrect(values, inputUser) + " razy.");
    }
    
    private static void getValues(ArrayList<String> aValues) throws IOException {
        
        File file = new File("WorldSeriesWinners.txt");
        Scanner inputFile = new Scanner(file);

        while(inputFile.hasNext()) {

            aValues.add(inputFile.nextLine());
        }

        inputFile.close();
    }
    
     private static int getTotalCorrect(ArrayList<String> aValues, String aInputUser) {
        
        int totalCorr = 0;
        
        for (int i = 0; i < aValues.size(); i++) {
            
            if (aValues.get(i).equals(aInputUser))
                
                totalCorr += 1;
        }
        
        return totalCorr;
    }
}
