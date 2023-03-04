
package zad_prog_rozdz_3_zad_2;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_2 
{
    public static void main(String[] args) 
    {
        String input;
        int dzien;
        int miesiac;
        int rok;
        
        input = JOptionPane.showInputDialog("Podaj wybrany dzień danego miesiąca: ");                             
        
        dzien = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Podaj w formie liczby wybrany miesiąc: ");
        
        miesiac = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Podaj dwie ostatnie cyfry wybranego roku: ");
        
        rok = Integer.parseInt(input);
        
        if (rok == dzien * miesiac)
        {
            JOptionPane.showMessageDialog(null, "Podana data jest magiczna.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Podana data nie jest magiczna.");
        }     
    }  
}
