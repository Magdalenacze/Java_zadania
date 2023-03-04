
package zad_prog_rozdz_3_zad_15;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_15 
{
    public static void main(String[] args) 
    {
        String input;
        String output;
        double oplata = 10.00;
        double cenaCzek;
        int liczbaCzek;
        double kwota;
        
        input = JOptionPane.showInputDialog("Podaj liczbę wystawionych czeków: ");
        
        liczbaCzek = Integer.parseInt(input);
        
        if (liczbaCzek < 20 && liczbaCzek > 0)
        {
            cenaCzek = 0.10;
            
            kwota = (double) (oplata + (cenaCzek * liczbaCzek));
            
            output = String.format("Liczba wystawionych czeków wynosi %d sztuk.\n"
                                  + "Opłaty pobrane przez bank w danym miesiącu "
                                  + "wynoszą %.2f pln.", liczbaCzek, kwota);
            JOptionPane.showMessageDialog(null, output); 
        }
        else if (liczbaCzek >= 20 && liczbaCzek <= 39)
        {
            cenaCzek = 0.08;
            
            kwota = (double) (oplata + (cenaCzek * liczbaCzek));
            
            output = String.format("Liczba wystawionych czeków wynosi %d sztuk.\n"
                                  + "Opłaty pobrane przez bank w danym miesiącu "
                                  + "wynoszą %.2f pln.", liczbaCzek, kwota);
            JOptionPane.showMessageDialog(null, output);  
        }
        else if (liczbaCzek >= 40 && liczbaCzek <= 59)
        {
            cenaCzek = 0.06;
            
            kwota = (double) (oplata + (cenaCzek * liczbaCzek));
            
            output = String.format("Liczba wystawionych czeków wynosi %d sztuk.\n"
                                  + "Opłaty pobrane przez bank w danym miesiącu "
                                  + "wynoszą %.2f pln.", liczbaCzek, kwota);
            JOptionPane.showMessageDialog(null, output);  
        }
        else if (liczbaCzek >= 60)
        {
            cenaCzek = 0.04;
            
            kwota = (double) (oplata + (cenaCzek * liczbaCzek));
            
            output = String.format("Liczba wystawionych czeków wynosi %d sztuk.\n"
                                  + "Opłaty pobrane przez bank w danym miesiącu "
                                  + "wynoszą %.2f pln.", liczbaCzek, kwota);
            JOptionPane.showMessageDialog(null, output);  
        }
        else if (liczbaCzek < 0)
        {
            JOptionPane.showMessageDialog(null, "Nieprawidłowe dane wejściowe.");  
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wystąpił nieoczekiwany błąd.");  
        }
    }
}
