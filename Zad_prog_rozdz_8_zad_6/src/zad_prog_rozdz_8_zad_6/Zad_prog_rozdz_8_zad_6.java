
package zad_prog_rozdz_8_zad_6;

import javax.swing.JOptionPane;

/**
 * CashRegister
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_6 {

    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę kupowanych sztuk: ")), new RetailItem("Kurtka", 12, 159.95));
        
        cr.getRetailItem().getPrice();
        
        JOptionPane.showMessageDialog(null, String.format("Podsumowanie transakcji (kwota netto): %.2f pln\n\n"
                                                        + "Podatek od sprzedaży: %.2f pln\n\n"
                                                        + "Łączna kwota do zapłaty (kwota brutto): %.2f pln", cr.getSubtotal(), cr.getTax(), cr.getTotal()));
    }
}
