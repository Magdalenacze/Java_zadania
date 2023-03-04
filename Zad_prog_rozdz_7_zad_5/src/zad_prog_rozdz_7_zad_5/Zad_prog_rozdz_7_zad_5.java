
package zad_prog_rozdz_7_zad_5;

import javax.swing.JOptionPane;

/**
 * Większe od n
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_5 {

    public static void main(String[] args) {
        
        int[] array = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Podaj dowolną liczbę z przedziału od 1 do 105:"));
        
        JOptionPane.showMessageDialog(null, "Wszystkie zapisane w tablicy liczby większe od podanej to:\n" + numbers(array, n));
    }
        
    public static String numbers(int[] array, int n) {

        String values = "";

        for (int i : array) {

            if (i > n)

                values = values + "\n" + i;
        }

        return values;
    }
}
