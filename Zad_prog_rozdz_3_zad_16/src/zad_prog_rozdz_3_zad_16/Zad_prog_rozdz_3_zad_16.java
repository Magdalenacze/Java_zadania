
package zad_prog_rozdz_3_zad_16;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_16 
{
    public static void main(String[] args) 
    {
        String input;
        String output;
        int liczbaKsiazek;
        
        input = JOptionPane.showInputDialog("Podaj liczbę książek zakupionych w "
                                           + "danym miesiącu: ");
        
        liczbaKsiazek = Integer.parseInt(input);
        
        if (liczbaKsiazek == 0)
        {
            output = String.format("Liczba książek zakupionych w danym miesiącu "
                                  + "wynosi %d sztuk.\n Otrzymujesz 0 punktów.", liczbaKsiazek);
            JOptionPane.showMessageDialog(null, output); 
        }
        else if (liczbaKsiazek == 1)
        {
            output = String.format("Liczba książek zakupionych w danym miesiącu "
                                  + "wynosi %d sztuk.\n Otrzymujesz 5 punktów.", liczbaKsiazek);
            JOptionPane.showMessageDialog(null, output); 
        }
        else if (liczbaKsiazek == 2)
        {
            output = String.format("Liczba książek zakupionych w danym miesiącu "
                                  + "wynosi %d sztuk.\n Otrzymujesz 15 punktów.", liczbaKsiazek);
            JOptionPane.showMessageDialog(null, output); 
        }
        else if (liczbaKsiazek == 3)
        {
            output = String.format("Liczba książek zakupionych w danym miesiącu "
                                  + "wynosi %d sztuk.\n Otrzymujesz 30 punktów.", liczbaKsiazek);
            JOptionPane.showMessageDialog(null, output); 
        }
        else if (liczbaKsiazek >= 4)
        {
            output = String.format("Liczba książek zakupionych w danym miesiącu "
                                  + "wynosi %d sztuk.\n Otrzymujesz 60 punktów.", liczbaKsiazek);
            JOptionPane.showMessageDialog(null, output); 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Błąd. Nieprawidłowe dane wejściowe."); 
        }
    }
}
