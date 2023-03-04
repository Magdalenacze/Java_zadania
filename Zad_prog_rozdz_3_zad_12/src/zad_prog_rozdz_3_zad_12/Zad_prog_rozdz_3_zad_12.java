
package zad_prog_rozdz_3_zad_12;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_12 
{
    public static void main(String[] args) 
    {
        String input1;
        String input2;
        double odleglosc;
        double czas;
        
        input1 = JOptionPane.showInputDialog("Wpisz jedno z następujących słów:\n "
                                            + "powietrze, woda lub stal.");
        
        input2 = JOptionPane.showInputDialog("Podaj odległość (w metrach), jaką "
                                           + "fala dźwiękowa ma przebyć w "
                                           + "wybranym nośniku: ");
        
        odleglosc = Double.parseDouble(input2);
        
        switch (input1)
        {
            case "powietrze":
                czas = odleglosc / 343;
                String output1 = String.format("Czas potrzebny do pokonania przez "
                                              + "dźwięk podanej odległości w "
                                              + "powietrzu wynosi %.0f s.", czas);
                JOptionPane.showMessageDialog(null, output1);
                break;
            case "woda":
                czas = odleglosc / 1490;
                String output2 = String.format("Czas potrzebny do pokonania przez "
                                              + "dźwięk podanej odległości w "
                                              + "wodzie wynosi %.0f s.", czas);
                JOptionPane.showMessageDialog(null, output2);
                break;
            case "stal":
                czas = odleglosc / 5100;
                String output3 = String.format("Czas potrzebny do pokonania przez "
                                              + "dźwięk podanej odległości w "
                                              + "stali wynosi %.0f s.", czas);
                JOptionPane.showMessageDialog(null, output3);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wpisz jedno z następujących "
                                             + "słów:\n powietrze, woda lub stal.");
        }
    }
}
