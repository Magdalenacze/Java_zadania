
package zad_prog_rozdz_3_zad_14;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_14 
{
    public static void main(String[] args) 
    {
        String input1;
        String input2;
        String output1 = "";
        String output2 = "";
        int liczbaMinut;
        int darmoweMinuty;
        int roznicaMinut;
        double abonament;
        double kosztMinuta;
        double kosztDoplaty;
        double rachunekA = 0;
        double rachunekB = 0;
        double rachunekC = 0;
        double rachunekAB;
        double rachunekAC;
        double rachunekBC;
        
        input1 = JOptionPane.showInputDialog("Podaj, który pakiet wybrałeś u "
                                            + "swojego operatora telefonii "
                                            + "komórkowej:\n"
                                            + "A, B czy C.");
        
        input2 = JOptionPane.showInputDialog("Podaj liczbę minut rozmów, jaką "
                                           + "wykorzystałeś w ciągu miesiąca: ");
        
        liczbaMinut = Integer.parseInt(input2);
    
        if (input1.equals("A") || input1.equals("B") || input1.equals("C"))
        {
            abonament = 69.99;
            darmoweMinuty = liczbaMinut;
            kosztMinuta = 0;
                
            roznicaMinut = liczbaMinut - darmoweMinuty;

                if (roznicaMinut <= 0)
                {
                    kosztDoplaty = 0;
                }
                else
                {
                    kosztDoplaty = roznicaMinut * kosztMinuta;
                }
            
            rachunekC = abonament + kosztDoplaty;
            
            output1 = String.format("Wybrany pakiet: %s\n"
                                   + "Kwota abonamentu: %.2f pln\n"
                                   + "Brak limitu darmowych minut\n"
                                   + "Łączne opłaty za dany miesiąc wynoszą: "
                                   + "%.2f pln", input1, abonament, rachunekC);
        }
        if (input1.equals("A") || input1.equals("B"))
        {
            abonament = 59.99;
            darmoweMinuty = 900;
            kosztMinuta = 0.40;
                
            roznicaMinut = liczbaMinut - darmoweMinuty;

                if (roznicaMinut <= 0)
                {
                    kosztDoplaty = 0;
                }
                else
                {
                    kosztDoplaty = roznicaMinut * kosztMinuta;
                }
            
            rachunekB = abonament + kosztDoplaty;
            
            output1 = String.format("Wybrany pakiet: %s\n"
                                   + "Kwota abonamentu: %.2f pln\n"
                                   + "Liczba darmowych minut: %s\n"
                                   + "Koszt każdej następnej minuty: %.2f pln\n"
                                   + "Łączne opłaty za dany miesiąc wynoszą: "
                                   + "%.2f pln", input1, abonament, darmoweMinuty, kosztMinuta, rachunekB);
        }
        if (input1.equals("A"))
        {
            abonament = 39.99;
            darmoweMinuty = 450;
            kosztMinuta = 0.45;
                
            roznicaMinut = liczbaMinut - darmoweMinuty;

                if (roznicaMinut <= 0)
                {
                    kosztDoplaty = 0;
                }
                else
                {
                    kosztDoplaty = roznicaMinut * kosztMinuta;
                }
            
            rachunekA = abonament + kosztDoplaty;
            
            output1 = String.format("Wybrany pakiet: %s\n"
                                   + "Kwota abonamentu: %.2f pln\n"
                                   + "Liczba darmowych minut: %s\n"
                                   + "Koszt każdej następnej minuty: %.2f pln\n"
                                   + "Łączne opłaty za dany miesiąc wynoszą: "
                                   + "%.2f pln", input1, abonament, darmoweMinuty, kosztMinuta, rachunekA);
        }
        if (input1.equals("A"))
        {
            rachunekAB = rachunekA - rachunekB;
            
            rachunekAC = rachunekA - rachunekC;
            
                if (rachunekAB > 0 && rachunekAC > 0)
                {
                    output2 = String.format("Pakiet B generuje %.2f pln oszczędności, "
                                           + "natomiast pakiet C %.2f pln "
                                           + "w stosunku do pakietu A, z którego "
                                           + "aktualnie korzystasz.", rachunekAB, rachunekAC);
                }
                else if (rachunekAB > 0)
                {
                    output2 = String.format("Pakiet B generuje %.2f pln oszczędności "
                                          + "w stosunku do pakietu A, z którego "
                                          + "aktualnie korzystasz.", rachunekAB);
                }
        }
        if (input1.equals("B"))
        {
            rachunekBC = rachunekB - rachunekC;
            
                if (rachunekBC > 0)
                {
                    output2 = String.format("Pakiet C generuje %.2f pln oszczędności "
                                          + "w stosunku do pakietu B, z którego "
                                          + "aktualnie korzystasz.", rachunekBC);
                }
        }
        JOptionPane.showMessageDialog(null, output1 + "\n" + output2);
    } 
}
