
package zad_prog_rozdz_5_zad_16;

import javax.swing.JOptionPane;

/**
 * Wartość bieżąca
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_16 {

    public static void main(String[] args) {
        
        double wartoscPrzyszla;
        double stopa;
        int liczbaLat;
        
        wartoscPrzyszla = Double.parseDouble(JOptionPane.showInputDialog("Podaj kwotę, jaką chcesz "
                                                                       + "uzyskać na rachunku oszczędnościowym "
                                                                       + "w naszym banku: "));
        
        stopa = Double.parseDouble(JOptionPane.showInputDialog("Podaj roczną stopę oprocentowania (w procentach): "));
        
        liczbaLat = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę lat, przez jakie planujesz "
                                                               + "pozostawić pieniądze na koncie oszczędnościowym: "));
                                                            
        JOptionPane.showMessageDialog(null, String.format("Wartość bieżąca, czyli kwota, jaką należy zdeponować na rachunku\n"
                                                        + " oszczędnościowym na okres %d lat przy rocznej stopie oprocentowania\n"
                                                        + " %.2f %% wynosi: %.2f pln", liczbaLat, stopa, presentValue(wartoscPrzyszla, stopa, liczbaLat))); 
    }
    
    public static double presentValue(double aWartoscPrzyszla, double aStopa, int aLiczbaLat) {
        
        return aWartoscPrzyszla / Math.pow((1 + (aStopa * 0.01)), aLiczbaLat);
    }
}
