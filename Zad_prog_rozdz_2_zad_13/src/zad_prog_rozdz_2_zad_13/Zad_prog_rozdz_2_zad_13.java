
package zad_prog_rozdz_2_zad_13;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_13 
{
    public static void main(String[] args) 
    {
        String str;
        double cenaPosilku;
        double podatek;
        double napiwek;
        double lacznaKwota;
        
        str = JOptionPane.showInputDialog("Wprowadź cenę posiłku: ");
        cenaPosilku = Double.parseDouble(str);
        
        podatek = cenaPosilku * 0.0675;
        napiwek = (cenaPosilku + podatek) * 0.2;
        lacznaKwota = cenaPosilku + podatek + napiwek;
        
        JOptionPane.showMessageDialog(null, "Cena posiłku wynosi: " 
                                     + cenaPosilku + " złotych." +"\nWartość "
                                     + "podatku wynosi: " + podatek + " złotych."
                                     + "\nWysokość napiwku wynosi: " + napiwek 
                                     + " złotych."+ "\nŁączna kwota do zapłaty "
                                     + "wynosi: " + lacznaKwota + " złotych.");
    }
}
