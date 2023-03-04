
package zad_prog_rozdz_2_zad_9;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_9 
{
    public static void main(String[] args) 
    {
        String str;
        double przejechaneKilometry;
        double litryPaliwa;
        double kilometryNaLitrze;
        
        str = JOptionPane.showInputDialog("Wprowadź liczbę przejechanych "
                                         + "kilometrów: ");
        przejechaneKilometry = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Wprowadź liczbę zużytych litrów "
                                         + "paliwa: ");
        litryPaliwa = Double.parseDouble(str);
        
        kilometryNaLitrze = przejechaneKilometry / litryPaliwa;
        
        JOptionPane.showMessageDialog(null, "Liczba kilometrów przejechanych "
                + "na litrze wynosi: " + kilometryNaLitrze + ".");
    } 
}
