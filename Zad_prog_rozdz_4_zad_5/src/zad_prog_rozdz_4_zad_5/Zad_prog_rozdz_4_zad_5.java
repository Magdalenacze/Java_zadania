
package zad_prog_rozdz_4_zad_5;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_5 
{
    public static void main(String[] args) 
    {
        String input1;
        String input2;
        int total = 0;
        
        input1 = JOptionPane.showInputDialog("Podaj dowolny łańcuch znaków: ");
        
        while (input1.equals(""))
        {
            input1 = JOptionPane.showInputDialog("Błędne dane wejściowe. Nie podano "
                                               + "jakiegokolwiek łańcucha znaków.");
        }
        
        input2 = JOptionPane.showInputDialog("Podaj dowolny znak, występujący lub "
                                           + "nie występujący w podanym łańcuchu "
                                           + "znaków: ");
        while (input2.equals("") || input2.length() != 1)
        {
            input2 = JOptionPane.showInputDialog("Błędne dane wejściowe. Nie podano "
                                               + "jakiegokolwiek znaku lub podano "
                                               + "więcej niż 1 znak.");
        }
        for (int count = 0; count < input1.length(); count++)
        {
            if (input1.charAt(count) == input2.charAt(0))
            {
                total += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Sumaryczna liczba wystąpień określonego "
                                    + "znaku w podanym łańcuchu znaków wynosi: " + total);
    }
}
