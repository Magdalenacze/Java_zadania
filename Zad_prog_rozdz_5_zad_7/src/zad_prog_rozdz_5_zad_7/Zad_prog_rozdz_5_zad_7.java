
package zad_prog_rozdz_5_zad_7;

import javax.swing.JOptionPane;

/**
 * Średnia z testów i oceny
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_7 {

    public static void main(String[] args) {
        
        String output = "Nr testu       Wynik       Ocena\n"
                      + "------------------------------------------\n";
        double liczbaTestow = 5.0;
        double wynik;
        double total = 0.0;
        
        for (double count = 1.0; count <= liczbaTestow; count++)
        {
            wynik = Double.parseDouble(JOptionPane.showInputDialog("Wprowadź wynik testu nr: " + count));
            
            while (wynik <= 0 || wynik >= 100) {
               
            wynik = Double.parseDouble(JOptionPane.showInputDialog("Błędny wynik. Wprowadź ponownie wynik testu nr: " + count));
            }
            
            output = output + String.format("%7.0f        %10.0f        %15.0f\n", count, wynik, determineGrade(wynik));
            
            total += wynik;
        }
   
        JOptionPane.showMessageDialog(null, output + String.format("Średnia z testów wynosi: %.1f\n", calcAverage(total, liczbaTestow)));
    } 
    
        public static double calcAverage(double aTotal, double aLiczbaTestow) {
            
            return aTotal / aLiczbaTestow;
        }
        
        public static double determineGrade(double aWynik) {
            
            if (aWynik < 60)
            {
                return 1.0;
            }
            else if (aWynik < 70)
            {
                return 2.0;
            }
            else if (aWynik < 80)
            {
                return 3.0;
            }
            else if (aWynik < 90)
            {
                return 4.0;
            }
            else
            {
                return 5.0;
            }
        }
}

