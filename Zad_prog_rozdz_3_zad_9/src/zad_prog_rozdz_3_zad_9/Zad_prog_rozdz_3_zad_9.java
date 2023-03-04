
package zad_prog_rozdz_3_zad_9;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_9 
{
    public static void main(String[] args) 
    {
        String input;
        double waga;
        double odleglosc1;
        double odleglosc2;
        double koszt;
        
        input = JOptionPane.showInputDialog("Podaj wagę przesyłki: ");
        
        waga = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Podaj odległość, na którą ma zostać "
                                           + "przesłana: ");
        
        odleglosc1 = Double.parseDouble(input);
        
        odleglosc2 = Math.ceil(odleglosc1/500);
        
        if (waga <= 1)
        {
            koszt = 1.1 * odleglosc2;
            String output1 = String.format("Koszt przesłania %.2f kg przesyłki "
                                          + "na odległość %.1f km wynosi %.2f "
                                          + "pln.", waga, odleglosc1, koszt);
            JOptionPane.showMessageDialog(null, output1);  
        }
        else if (waga > 1 && waga <= 3)
        {
            koszt = 2.2 * odleglosc2;
            String output2 = String.format("Koszt przesłania %.2f kg przesyłki "
                                          + "na odległość %.1f km wynosi %.2f "
                                          + "pln.", waga, odleglosc1, koszt);
            JOptionPane.showMessageDialog(null, output2);    
        }
        else if (waga > 3 && waga <= 5)
        {
            koszt = 3.7 * odleglosc2;
            String output3 = String.format("Koszt przesłania %.2f kg przesyłki "
                                          + "na odległość %.1f km wynosi %.2f "
                                          + "pln.", waga, odleglosc1, koszt);
            JOptionPane.showMessageDialog(null, output3);   
        }
        else if (waga > 5)
        {
            koszt = 3.8 * odleglosc2;
            String output4 = String.format("Koszt przesłania %.2f kg przesyłki "
                                          + "na odległość %.1f km wynosi %.2f "
                                          + "pln.", waga, odleglosc1, koszt);
            JOptionPane.showMessageDialog(null, output4);    
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Błędne dane wejściowe.");  
        }
    }
}
