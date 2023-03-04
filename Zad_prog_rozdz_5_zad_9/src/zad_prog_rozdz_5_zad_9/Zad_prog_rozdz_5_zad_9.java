
package zad_prog_rozdz_5_zad_9;

import javax.swing.JOptionPane;

/**
 * Zmodyfikowana wersja programu (rozdz 4 zad 2) do
 * obliczania przejechanej odległości
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_9 {

    public static void main(String[] args) {
        
        double masa;
        double predkosc;
        double energia;
        
        masa = Double.parseDouble(JOptionPane.showInputDialog("Podaj masę obiektu (liczbę "
                                                            + "większą od zera, w kilogramach): "));
        
        while (masa <= 0)
        {
            masa = Double.parseDouble(JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                                                + "masę obiektu (liczbę "
                                                                + "większą od zera, w kilogramach: "));
        }
        
        predkosc = Double.parseDouble(JOptionPane.showInputDialog("Podaj prędkość obiektu (liczbę "
                                                                + "większą od zera, w metrach na sekundę): "));
        
        while (predkosc <= 0)
        {
            predkosc = Double.parseDouble(JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj "
                                                                    + "prędkość obiektu (liczbę "
                                                                    + "większą od zera, w metrach na sekundę): "));
        }
        
        JOptionPane.showMessageDialog(null, String.format("Energia kinetyczna obiektu wynosi: %.2f kg*m2/s2", kineticEnergy(masa, predkosc)));
    }
    
    public static double kineticEnergy(double aMasa, double aPredkosc) {
        
        return 0.5*(aMasa * Math.pow(aPredkosc, 2));
    }
}
