
package zad_prog_rozdz_6_zad_8;

import javax.swing.JOptionPane;

/**
 * Klasa Temperature
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_8 {

    public static void main(String[] args) {
        
        Temperature t = new Temperature(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj temperaturę w stopniach Fahrenheita: ")));
        
        JOptionPane.showMessageDialog(null, String.format("Podana temperatura w stopniach Fahrenheita to: %.1f\n"
                                                        + "Temperatura po konwersji na stopnie Celsjusza wynosi: %.1f\n"
                                                        + "Temperatura po konwersji na kelwiny wynosi: %.1f\n", t.getFahrenheit(), t.celsius(), t.kelvin()));
    }
}
