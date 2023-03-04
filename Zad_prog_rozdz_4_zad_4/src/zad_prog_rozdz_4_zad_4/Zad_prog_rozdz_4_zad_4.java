
package zad_prog_rozdz_4_zad_4;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_4 
{
    public static void main(String[] args) 
    {
        String input;
        String output = "Czas, dni  Wynagrodzenie, pln\n"
                      + "-----------------------------\n";
        double czas;
        double zaplata = 0.01;
        double total = 0.00;
        
        input = JOptionPane.showInputDialog("Podaj liczbę przepracowanych dni "
                                          + "(liczbę całkowitą większą bądź równą 1): ");
        czas = Double.parseDouble(input);
        
        while (czas < 1)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą bądź "
                                              + "równą 1.");
            czas = Double.parseDouble(input);
        }
        
        for (double count = 1; count <= czas; count++)
        { 
            total += zaplata;
            
            output = output + String.format("%7.0f  %10.2f\n", count, zaplata);
            
            zaplata = zaplata * 2;
        }
        JOptionPane.showMessageDialog(null, output + String.format("Sumaryczna "
                                    + "zapłata za podaną liczbę dni przepracowanych "
                                    + "wynosi %.2f pln.", total));
    }   
}
