
package zad_prog_rozdz_7_zad_8;

import javax.swing.JOptionPane;

/**
 * Lista ocen
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_8 {

    public static void main(String[] args) {

        Ratings r = new Ratings();
        
        int test;
        String output = "";
        
        for (int i = 0; i < 5; i++) {
            
            r.setNames(JOptionPane.showInputDialog(null, "Podaj imię i nazwisko studenta nr " + (i + 1) + ": "));
            
            test = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj wynik testu nr 1 (liczbę z zakresu od 0 do 100): "));
                    
            while (test < 0 || test > 100) {
                
                test = Integer.parseInt(JOptionPane.showInputDialog(null, "Błędne dane wejściowe. Podaj wynik testu nr 1 (liczbę z zakresu od 0 do 100): "));
            }
            
            r.setTest1(test);
            
            test = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj wynik testu nr 2 (liczbę z zakresu od 0 do 100): "));
                    
            while (test < 0 || test > 100) {
                
                test = Integer.parseInt(JOptionPane.showInputDialog(null, "Błędne dane wejściowe. Podaj wynik testu nr 2 (liczbę z zakresu od 0 do 100): "));
            }
            
            r.setTest2(test);
            
            test = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj wynik testu nr 3 (liczbę z zakresu od 0 do 100): "));
                    
            while (test < 0 || test > 100) {
                
                test = Integer.parseInt(JOptionPane.showInputDialog(null, "Błędne dane wejściowe. Podaj wynik testu nr 3 (liczbę z zakresu od 0 do 100): "));
            }
            
            r.setTest3(test);
            
            test = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj wynik testu nr 4 (liczbę z zakresu od 0 do 100): "));
                    
            while (test < 0 || test > 100) {
                
                test = Integer.parseInt(JOptionPane.showInputDialog(null, "Błędne dane wejściowe. Podaj wynik testu nr 4 (liczbę z zakresu od 0 do 100): "));
            }
            
            r.setTest4(test);   
        }
        
        r.average();
        
        r.ratings();
        
        for (int i = 0; i < 5; i++) {

            output = output + "Imię i nazwisko studenta: " + r.getNames(i) + "\n" + "Średni wynik testów: " + r.getAverage(i) + "\n" + "Ocena: " + r.getRatings(i) + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }
}
