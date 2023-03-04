
package zad_prog_rozdz_5_zad_8;

import javax.swing.JOptionPane;

/**
 * Program konwertujący
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_8 {

    public static void main(String[] args) {
        
        double meters;
        int wybor = 1;
        
        while (wybor != 4) {
            
        meters = Double.parseDouble(JOptionPane.showInputDialog("Wprowadź odległość w metrach: " ));
            
            while (meters <= 0)
               
            meters = Double.parseDouble(JOptionPane.showInputDialog("Błędny wynik. Wprowadź ponownie "
                                                                     + "odległość w metrach: "));
            wybor = menu();
            
            switch (wybor)
            {    
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Dziękuję, polecam się na przyszłość :)");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Błąd. Podana cyfra nie należy "
                                                 + "do przedziału od 1 do 4.");
            }
        }
    }
        public static int menu() {

            int lWybor;

            lWybor = Integer.parseInt(JOptionPane.showInputDialog("Wybierz jedną z podanych poniżej opcji "
                                                               + "(wpisując cyfrę od 1 do 4):\n"
                                                               + "1. Konwersja metrów na kilometry\n"
                                                               + "2. Konwersja metrów na cale\n"
                                                               + "3. Konwersja metrów na stopy\n"
                                                               + "4. Wyjście z programu"));
            
            while (lWybor != 1 && lWybor != 2 && lWybor != 3 && lWybor != 4)
               
            lWybor = Integer.parseInt(JOptionPane.showInputDialog("Błędny wynik. Wprowadź ponownie "
                                                               + "cyfrę z przedziału od 1 do 4:\n"
                                                               + "1. Konwersja metrów na kilometry\n"
                                                               + "2. Konwersja metrów na cale\n"
                                                               + "3. Konwersja metrów na stopy\n"
                                                               + "4. Wyjście z programu"));
            return lWybor;
        }
        
        public static void showKilometers(double aMeters) {
   
            double kilometers = aMeters * 0.001;
            
            JOptionPane.showMessageDialog(null, String.format ("Podana odległość w metrach %.2f "
                                                             + "odpowiada %.2f kilometrom.", aMeters, kilometers));
        }
        
        public static void showInches(double aMeters) {
            
            double inches = aMeters * 39.37;
            
            JOptionPane.showMessageDialog(null, String.format ("Podana odległość w metrach %.2f "
                                                             + "odpowiada %.2f calom.", aMeters, inches));
        }
        
        public static void showFeet(double aMeters) {
            
            double feet = aMeters * 3.281;
            
            JOptionPane.showMessageDialog(null, String.format ("Podana odległość w metrach %.2f "
                                                             + "odpowiada %.2f stopom.", aMeters, feet));
        }
}