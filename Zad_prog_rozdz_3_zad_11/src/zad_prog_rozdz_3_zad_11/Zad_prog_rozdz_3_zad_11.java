
package zad_prog_rozdz_3_zad_11;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_11 
{
    public static void main(String[] args) 
    {
        String input;
        String nazwisko1;
        int wynik1;
        String nazwisko2;
        int wynik2;
        String nazwisko3;
        int wynik3;
        
        nazwisko1 = JOptionPane.showInputDialog("Podaj nazwisko pierwszego "
                                               + "biegacza: ");
        
        input = JOptionPane.showInputDialog("Podaj czas ukończenia biegu "
                                            + "(w minutach) przez pierwszego "
                                            + "biegacza: ");
        
        wynik1 = Integer.parseInt(input);
        
        nazwisko2 = JOptionPane.showInputDialog("Podaj nazwisko drugiego "
                                               + "biegacza: ");
        
        input = JOptionPane.showInputDialog("Podaj czas ukończenia biegu "
                                            + "(w minutach) przez drugiego "
                                            + "biegacza: ");
        
        wynik2 = Integer.parseInt(input);
        
        nazwisko3 = JOptionPane.showInputDialog("Podaj nazwisko trzeciego "
                                               + "biegacza: ");
        
        input = JOptionPane.showInputDialog("Podaj czas ukończenia biegu "
                                            + "(w minutach) przez trzeciego "
                                            + "biegacza: ");
        
        wynik3 = Integer.parseInt(input);
        
        String output1 = String.format("Nazwiska biegaczy zgodnie z ich "
                                      + "kolejnością na mecie: "
                                      + "\n%s: %d min\n%s: %d min\n%s: "
                                      + "%d min\n", nazwisko1, wynik1, nazwisko2, wynik2, nazwisko3, wynik3);
        String output2 = String.format("Nazwiska biegaczy zgodnie z ich "
                                      + "kolejnością na mecie: "
                                      + "\n%s: %d min\n%s: %d min\n%s: "
                                      + "%d min\n", nazwisko1, wynik1, nazwisko3, wynik3, nazwisko2, wynik2);
        String output3 = String.format("Nazwiska biegaczy zgodnie z ich "
                                      + "kolejnością na mecie: "
                                      + "\n%s: %d min\n%s: %d min\n%s: "
                                      + "%d min\n", nazwisko3, wynik3, nazwisko1, wynik1, nazwisko2, wynik2);
        String output4 = String.format("Nazwiska biegaczy zgodnie z ich "
                                      + "kolejnością na mecie: "
                                      + "\n%s: %d min\n%s: %d min\n%s: "
                                      + "%d min\n", nazwisko3, wynik3, nazwisko2, wynik2, nazwisko1, wynik1);
        String output5 = String.format("Nazwiska biegaczy zgodnie z ich "
                                      + "kolejnością na mecie: "
                                      + "\n%s: %d min\n%s: %d min\n%s: "
                                      + "%d min\n", nazwisko2, wynik2, nazwisko1, wynik1, nazwisko3, wynik3);
        String output6 = String.format("Nazwiska biegaczy zgodnie z ich "
                                      + "kolejnością na mecie: "
                                      + "\n%s: %d min\n%s: %d min\n%s: "
                                      + "%d min\n", nazwisko2, wynik2, nazwisko3, wynik3, nazwisko1, wynik1);
        
        if (wynik1 < wynik2 && wynik2 < wynik3)
            JOptionPane.showMessageDialog(null, output1);
        else if (wynik1 < wynik3 && wynik3 < wynik2)
            JOptionPane.showMessageDialog(null, output2);
        else if (wynik3 < wynik1 && wynik1 < wynik2)
            JOptionPane.showMessageDialog(null, output3);
        else if (wynik3 < wynik2 && wynik2 < wynik1)
            JOptionPane.showMessageDialog(null, output4);
        else if (wynik2 < wynik1 && wynik1 < wynik3)
            JOptionPane.showMessageDialog(null, output5);
        else if (wynik2 < wynik3 && wynik3 < wynik1)
            JOptionPane.showMessageDialog(null, output6);
        else
            JOptionPane.showMessageDialog(null, "Dane wejściowe są nieprawidłowe.");
    }
}
