
package zad_prog_rozdz_2_zad_15;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_15 
{
    public static void main(String[] args) 
    {
        String str;
        double cenaZaAkcje;
        double liczbaAkcji;
        double prowizja;
        double kwotaZaAkcje;
        double wysokoscProwizji;
        double kwotaCalkowita;
        
        str = JOptionPane.showInputDialog("Wprowadź cenę za akcję: ");
        
        cenaZaAkcje = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Wprowadź liczbę zakupionych akcji: ");
        
        liczbaAkcji = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("Wprowadź, ile procent prowizji "
                                         + "zostanie pobrane za transakcję: ");
        
        prowizja = Double.parseDouble(str);
        
        kwotaZaAkcje = cenaZaAkcje * liczbaAkcji;
        
        wysokoscProwizji = (kwotaZaAkcje * prowizja) / 100;
        
        kwotaCalkowita = kwotaZaAkcje + wysokoscProwizji;
        
        JOptionPane.showMessageDialog(null, "Kwota zapłacona za same akcje "
                                     + "wynosi: " + kwotaZaAkcje + " złotych."
                                     + "\nWysokość prowizji wynosi: " 
                                     + wysokoscProwizji + " złotych." 
                                     + "\nŁączna kwota zapłacona za akcje "
                                     + "wynosi: " + kwotaCalkowita + " złotych.");          
        }
    }
