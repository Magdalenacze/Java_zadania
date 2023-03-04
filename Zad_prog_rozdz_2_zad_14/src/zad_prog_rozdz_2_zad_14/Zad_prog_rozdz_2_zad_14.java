
package zad_prog_rozdz_2_zad_14;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_14 
{
    public static void main(String[] args) 
    {
        String str;
        double liczbaKobiet;
        double liczbaMezczyzn;
        double odsetekKobiet;
        double odsetekMezczyzn;
        
        str = JOptionPane.showInputDialog("Wprowadź liczbę kobiet "
                                         + "zarejestrowanych na kurs: ");
        liczbaKobiet = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Wprowadź liczbę mężczyzn "
                                         + "zarejetrowanych na kurs: ");
        liczbaMezczyzn = Double.parseDouble(str);
        
        odsetekKobiet = (liczbaKobiet / (liczbaKobiet + liczbaMezczyzn)) * 100;
        
        odsetekMezczyzn = (liczbaMezczyzn / (liczbaKobiet + liczbaMezczyzn)) * 100;
        
        JOptionPane.showMessageDialog(null, "Odsetek kobiet zarejestrowanych na "
                                     + "kurs wynosi: " + odsetekKobiet + " %." 
                                     + "\nOdsetek mężczyzn zarejestrowanych na "
                                     + "kurs wynosi: " + odsetekMezczyzn + " %.");
    }
}
