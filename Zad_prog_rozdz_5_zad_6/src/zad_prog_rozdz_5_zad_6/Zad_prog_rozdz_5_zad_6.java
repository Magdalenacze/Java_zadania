
package zad_prog_rozdz_5_zad_6;

import javax.swing.JOptionPane;

/**
 * Tabela z temperaturami w stopniach Celsjusza
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_6 {

    public static void main(String[] args) {
        
        String output = "Temp, F                           Temp, stC\n"
                      + "-------------------------------------------\n";
        
        for (double tempF = 1.0; tempF <= 20.0; tempF++) {
            
        output = output + String.format("%7.0f           %15.1f\n", tempF, celsius(tempF));
    }
    JOptionPane.showMessageDialog(null, output);
    }
    public static double celsius (double aTempF) {

        return (5 * (aTempF - 32))/9;
        
    }  
}
