
package zad_prog_rozdz_5_zad_5;

import javax.swing.JOptionPane;

/**
 * Odległość przebywana w trakcie spadania
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_5 {

    public static void main(String[] args) {
        
    String output = "Czas                           Odległość\n"
                  + "----------------------------------------\n";

    for (double time = 1.0; time <= 10.0; time++) {
            
        output = output + String.format("%7.0f           %15.2f\n", time, fallingDistance(time));
    }
    JOptionPane.showMessageDialog(null, output);
    }
    public static double fallingDistance (double aTime) {
           
        final double GR = 9.8;

        return 0.5 * GR * Math.pow(aTime, 2);
    }
    }
