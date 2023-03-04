
package zad_prog_rozdz_8_zad_7;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * Plik z paragonem
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_7 {

    public static void main(String[] args) throws IOException {
        
        CashRegister cr = new CashRegister(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę kupowanych sztuk: ")), new RetailItem("Kurtka", 12, 159.95));
        
        PrintWriter outputFile = new PrintWriter("paragon.txt");
        
        outputFile.println(String.format("PARAGON\n"
                                       + "Cena za sztukę: %.2f pln\n"
                                       + "Sztuk: %d\n"
                                       + "Podsuma: %.2f pln\n"
                                       + "Podatek: %.2f pln\n"
                                       + "Suma: %.2f pln", cr.getRetailItem().getPrice(), cr.getNumber(), cr.getSubtotal(), cr.getTax(), cr.getTotal()));
        outputFile.close();
    }
}
