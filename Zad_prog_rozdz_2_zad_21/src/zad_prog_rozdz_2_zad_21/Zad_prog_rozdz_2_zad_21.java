
package zad_prog_rozdz_2_zad_21;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_21 
{
    public static void main(String[] args) 
    {
        String str;
        double kwotaPoLatach;
        double kwotaPierwotna;
        double rocznaStopa;
        int kapitalizacjaOdsetek;
        int liczbaLat;
        
        str = JOptionPane.showInputDialog("Wprowadź kwotę pierwotnie zdeponowaną "
                                         + "na koncie: ");
        
        kwotaPierwotna = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Wprowadź roczną stopę oprocentowania: ");
        
        rocznaStopa = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Podaj, ile razy w roku odsetki są "
                                         + "kapitalizowane: ");
        
        kapitalizacjaOdsetek = Integer.parseInt(str);
        
        str = JOptionPane.showInputDialog("Podaj, przez ile lat środki będą "
                                         + "znajdować się na koncie: ");
        
        liczbaLat = Integer.parseInt(str);
        
        kwotaPoLatach = (double)(kwotaPierwotna * Math.pow
        ((1 + (rocznaStopa / kapitalizacjaOdsetek) / 100), (kapitalizacjaOdsetek * liczbaLat)));
        
        JOptionPane.showMessageDialog(null, "Stan konta po podanej liczbie lat "
                                     + "wynosi: " + kwotaPoLatach + " złotych.");
    }
}
