
package zad_prog_rozdz_2_zad_10;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_10 
{
    public static void main(String[] args) 
    {
        String str;
        double wynikTestu1;
        double wynikTestu2;
        double wynikTestu3;
        double sredniaTestow;
        
        str = JOptionPane.showInputDialog("Wprowadź wynik testu nr 1: ");
        wynikTestu1 = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Wprowadź wynik testu nr 2: ");
        wynikTestu2 = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Wprowadź wynik testu nr 3: ");
        wynikTestu3 = Double.parseDouble(str);
        
        sredniaTestow = (wynikTestu1 + wynikTestu2 + wynikTestu3) / 3.0;
        
        JOptionPane.showMessageDialog(null, "Wynik testu nr 1 wynosi: " 
                                     + wynikTestu1 + "\nWynik testu nr 2 "
                                     + "wynosi: " + wynikTestu2 + "\nWynik "
                                     + "testu nr 3 wynosi: " + wynikTestu3 
                                     + "\nŚrednia ze wszystkich trzech testów "
                                     + "wynosi: " + sredniaTestow);
    }  
}
