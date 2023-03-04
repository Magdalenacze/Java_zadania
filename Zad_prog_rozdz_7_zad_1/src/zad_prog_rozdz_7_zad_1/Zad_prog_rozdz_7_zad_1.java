
package zad_prog_rozdz_7_zad_1;

import javax.swing.JOptionPane;

/**
 * RainFall
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_1 {

    public static void main(String[] args) {
        
        final int ONE_YEAR = 12;
        
        double[] rainFallMonthMain = new double[ONE_YEAR];
        
        getValues(rainFallMonthMain);
                
        RainFall year = new RainFall(rainFallMonthMain);
        
        JOptionPane.showMessageDialog(null, String.format("Łączny poziom opadów z danego roku wyniósł: %.2f mm.\n" +
                                                          "Średni miesięczny poziom opadów wyniósł: %.2f mm.\n" +
                                                          "Miesiąc o najwyższym poziomie opadów to miesiąc nr: %d.\n" +
                                                          "Miesiąc o najniższym poziomie opadów to miesiąc nr: %d.\n",
                                                          year.getTotal(),
                                                          year.getAverage(),
                                                          year.getHighest(),
                                                          year.getLowest()));
    }
    
    private static void getValues(double[] array) {
        
        for (int i = 0; i < array.length; i++) {
            
            array[i] = Double.parseDouble(JOptionPane.showInputDialog("Podaj poziom opadów z miesiąca nr " + (i + 1) + ":"));
            
            while(array[i] < 0) {
                
                array[i] = Double.parseDouble(JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj poziom opadów z miesiąca nr " + (i + 1) + " (liczba większa od 0):"));
            }
        }
    }
}
