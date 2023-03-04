
package zad_prog_rozdz_4_zad_13;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Zad_prog_rozdz_4_zad_13 
{
    public static void main(String[] args) throws IOException
    {
        String filename;
        String output = "";
        
        filename = JOptionPane.showInputDialog("Wprowadź nazwę pliku: ");
        
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        for (int count = 0; count < 5; count++)
        {
            if (inputFile.hasNext())
                    
                output = output + inputFile.nextLine() + "\n";
        }
        inputFile.close();
        
        JOptionPane.showMessageDialog(null, output);
    }  
 }
