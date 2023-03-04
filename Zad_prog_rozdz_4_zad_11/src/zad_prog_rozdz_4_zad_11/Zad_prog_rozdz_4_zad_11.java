
package zad_prog_rozdz_4_zad_11;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_11 
{
    public static void main(String[] args) 
    {
        String output = "C    F\n"
                      + "------\n";
        int[] stopnieC = new int[21];
        double stopnieF;
        
        for (int index = 0; index < 21; index++)
        {
            stopnieF = (double) (9 * index) / 5 + 32;
           
            output = output + String.format("%d   %.1f\n", index, stopnieF);
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
