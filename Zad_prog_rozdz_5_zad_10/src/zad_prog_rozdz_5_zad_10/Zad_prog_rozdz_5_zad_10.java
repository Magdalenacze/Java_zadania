
package zad_prog_rozdz_5_zad_10;

import javax.swing.JOptionPane;

/**
 * Zysk ze sprzedaży akcji
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_10 {

    public static void main(String[] args) {
        
        int liczbaAkcji;
        double cenaZakup;
        double prowizjaZakup;
        double cenaSprzedaz;
        double prowizjaSprzedaz;
        double wynik;

        liczbaAkcji = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę sprzedanych akcji "
                                                                 + "(liczbę całkowitą większą od zera): "));
        
        cenaZakup = Double.parseDouble(JOptionPane.showInputDialog("Podaj cenę zakupu akcji "
                                                                 + "(liczbę większą od zera): "));
        
        prowizjaZakup = Double.parseDouble(JOptionPane.showInputDialog("Podaj kwotę prowizji od zakupu akcji "
                                                                     + "(liczbę większą od zera): "));
        
        cenaSprzedaz = Double.parseDouble(JOptionPane.showInputDialog("Podaj cenę sprzedaży akcji "
                                                                    + "(liczbę większą od zera): "));
        
        prowizjaSprzedaz = Double.parseDouble(JOptionPane.showInputDialog("Podaj kwotę prowizji od sprzedaży akcji "
                                                                        + "(liczbę większą od zera): "));
        
        wynik = zyskLubStrata((double)liczbaAkcji, cenaZakup, prowizjaZakup, cenaSprzedaz, prowizjaSprzedaz);
        
        if (wynik > 0) {
           
            JOptionPane.showMessageDialog(null, String.format("Sprzedaż akcji przyniosła zysk w wysokości %.2f pln", wynik));
        }
        else {
        
           JOptionPane.showMessageDialog(null, String.format("Sprzedaż akcji przyniosła stratę w wysokości %.2f pln", wynik));
        }
    }
    
    public static double zyskLubStrata (double aLiczbaAkcji, double aCenaZakup, double aProwizjaZakup, double aCenaSprzedaz, double aProwizjaSprzedaz) {
        
        return ((aLiczbaAkcji * aCenaZakup) - aProwizjaZakup) - ((aLiczbaAkcji * aCenaSprzedaz) + aProwizjaSprzedaz);
    }
}
