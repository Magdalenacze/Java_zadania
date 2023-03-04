
package zad_prog_rozdz_4_zad_16;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_16 
{
    public static void main(String[] args) 
    {
        String input;
        String output = "";
        double budzet;
        double wydatki;
        double roznica;
        double total = 0.00;
        
        input = JOptionPane.showInputDialog("Podaj swój miesięczny budżet: ");
        budzet = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Podaj pierwszy wydatek w danym "
                                          + "miesiącu. Aby zakończyć, wpisz 0.");
        wydatki = Double.parseDouble(input);
        
        while (wydatki != 0)
        {
            total += wydatki;
            
            input = JOptionPane.showInputDialog("Podaj kolejny wydatek w danym "
                                          + "miesiącu. Aby zakończyć, wpisz 0.");
            wydatki = Double.parseDouble(input);
        }
        
        roznica = budzet - total;
        
        if (roznica >= 0)
        {  
        output = String.format ("Miesięczny budżet użytkownika wynosił %.2f pln, "
                              + "z czego suma wszystkich wydatków wyniosła %.2f.\n "
                              + "Oznacza to, że z zaplanowanego miesięcznego "
                              + "budżetu pozostało %.2f pln.", budzet, total, roznica);          
        JOptionPane.showMessageDialog(null, output);
        }
        else
        JOptionPane.showMessageDialog(null, "Uwaga! Twoje wydatki w danym miesiącu "
                                    + "przekroczyły zaplanowany budżet.");
    }
}
