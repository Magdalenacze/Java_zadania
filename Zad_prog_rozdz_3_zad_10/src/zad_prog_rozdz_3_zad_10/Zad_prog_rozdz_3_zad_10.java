
package zad_prog_rozdz_3_zad_10;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_10 
{
    public static void main(String[] args) 
    {
        String input;
        double kalorieSuma;
        double gramyTluszcz;
        double kalorieTluszcz;
        double procentKalorieTluszcz;
        
        input = JOptionPane.showInputDialog("Podaj liczbę kalorii w produkcie: ");
        
        kalorieSuma = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Podaj ilość gramów tłuszczu w "
                                           + "produkcie: ");
        
        gramyTluszcz = Double.parseDouble(input);
        
        kalorieTluszcz = 9 * gramyTluszcz;
        
        procentKalorieTluszcz = (kalorieTluszcz / kalorieSuma) * 100;
        
        String output = String.format("Kalorie pochodzące z tłuszczu stanowią "
                                      + "%.1f %% kalorii w produkcie.", procentKalorieTluszcz);
        
        if (kalorieTluszcz < 30 && kalorieTluszcz <= kalorieSuma)
        {
            JOptionPane.showMessageDialog(null, output + " Produkt jest niskotłuszczowy.");  
        }
        else if (kalorieTluszcz >= 30 && kalorieTluszcz <= kalorieSuma)
        {
            JOptionPane.showMessageDialog(null, output);    
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Dane wejściowe są nieprawidłowe.");  
        }
    }  
}
