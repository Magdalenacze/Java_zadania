
package zad_prog_rozdz_7_zad_19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Gra z pytaniami z wiedzy ogólnej
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_19 {

    public static void main(String[] args) {

        int totalPoints1 = 0;
        int totalPoints2 = 0;
        
        ArrayList<Question> list = new ArrayList<>();

        list.add(new Question("Na jakim kontynencie leżą Stany Zjednoczone?", "Afryka", "Ameryka Północna", "Azja", "Europa", 2));
        list.add(new Question("Jaki jest wynik działania: 2 + 2 = ?", "4", "6", "8", "10", 1));
        list.add(new Question("Kto obecnie jest Prezydentem RP?", "M. Morawiecki", "J. Kaczyński", "A. Duda", "D. Tusk", 3));
        list.add(new Question("Jaki jest najwyższy szczyt górski w Polsce?", "Kasprowy Wierch", "Babia Góra", "Rysy", "Giewont", 3));
        list.add(new Question("W jakim województwie leżą Suwałki?", "Woj. Śląskie", "Woj. Mazowieckie", "Woj. Lubuskie", "Woj. Podlaskie", 4));
        list.add(new Question("Na jakim kontynencie leży Urugwaj?", "Afryka", "Ameryka Południowa", "Azja", "Europa", 2));
        list.add(new Question("Jaki jest wynik działania: 10 / 5 = ?", "1", "2", "3", "4", 2));
        list.add(new Question("Kto obecnie jest Premierem RP?", "M. Morawiecki", "J. Kaczyński", "A. Duda", "D. Tusk", 1));
        list.add(new Question("Jaki jest najwyższy szczyt górski na świecie?", "Góra Kościuszki", "Elbrus", "Mount Blanc", "Mount Everest", 4));
        list.add(new Question("W jakim województwie leży Kołobrzeg?", "Woj. Kujawsko-pomorskie", "Woj. Pomorskie", "Woj. Zachodniopomorskie", "Woj. Warmińsko-mazurskie", 3));
        
        for (int index = 0; index < list.size(); index++) {
            
            if (index % 2 == 0) {
            
                if (list.get(index).CorrectIncorrect(Integer.parseInt(JOptionPane.showInputDialog(null, "Graczu nr 1, podaj nr poprawnej odpowiedzi (1, 2, 3 lub 4) na poniższe pytanie.\n\nPytanie nr " + (((index + 1)/2) + 1) + ":\n" + list.get(index).getQuestions() + "\n\n" + list.get(index).getAnswers()))))
                
                    totalPoints1 += 1;
            }
            else {
                
                if (list.get(index).CorrectIncorrect(Integer.parseInt(JOptionPane.showInputDialog(null, "Graczu nr 2, podaj nr poprawnej odpowiedzi (1, 2, 3 lub 4) na poniższe pytanie.\n\nPytanie nr " + ((index + 1)/2) + ":\n" + list.get(index).getQuestions() + "\n\n" + list.get(index).getAnswers()))))
                
                    totalPoints2 += 1;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Gracz nr 1 zdobył punktów: " + totalPoints1 + "/5\n\nGracz nr 2 zdobył punktów: " + totalPoints2 + "/5");
    }
}

