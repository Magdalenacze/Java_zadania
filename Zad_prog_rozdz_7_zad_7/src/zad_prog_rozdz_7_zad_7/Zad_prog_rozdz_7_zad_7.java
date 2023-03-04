
package zad_prog_rozdz_7_zad_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Magiczna kula
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_7 {

    public static void main(String[] args) throws IOException {
        
        ArrayList<String> answers = new ArrayList<>();
        
        getValues(answers);
        
        JOptionPane.showInputDialog(null, "Zadaj dowolne pytanie typu tak/nie: ");
            
        Random rand = new Random();
        
        JOptionPane.showMessageDialog(null, answers.get(rand.nextInt(answers.size())));
     
    }
    
    private static void getValues(ArrayList<String> answers) throws IOException {
        
        File file = new File("MagicznaKula.txt");
        Scanner inputFile = new Scanner(file);
        
        while(inputFile.hasNext()) {
            
            answers.add(inputFile.nextLine());
        }
        
        inputFile.close();
    }   
}
