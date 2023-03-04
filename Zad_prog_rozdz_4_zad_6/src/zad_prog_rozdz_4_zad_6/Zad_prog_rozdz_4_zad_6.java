
package zad_prog_rozdz_4_zad_6;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Zad_prog_rozdz_4_zad_6 
{
    public static void main(String[] args) throws IOException
    {
        String filename;
        String input;
        String line;
        int total = 0;
        
        filename = JOptionPane.showInputDialog("Wprowadź nazwę pliku: ");
        
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        input = JOptionPane.showInputDialog("Podaj dowolny znak, występujący lub "
                                          + "nie występujący w wybranym pliku: ");
        
        while (input.equals("") || input.length() != 1)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Nie podano "
                                               + "jakiegokolwiek znaku lub podano "
                                               + "więcej niż 1 znak.");
        }
        while (inputFile.hasNext())
        {
            line = inputFile.nextLine();

            for (int count = 0; count < line.length(); count++)
            {
                if (line.charAt(count) == input.charAt(0))
                {
                    total += 1;
                }
            }
        }
        inputFile.close();
        
        JOptionPane.showMessageDialog(null, "Sumaryczna liczba wystąpień określonego "
                                    + "znaku w wybranym pliku wynosi: " + total);
    }  
}
