
package zad_prog_rozdz_4_zad_12;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_12 
{
    public static void main(String[] args) 
    {
        String input;
        String output = "";
        int[] sprzedazDzien = new int[5];
        final int ROWS = 5;
        int liczba;
        
        for (int count = 0; count < ROWS; count++)
        {
            input = JOptionPane.showInputDialog("Podaj wartość sprzedaży z danego "
                                              + "dnia dla sklepu nr " + count + 1 
                                              + "(liczbę całkowitą w pln).");
            sprzedazDzien[count] = Integer.parseInt(input);
        }
        
        for (int row = 0; row < ROWS; row++)
        {
            output = output + "Sklep nr: " + (row + 1);
                    
            liczba = sprzedazDzien[row] / 100;
            
            for (int col = 0; col < liczba; col++)
            {
                output = output + "*";
            }
                output = output + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
