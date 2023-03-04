
package zad_prog_rozdz_4_zad_2;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_2 
{
    public static void main(String[] args) 
    {
        String input;
        String output = "Czas  Szybkość  Odległość\n"
                      + "----------------------------------------\n";
        int szybkosc;
        int czas;
        int odleglosc;
        
        input = JOptionPane.showInputDialog("Podaj szybkość pojazdu (liczbę "
                                          + "całkowitą większą od zera, w "
                                          + "kilometrach na godzinę): ");
        szybkosc = Integer.parseInt(input);
        
        while (szybkosc <= 0)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą od "
                                              + "zera, w kilometrach na godzinę.");
            szybkosc = Integer.parseInt(input);
        }
        
        input = JOptionPane.showInputDialog("Podaj liczbę godzin podróży (liczbę "
                                          + "całkowitą większą bądź równą 1): ");
        czas = Integer.parseInt(input);
        
        while (czas < 1)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę godzin podróży (liczbę "
                                              + "całkowitą większą bądź równą 1): ");
            czas = Integer.parseInt(input);
        }

        for (int count = 1; count <= czas; count++)
        { 
            odleglosc = szybkosc * count;
            
            output = output + String.format("%7d  %10d  %15d\n", count, szybkosc, odleglosc);
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
