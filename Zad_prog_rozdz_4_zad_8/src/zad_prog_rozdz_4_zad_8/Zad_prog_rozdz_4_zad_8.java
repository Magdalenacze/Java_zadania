
package zad_prog_rozdz_4_zad_8;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_8 
{
    public static void main(String[] args) 
    {
        String input;
        String output = "Miesiąc    Opady, cm     Średnia\n"
                      + "--------------------------------\n";
        int liczbaLat;
        int opadyMiesiac;
        int[] miesiace = new int[12];
        double srednia;

        input = JOptionPane.showInputDialog("Podaj liczbę lat (liczbę całkowitą "
                                          + "większą bądź równą 1): ");
        liczbaLat = Integer.parseInt(input);
        
        while (liczbaLat < 1)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą bądź "
                                              + "równą 1.");
            liczbaLat = Integer.parseInt(input);
        }
        
        for (int lata = 1; lata <= liczbaLat; lata++)
        {
            for (int index = 0; index < miesiace.length; index++)
            {
                input = JOptionPane.showInputDialog("Podaj liczbę centymetów opadów "
                                                  + "z " + (index + 1) + " miesiąca " 
                                                  + lata + "roku (liczbę całkowitą "
                                                  + "większą bądź równą 0): ");
                opadyMiesiac = Integer.parseInt(input);
            
                while (opadyMiesiac < 0)
                {
                    input = JOptionPane.showInputDialog("Błędne dane wejściowe. "
                                                      + "Podaj liczbę całkowitą "
                                                      + "większą bądź równą 0.");
                    opadyMiesiac = Integer.parseInt(input);
                }
            miesiace[index] = miesiace[index] + opadyMiesiac;
            }
        }
        
        for (int index = 0; index < miesiace.length; index++)
        {
            srednia = (double) miesiace[index] / (double) liczbaLat;
        
            output = output + String.format("%d   %d  %.2f\n", index + 1, miesiace[index], srednia);
       }
        JOptionPane.showMessageDialog(null, output);
    }
}
