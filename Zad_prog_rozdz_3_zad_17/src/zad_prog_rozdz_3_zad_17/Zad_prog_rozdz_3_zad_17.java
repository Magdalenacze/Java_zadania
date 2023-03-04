
package zad_prog_rozdz_3_zad_17;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_17 
{
    public static void main(String[] args) 
    {
        String input;
        
        JOptionPane.showMessageDialog(null, "Uruchom ponownie komputer i spróbuj "
                                     + "nawiązać połączenie.");
        
        input = JOptionPane.showInputDialog("Czy to rozwiązało problem?");
                
        if (input.equals("tak"))
        {
            JOptionPane.showMessageDialog(null, "Świetnie! Wynika z tego, że "
                                         + "problem rozwiązany.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Uruchom ponownie router i "
                                         + "spróbuj nawiązać połączenie.");
            input = JOptionPane.showInputDialog(null, "Czy to rozwiązało problem?");
            
            if (input.equals("tak"))
            {
                JOptionPane.showMessageDialog(null, "Świetnie! Wynika z tego, że "
                                             + "problem rozwiązany.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Upewnij się, że kable "
                                                 + "prowadzące do routera i modemu "
                                                 + "są dobrze zamocowane.");
                input = JOptionPane.showInputDialog(null, "Czy to rozwiązało problem?");

                if (input.equals("tak"))
                {
                    JOptionPane.showMessageDialog(null, "Świetnie! Wynika z tego, "
                                                     + "że problem rozwiązany.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Przenieś router w inne "
                                                     + "miejsce.");
                    input = JOptionPane.showInputDialog(null, "Czy to rozwiązało problem?");

                    if (input.equals("tak"))
                    {
                        JOptionPane.showMessageDialog(null, "Świetnie! Wynika z "
                                                         + "tego, że problem rozwiązany.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Kup nowy router.");
                    }
                }
            }   
        } 
    }
}
