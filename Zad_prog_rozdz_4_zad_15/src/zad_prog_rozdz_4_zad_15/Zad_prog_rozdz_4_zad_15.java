
package zad_prog_rozdz_4_zad_15;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Zad_prog_rozdz_4_zad_15 
{
    public static void main(String[] args) throws IOException
    {
        String filename;
        String output = "";
        
        filename = JOptionPane.showInputDialog("Wprowadź nazwę pliku: ");
        
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        while (inputFile.hasNext())
        {
            output = output + inputFile.nextLine() + "\n";
        }
        
        output = output.toUpperCase();
            
        filename = JOptionPane.showInputDialog("Wprowadź nazwę pliku: ");
        
        PrintWriter outputFile = new PrintWriter(filename);
        outputFile.println(output);
                
        outputFile.close();
        inputFile.close();
    }
}
