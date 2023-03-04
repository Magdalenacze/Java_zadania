
package zad_prog_rozdz_2_zad_17;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_17 
{
    public static void main(String[] args) 
    {
        String str;
        double cukier = 1.5;
        double maslo = 1.0;
        double maka = 2.75;
        int ciasteczka = 48;
        double szklankaCukru;
        double szklankaMasla;
        double szklankaMaki;
        int liczbaCiasteczek;
        
        str = JOptionPane.showInputDialog("Wprowadź oczekiwaną liczbę ciasteczek: ");
        
        liczbaCiasteczek = Integer.parseInt(str);
        
        szklankaCukru = (double)(cukier * liczbaCiasteczek) / ciasteczka;
        
        szklankaMasla = (double)(maslo * liczbaCiasteczek) / ciasteczka;
        
        szklankaMaki = (double)(maka * liczbaCiasteczek) / ciasteczka;
        
        JOptionPane.showMessageDialog(null, "Do uzyskania oczekiwanej liczby "
                                     + "ciasteczek potrzeba: " + "\n" 
                                     + szklankaCukru + " szklanki cukru" + "\n" 
                                     + szklankaMasla + " szklanki masła" + "\n"
                                     + szklankaMaki + " szklanki mąki");
    }  
}
