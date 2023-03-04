
package zad_prog_rozdz_4_zad_1;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_1 
{
    public static void main(String[] args) 
    {
        String input;
        int number;
        int total = 0;
        
        input = JOptionPane.showInputDialog("Podaj dodatnią niezerową liczbę "
                                          + "całkowitą: ");
        number = Integer.parseInt(input);
        
        for (int count = 1; count <= number; count++)
            total += count;
        
        JOptionPane.showMessageDialog(null, "Podana dodatnia niezerowa liczba "
                                    + "całkowita to " + number + ".\n Suma ciągu "
                                    + "liczb od 1 do podanej liczby to " + total + ".");
    }   
}
