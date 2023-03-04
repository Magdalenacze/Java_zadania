
package zad_prog_rozdz_4_zad_14;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Zad_prog_rozdz_4_zad_14 
{
    public static void main(String[] args) throws IOException
    {
        String filename;
        String output = "";
        int numer = 1;
        
        filename = JOptionPane.showInputDialog("Wprowadź nazwę pliku: ");
        
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        while (inputFile.hasNext())
        {    
            output = output + "Nr " + numer++ + ": " + inputFile.nextLine() + "\n";
        }
        inputFile.close();
        
        JOptionPane.showMessageDialog(null, output);
    }  
}
