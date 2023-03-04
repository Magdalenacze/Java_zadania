
package zad_prog_rozdz_3_zad_3;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_3 
{
    public static void main(String[] args) 
    {
        String input;
        double waga;
        double wzrost;
        double BMI;
        
        input = JOptionPane.showInputDialog("Aby obliczyć Twój indeks BMI, podaj "
                                           + "swoją wagę w kilogramach: ");
        
        waga = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Aby obliczyć Twój indeks BMI, podaj "
                                           + "swój wzrost w metrach: ");
        
        wzrost = Double.parseDouble(input);
        
        BMI = waga / Math.pow(wzrost, 2);
        
        String output1 = String.format("Twoje BMI wynosi %.1f i jest to "
                                      + "wynik optymalny.", BMI);
        String output2 = String.format("Twoje BMI wynosi %.1f i wskazuje "
                                      + "na niedowagę.", BMI);
        String output3 = String.format("Twoje BMI wynosi %.1f i wskazuje "
                                      + "na nadwagę.", BMI);
        
        if (BMI >= 18.5 && BMI <= 25)
            JOptionPane.showMessageDialog(null, output1);
        else if (BMI < 18.5)
            JOptionPane.showMessageDialog(null, output2);
        else
            JOptionPane.showMessageDialog(null, output3);
    }  
}
