
package zad_prog_rozdz_4_zad_17;

import java.util.Random;
import javax.swing.JOptionPane;

public class Zad_prog_rozdz_4_zad_17 
{
    public static void main(String[] args) 
    {
        String input;
        int number;
        int userAnswer;
        int total = 1;
        
        Random randomNumbers = new Random();
        number = randomNumbers.nextInt(10);
            
        input = JOptionPane.showInputDialog("Spróbuj odgadnąć wartość wygenerowanej "
                                          + "przez program liczby losowej (liczba "
                                          + "całkowita z przedziału od 0 do 9): ");
        userAnswer = Integer.parseInt(input);
        
        while (userAnswer < 0 || userAnswer > 9)
        {
            JOptionPane.showMessageDialog(null, "Błędna liczba, poza podanym zakresem.");
            input = JOptionPane.showInputDialog("Spróbuj odgadnąć wartość wygenerowanej "
                                          + "przez program liczby losowej (liczba "
                                          + "całkowita z przedziału od 0 do 9): ");
            userAnswer = Integer.parseInt(input);    
        }
        while (userAnswer != number)
        { 
            if (userAnswer > number)
            {
                JOptionPane.showMessageDialog(null, "Za duża liczba, spróbuj ponownie.");
                input = JOptionPane.showInputDialog("Spróbuj odgadnąć wartość "
                                                  + "wygenerowanej przez program "
                                                  + "liczby losowej (liczba całkowita "
                                                  + "z przedziału od 0 do 9): ");
                userAnswer = Integer.parseInt(input);
            }
            else if (userAnswer < number)
            {
                JOptionPane.showMessageDialog(null, "Za mała liczba, spróbuj ponownie.");
                input = JOptionPane.showInputDialog("Spróbuj odgadnąć wartość "
                                                  + "wygenerowanej przez program "
                                                  + "liczby losowej (liczba całkowita "
                                                  + "z przedziału od 0 do 9): ");
                userAnswer = Integer.parseInt(input);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Błąd. Nieprawidłowe dane wejściowe.");
            }
            total += 1;
        }
        JOptionPane.showMessageDialog(null, "Gratulacje! Prawidłowa odpowiedź.\n "
                                        + "Wygenerowana losowo liczba to: " + number + "\n"
                                        + "Liczba podjętych prób wynosi: " + total);
    }
}
