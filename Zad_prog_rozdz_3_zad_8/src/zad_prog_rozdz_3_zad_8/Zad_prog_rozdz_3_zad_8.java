
package zad_prog_rozdz_3_zad_8;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_8 
{
    public static void main(String[] args) 
    {
        String input;
        int liczba;
        double cena = 99.0;
        double rabat;
        double kwota;
        
        input = JOptionPane.showInputDialog("Podaj liczbę zakupionych pakietów: ");
        
        liczba = Integer.parseInt(input);
        
        if (liczba >= 10 && liczba <= 19)
        {
            rabat = (double) (100 - 20)/100;
            kwota = (double) (liczba * cena * rabat);
            String output1 = String.format("Liczba zakupionych pakietów wynosi "
                                          + "%d sztuk.\nPrzyznano rabat na "
                                          + "poziomie 20%%.\nCałkowita kwota do "
                                          + "zapłaty wynosi %.2f pln.", liczba, kwota);
            JOptionPane.showMessageDialog(null, output1);  
        }
        else if (liczba >= 20 && liczba <= 49)
        {
            rabat = (double) (100 - 30)/100;
            kwota = (double) (liczba * cena * rabat);
            String output2 = String.format("Liczba zakupionych pakietów wynosi "
                                          + "%d sztuk.\nPrzyznano rabat na "
                                          + "poziomie 30%%.\nCałkowita kwota do "
                                          + "zapłaty wynosi %.2f pln.", liczba, kwota);
            JOptionPane.showMessageDialog(null, output2);  
        }
        else if (liczba >= 50 && liczba <= 99)
        {
            rabat = (double) (100 - 40)/100;
            kwota = (double) (liczba * cena * rabat);
            String output3 = String.format("Liczba zakupionych pakietów wynosi "
                                          + "%d sztuk.\nPrzyznano rabat na "
                                          + "poziomie 40%%.\nCałkowita kwota do "
                                          + "zapłaty wynosi %.2f pln.", liczba, kwota);
            JOptionPane.showMessageDialog(null, output3);  
        }
        else if (liczba >= 100)
        {
            rabat = (double) (100 - 50)/100;
            kwota = (double) (liczba * cena * rabat);
            String output4 = String.format("Liczba zakupionych pakietów wynosi "
                                          + "%d sztuk.\nPrzyznano rabat na "
                                          + "poziomie 50%%.\nCałkowita kwota do "
                                          + "zapłaty wynosi %.2f pln.", liczba, kwota);
            JOptionPane.showMessageDialog(null, output4);  
        }
        else
        {
            kwota = (double) (liczba * cena);
            String output5 = String.format("Liczba zakupionych pakietów wynosi "
                                          + "%d sztuk.\nRabat nie został "
                                          + "przyznany.\nCałkowita kwota do "
                                          + "zapłaty wynosi %.2f pln.", liczba, kwota);
            JOptionPane.showMessageDialog(null, output5);  
        }
    }
}
