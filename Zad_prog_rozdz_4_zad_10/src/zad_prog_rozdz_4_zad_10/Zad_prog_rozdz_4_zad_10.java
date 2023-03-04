
package zad_prog_rozdz_4_zad_10;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_10 
{
    public static void main(String[] args) 
    {
        String input;
        String output;
        int liczba;
        int min;
        int max;
        
        input = JOptionPane.showInputDialog("Podaj dowolną liczbę całkowitą. "
                                          + "Aby zakończyć, wpisz -99.");
        liczba = Integer.parseInt(input);
        
        min = liczba;
        max = liczba;
        
        while (liczba != -99)
        {
            input = JOptionPane.showInputDialog("Podaj kolejną, dowolną liczbę "
                                              + "całkowitą. Aby zakończyć, wpisz -99.");
            liczba = Integer.parseInt(input);
            
            if (liczba < min && liczba != -99)
                
                min = liczba;
            
            if (liczba > max && liczba != -99)
                
                max = liczba;
        }
        output = String.format("Najmniejsza wprowadzona wartość to: %d\n"
                             + "Największa wprowadzona wartość to: %d", min, max);
        
        JOptionPane.showMessageDialog(null, output);
    } 
}
