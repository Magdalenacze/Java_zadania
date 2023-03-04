
package zad_prog_rozdz_3_zad_6;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_6 
{
    public static void main(String[] args) 
    {
        String input;
        int sekunda;
        int minuta;
        int godzina;
        int dzien;
        int minutaSec;
        int godzinaSec;
        int dzienSec;
        
        input = JOptionPane.showInputDialog("Podaj liczbę sekund: ");
        
        sekunda = Integer.parseInt(input);
        
        minuta = sekunda / 60;
        minutaSec = sekunda % 60;
        
        godzina = sekunda / 3600;
        godzinaSec = sekunda % 3600;
        
        dzien = sekunda / 86400;
        dzienSec = sekunda % 86400;
        
        String output1 = String.format("Podana liczba %d sekund to %d minut i "
                                      + "%d sekund", sekunda, minuta, minutaSec);
        
        String output2 = String.format("Podana liczba %d sekund to %d godzin i "
                                      + "%d sekund", sekunda, godzina, godzinaSec);
        
        String output3 = String.format("Podana liczba %d sekund to %d dni i %d "
                                      + "sekund", sekunda, dzien, dzienSec);
        
        String output4 = String.format("Podana liczba to %d sekund", sekunda);
        
        if (sekunda >= 60 && sekunda < 3600)
            JOptionPane.showMessageDialog(null, output1);
        else if (sekunda >= 3600 && sekunda < 86400)
            JOptionPane.showMessageDialog(null, output2);
        else if (sekunda >= 86400)
            JOptionPane.showMessageDialog(null, output3);
        else
            JOptionPane.showMessageDialog(null, output4);
    }
}
