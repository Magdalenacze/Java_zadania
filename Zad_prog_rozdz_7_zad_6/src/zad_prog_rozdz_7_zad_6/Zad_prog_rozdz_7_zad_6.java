
package zad_prog_rozdz_7_zad_6;

import javax.swing.JOptionPane;

/**
 * Egzamin na prawo jazdy
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_6 {

    public static void main(String[] args) {
        
        DriverExam de = new DriverExam();
        
        char[] students = new char[20];
        
        getValues(students);
        
        de.setStudent(students);
        
        JOptionPane.showMessageDialog(null, "Wynik egzaminu: " + de.result() + "\n" +
                                            "Liczba poprawnych odpowiedzi: " + de.totalCorrect() + "\n" +
                                            "Liczba błędnych odpowiedzi: " + de.totalIncorrect() + "\n" +
                                            "Pytania, na które nie udzielono żadnej odpowiedzi: " + de.questionsMissed());
    }

    private static void getValues(char[] array) {
        
        for (int i = 0; i < array.length; i++) {
            
            array[i] = JOptionPane.showInputDialog("Pytanie nr " + (i + 1) + ":").charAt(0);
            
            while(array[i] != 'A' && array[i] != 'B' && array[i] != 'C' && array[i] != 'D' && array[i] != ' ') {
                
                array[i] = JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj duże litery: A, B, C lub D. Jeżeli chcesz pominąć pytanie naciśnij spację. Pytanie nr " + (i + 1) + ":").charAt(0);
            }
        }
    }
}
