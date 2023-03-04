
package zad_prog_rozdz_5_zad_11;

import javax.swing.JOptionPane;

/**
 * Sprzedaż akcji różnych firm
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_11 {

    public static void main(String[] args) {
        
        int liczbaFirm;
        int liczbaAkcji;
        double cenaZakup;
        double prowizjaZakup;
        double cenaSprzedaz;
        double prowizjaSprzedaz;
        double total = 0.0;

        liczbaFirm = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę firm sprzedających akcje "
                                                                + "(liczbę całkowitą większą od zera): "));
        
        for(int count = 1; count <= liczbaFirm; count++) {
        
        liczbaAkcji = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę sprzedanych akcji firmy nr: " + count
                                                                 + " (liczbę całkowitą większą od zera): "));
        
        cenaZakup = Double.parseDouble(JOptionPane.showInputDialog("Podaj cenę zakupu akcji firmy nr: " + count
                                                                 + " (liczbę większą od zera): "));
        
        prowizjaZakup = Double.parseDouble(JOptionPane.showInputDialog("Podaj kwotę prowizji od zakupu akcji firmy nr: " + count
                                                                     + " (liczbę większą od zera): "));
        
        cenaSprzedaz = Double.parseDouble(JOptionPane.showInputDialog("Podaj cenę sprzedaży akcji firmy nr: " + count
                                                                    + " (liczbę większą od zera): "));
        
        prowizjaSprzedaz = Double.parseDouble(JOptionPane.showInputDialog("Podaj kwotę prowizji od sprzedaży akcji firmy nr: " + count
                                                                        + " (liczbę większą od zera): "));
        
        total += zyskLubStrata(liczbaAkcji, cenaZakup, prowizjaZakup, cenaSprzedaz, prowizjaSprzedaz);
        }
        
        if (total > 0) {
           
            JOptionPane.showMessageDialog(null, String.format("Sprzedaż akcji wszystkich firm przyniosła zysk w wysokości %.2f pln", total));
        }
        else {
        
           JOptionPane.showMessageDialog(null, String.format("Sprzedaż akcji wszystkich firm przyniosła stratę w wysokości %.2f pln", total));
        }
    }
    
    public static double zyskLubStrata (int aLiczbaAkcji, double aCenaZakup, double aProwizjaZakup, double aCenaSprzedaz, double aProwizjaSprzedaz) {
        
        return ((aLiczbaAkcji * aCenaZakup) - aProwizjaZakup) - ((aLiczbaAkcji * aCenaSprzedaz) + aProwizjaSprzedaz);
    }
}
