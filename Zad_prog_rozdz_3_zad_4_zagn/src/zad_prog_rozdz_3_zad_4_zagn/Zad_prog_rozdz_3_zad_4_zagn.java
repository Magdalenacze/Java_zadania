
package zad_prog_rozdz_3_zad_4_zagn;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_4_zagn 
{
    public static void main(String[] args) 
    {
       String input;
        int wynik1;
        int wynik2;
        int wynik3;
        int srednia;
        
        input = JOptionPane.showInputDialog("Podaj wynik testu nr 1: ");
        
        wynik1 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Podaj wynik testu nr 2: ");
        
        wynik2 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Podaj wynik testu nr 3: ");
        
        wynik3 = Integer.parseInt(input);
        
        srednia = (wynik1 + wynik2 + wynik3) / 3;
        
        String output1 = String.format("Twój średni wynik z trzech testów wynosi "
                                      + "%d, co odpowiada ocenie 1.", srednia);
        String output2 = String.format("Twój średni wynik z trzech testów wynosi "
                                      + "%d, co odpowiada ocenie 2.", srednia);
        String output3 = String.format("Twój średni wynik z trzech testów wynosi "
                                      + "%d, co odpowiada ocenie 3.", srednia);
        String output4 = String.format("Twój średni wynik z trzech testów wynosi "
                                      + "%d, co odpowiada ocenie 4.", srednia);
        String output5 = String.format("Twój średni wynik z trzech testów wynosi "
                                      + "%d, co odpowiada ocenie 5.", srednia);
        
        if (wynik1 >= 0 && wynik1 <= 100 && wynik2 >= 0 && wynik2 <= 100 && wynik3 >= 0 && wynik3 <= 100)
        {
            if (srednia < 60)
            {
                JOptionPane.showMessageDialog(null, output1);
            }
            else if (srednia < 70)
            {
                JOptionPane.showMessageDialog(null, output2);
            }
            else if (srednia < 80)
            {
                JOptionPane.showMessageDialog(null, output3);
            }
            else if (srednia < 90)
            {
                JOptionPane.showMessageDialog(null, output4);
            }
            else if (srednia <= 100)
            {
                JOptionPane.showMessageDialog(null, output5);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Błędny wynik.");
        }
    }
}