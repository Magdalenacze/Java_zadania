
package zad_prog_rozdz_4_zad_9;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_9 
{
    public static void main(String[] args) 
    {
        String input;
        int wielkoscPopulacji;
        int sredniDziennyPrzyrost;
        int liczbaDni;
        
        input = JOptionPane.showInputDialog("Podaj początkową liczbę organizmów "
                                          + "(liczbę całkowitą większą bądź równą 2): ");
        wielkoscPopulacji = Integer.parseInt(input);
        
        while (wielkoscPopulacji < 2)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą bądź "
                                              + "równą 2.");
            wielkoscPopulacji = Integer.parseInt(input);
        }
        
        input = JOptionPane.showInputDialog("Podaj średni dzienny przyrost populacji "
                                          + "w procentach (liczbę całkowitą większą "
                                          + "bądź równą 0): ");
        sredniDziennyPrzyrost = Integer.parseInt(input);
        
        while (sredniDziennyPrzyrost < 0)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą bądź "
                                              + "równą 0.");
            sredniDziennyPrzyrost = Integer.parseInt(input);
        }
        input = JOptionPane.showInputDialog("Podaj liczbę dni rozmnażania się organizmów "
                                          + "(liczbę całkowitą większą bądź równą 1): ");
        liczbaDni = Integer.parseInt(input);
        
        while (liczbaDni < 1)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą bądź "
                                              + "równą 1.");
            liczbaDni = Integer.parseInt(input);
        }
        
        String output = "Początkowa liczba organizmów wynosi: " + wielkoscPopulacji + "\n"
                + "Średni dzienny przyrost populacji wynosi: " + sredniDziennyPrzyrost + "%\n"
                + "Liczba dni rozmnażania się organizmów wynosi: " + liczbaDni + "\n"
                + "Dzień rozmnażania  Wielkość populacji\n"
                + "-------------------------------------\n";
        
        for (int count = 1; count <= liczbaDni; count++)
        {
            wielkoscPopulacji = wielkoscPopulacji + (wielkoscPopulacji * sredniDziennyPrzyrost) / 100;
            
            output = output + String.format("%d     %d\n", count, wielkoscPopulacji);
        }
            JOptionPane.showMessageDialog(null, output);
    }
}
