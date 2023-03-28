
package zad_prog_rozdz_9_zad_10;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Licznik słów
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_10 {

    public static void main(String[] args) throws IOException {
        
        String filename = JOptionPane.showInputDialog(null, "Podaj nazwę pliku: ");
        
        JOptionPane.showMessageDialog(null, "Suma wszystkich zawartych w pliku słów wynosi: " + sumOfWords(openingTheFile(filename)));
    }
    
    private static String openingTheFile(String filename) throws IOException {
            
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        String input = "";
        
        while (inputFile.hasNext()) {
            
            input += inputFile.nextLine() + "\n";
        }
        
        inputFile.close();
        
        return input;
    }
    
    private static int sumOfWords(String input) throws IOException {

        input = input.trim();
        char[] array = input.toCharArray();
        int whitespaces = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            if (Character.isWhitespace(array[i])) {
            
                whitespaces++;
            }
        }
        
        return whitespaces + 1;
    }
}
