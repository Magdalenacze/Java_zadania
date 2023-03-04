
package zad_prog_rozdz_3_zad_13;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_13 
{
    public static void main(String[] args) 
    {
        String input1;
        String input2;
        int liczbaMinut;
        int darmoweMinuty;
        int roznicaMinut;
        double abonament;
        double kosztMinuta;
        double kosztDoplaty;
        double rachunek;
        
        input1 = JOptionPane.showInputDialog("Podaj, który pakiet wybrałeś u "
                                            + "swojego operatora telefonii "
                                            + "komórkowej:\n"
                                            + "A, B czy C.");
        
        input2 = JOptionPane.showInputDialog("Podaj liczbę minut rozmów, jaką "
                                           + "wykorzystałeś w ciągu miesiąca: ");
        
        liczbaMinut = Integer.parseInt(input2);
        
        switch (input1)
        {
            case "A":
                abonament = 39.99;
                darmoweMinuty = 450;
                kosztMinuta = 0.45;
                break;
            case "B":
                abonament = 59.99;
                darmoweMinuty = 900;
                kosztMinuta = 0.40;
                break;
            case "C":
                abonament = 69.99;
                darmoweMinuty = liczbaMinut;
                kosztMinuta = 0;
                break;
            default:
                abonament = 0;
                darmoweMinuty = liczbaMinut = 0;
                kosztMinuta = 0;
                JOptionPane.showMessageDialog(null, "Podaj, który pakiet wybrałeś "
                                             + "u swojego operatora telefonii "
                                             + "komórkowej:\n A, B czy C.");
        }
        if (input1.equals("A") || input1.equals("B") || input1.equals("C"))
        {
            roznicaMinut = liczbaMinut - darmoweMinuty;

            if (roznicaMinut <= 0)
            {
                kosztDoplaty = 0;
            }
            else
            {
                kosztDoplaty = roznicaMinut * kosztMinuta;
            }
            
            rachunek = abonament + kosztDoplaty;

            String output = String.format("Wybrany pakiet: %s\n"
                                         + "Kwota abonamentu: %.2f pln\n"
                                         + "Liczba darmowych minut: %s\n"
                                         + "Koszt każdej następnej minuty: %.2f pln\n"
                                         + "Łączne opłaty za dany miesiąc wynoszą: "
                                         + "%.2f pln", input1, abonament, darmoweMinuty, kosztMinuta, rachunek);
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
