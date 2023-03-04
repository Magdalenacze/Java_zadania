
package zad_prog_rozdz_2_zad_11;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_11 
{
    public static void main(String[] args) 
    {
        String str;
        double cenaDetalicznaPlytki;
        double zysk;
        
        str = JOptionPane.showInputDialog("Wprowadź cenę detaliczną płytki "
                                         + "drukowanej: ");
        cenaDetalicznaPlytki = Double.parseDouble(str);
        
        zysk = cenaDetalicznaPlytki * 0.4;
        
        JOptionPane.showMessageDialog(null, "Zysk ze sprzedaży płytki drukowanej "
                                     + "wynosi: " + zysk + " złotych.");
    }
}
