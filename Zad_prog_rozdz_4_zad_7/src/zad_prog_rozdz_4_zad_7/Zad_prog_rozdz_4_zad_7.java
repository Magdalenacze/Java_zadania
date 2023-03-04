
package zad_prog_rozdz_4_zad_7;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_7 
{
    public static void main(String[] args) 
    {
        String input;
        String output;
        int liczbaPieter;
        int pietroSuma;
        int pietroZajete;
        int pokojePuste = 0;
        double poziomOblozenia;
        int totalPietroSuma = 0;
        int totalPietroZajete = 0;
        
        input = JOptionPane.showInputDialog("Podaj liczbę pięter hotelu (liczbę "
                                          + "całkowitą większą bądź równą 1): ");
        liczbaPieter = Integer.parseInt(input);
        
        while (liczbaPieter < 1)
        {
            input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą bądź "
                                              + "równą 1.");
            liczbaPieter = Integer.parseInt(input);
        }
        for (int count = 1; count <= liczbaPieter; count++)
        {
            {
            input = JOptionPane.showInputDialog("Podaj liczbę wszystkich pokoi z "
                                              + count + " piętra (liczbę całkowitą "
                                              + "większą bądź równą 10): ");
            pietroSuma = Integer.parseInt(input);
            
            while (pietroSuma < 10)
            {
                input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą bądź "
                                              + "równą 10.");
                pietroSuma = Integer.parseInt(input);
            }
            totalPietroSuma += pietroSuma;
            }
            {
            input = JOptionPane.showInputDialog("Podaj liczbę zajętych pokoi z "
                                              + count + " piętra (liczbę całkowitą "
                                              + "większą bądź równą 0): ");
            pietroZajete = Integer.parseInt(input);
            
            while (pietroZajete < 0 || pietroZajete > pietroSuma)
            {
                input = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                              + "liczbę całkowitą większą bądź "
                                              + "równą 0.");
                pietroZajete = Integer.parseInt(input);
            }
            totalPietroZajete += pietroZajete;
            }
        }
        pokojePuste = totalPietroSuma - totalPietroZajete;
        poziomOblozenia = ((double) totalPietroZajete / (double) totalPietroSuma) * 100.0;
        
        output = String.format("Łączna liczba pokoi w hotelu wynosi: %d\n"
                             + "Łączna liczba zajętych pokoi w hotelu wynosi: %d\n"
                             + "Łączna liczba pustych pokoi w hotelu wynosi: %d\n"
                             + "Poziom obłożenia hotelu wynosi: "
                             + "%.1f %%", totalPietroSuma, totalPietroZajete, pokojePuste, poziomOblozenia);
        
        JOptionPane.showMessageDialog(null, output);
    } 
}
