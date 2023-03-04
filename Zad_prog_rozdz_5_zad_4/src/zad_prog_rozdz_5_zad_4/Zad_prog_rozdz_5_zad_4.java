
package zad_prog_rozdz_5_zad_4;

import javax.swing.JOptionPane;

/**
 * Kalkulator szacunkowych kosztów malowania
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_4 {

    public static void main(String[] args) {
        
        final double LITR_M2 = 0.15;
        final double GODZINA_M2 = 0.8;
        final double ROBOCIZNA_H = 18.00;
        int liczbaPokojow;
        double cenaLitr;
        double total = 0.0;
        
        cenaLitr = Double.parseDouble(JOptionPane.showInputDialog("Podaj cenę za litr wybranej farby: "));
        
        liczbaPokojow = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę pokojów do pomalowania: "));
        
        while (liczbaPokojow < 1)
        {
            liczbaPokojow = Integer.parseInt(JOptionPane.showInputDialog("Błędne dane wejściowe. "
                                              + "Podaj liczbę pokojów (liczbę całkowitą "
                                              + "większą bądź równą 1): "));
        }

        for (int count = 1; count <= liczbaPokojow; count++)
        {
            total += Double.parseDouble(JOptionPane.showInputDialog("Wprowadź powierzchnię pokoju nr: " + count));
        }
      
        double liczbaLitrow = getLiczbaLitrow(total, LITR_M2);
        
        double liczbaGodzin = getLiczbaGodzin(total, GODZINA_M2);
        
        double kosztFarby = getKosztFarby(cenaLitr, liczbaLitrow);
        
        double kosztRobocizny = getKosztRobocizny(liczbaGodzin, ROBOCIZNA_H);
        
        double kosztMalowania = getKosztMalowania(cenaLitr, liczbaLitrow, liczbaGodzin, ROBOCIZNA_H);
        
        JOptionPane.showMessageDialog(null, String.format("Liczba pokojów do pomalowania to: %d\n"
                                     + "Cena farby za litr wynosi: %.2f pln\n"
                                     + "Liczba potrzebnych litrów farby wynosi: %.1f l\n"
                                     + "Liczba potrzebnych godzin pracy wynosi: %.1f h\n"
                                     + "Całkowity koszt farby wynosi: %.2f pln\n"
                                     + "Całkowity koszt robocizny wynosi: %.2f pln\n"
                                     + "Całkowity koszt malowania to: %.2f pln", liczbaPokojow, cenaLitr, liczbaLitrow, liczbaGodzin, kosztFarby, kosztRobocizny, kosztMalowania));
    }
    
    public static double getLiczbaLitrow(double aTotal, final double aLITR_M2) {
            
        return aTotal * aLITR_M2;
    }
    public static double getLiczbaGodzin(double aTotal, final double aGODZINA_M2) {
    
        return aTotal * aGODZINA_M2;
    }
    public static double getKosztFarby(double aCenaLitr, double aLiczbaLitrow) {
    
        return aCenaLitr * aLiczbaLitrow;
    }
    public static double getKosztRobocizny(double aLiczbaGodzin, final double aROBOCIZNA_H) {
           
        return aLiczbaGodzin * aROBOCIZNA_H;
    }
    public static double getKosztMalowania(double aCenaLitr, double aLiczbaLitrow, double aLiczbaGodzin, final double aROBOCIZNA_H) {
            
        return getKosztFarby(aCenaLitr, aLiczbaLitrow) + getKosztRobocizny(aLiczbaGodzin, aROBOCIZNA_H);
    }
}
