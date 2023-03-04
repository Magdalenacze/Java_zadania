
package zad_prog_rozdz_2_zad_19;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_19 
{
    public static void main(String[] args) 
    {
        int zakupAkcjiLiczba = 1000;
        double zakupAkcjiCena = 32.87;
        double zakupAkcjiProwizja = 2.0;
        int sprzedazAkcjiLiczba = 1000;
        double sprzedazAkcjiCena = 33.92;
        double sprzedazAkcjiProwizja = 2.0;
        double zakupKwota;
        double zakupProwizja;
        double zakupKwotaCalkowita;
        double sprzedazKwota;
        double sprzedazProwizja;
        double sprzedazKwotaCalkowita;
        double sprzedazZysk;
        
        zakupKwota = zakupAkcjiLiczba * zakupAkcjiCena;
        
        zakupProwizja = (zakupKwota * zakupAkcjiProwizja) / 100;
        
        zakupKwotaCalkowita = zakupKwota + zakupProwizja;
        
        sprzedazKwota = sprzedazAkcjiLiczba * sprzedazAkcjiCena;
        
        sprzedazProwizja = (sprzedazKwota * sprzedazAkcjiProwizja) / 100;
        
        sprzedazKwotaCalkowita = sprzedazKwota - sprzedazProwizja;
        
        sprzedazZysk = sprzedazKwotaCalkowita - zakupKwotaCalkowita;
        
        JOptionPane.showMessageDialog(null, "Kwota zapłacona za akcje wynosi: " 
                                     + zakupKwotaCalkowita + " złotych." 
                                     + "\nWartość prowizji przy zakupie akcji "
                                     + "wynosi: " + zakupProwizja + " złotych." 
                                     + "\nKwota otrzymana ze sprzedaży akcji "
                                     + "wynosi: " + sprzedazKwotaCalkowita 
                                     + " złotych." + "\nWartość prowizji przy "
                                     + "sprzedaży akcji wynosi: " 
                                     + sprzedazProwizja + " złotych." + "\nZysk "
                                     + "ze sprzedaży akcji wynosi: " 
                                     + sprzedazZysk + " złotych.");
    }
}
