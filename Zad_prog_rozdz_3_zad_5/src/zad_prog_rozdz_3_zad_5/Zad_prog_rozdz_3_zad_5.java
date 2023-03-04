
package zad_prog_rozdz_3_zad_5;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_5 
{
    public static void main(String[] args) 
    {
        String input;
        double masa;
        double ciezar;
        
        input = JOptionPane.showInputDialog("Aby obliczyć ciężar obiektu, podaj "
                                           + "jego masę w kilogramach: ");
        
        masa = Double.parseDouble(input);
        
        ciezar = masa * 9.8;
        
        String output1 = String.format("Ciężar obiektu wynosi %.1f N, co oznacza, "
                                      + "że obiekt jest zbyt ciężki.", ciezar);
        String output2 = String.format("Ciężar obiektu wynosi %.1f N, co oznacza, "
                                      + "że obiekt jest za lekki.", ciezar);
        String output3 = String.format("Ciężar obiektu wynosi %.1f N.", ciezar);
        
        if (ciezar > 1000)
            JOptionPane.showMessageDialog(null, output1);
        else if (ciezar < 10)
            JOptionPane.showMessageDialog(null, output2);
        else
            JOptionPane.showMessageDialog(null, output3); 
    }
}
