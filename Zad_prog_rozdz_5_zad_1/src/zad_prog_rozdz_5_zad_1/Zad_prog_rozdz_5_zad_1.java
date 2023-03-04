package zad_prog_rozdz_5_zad_1;

import javax.swing.JOptionPane;

/**
 * Metoda showChar
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String city;
        int number;
        
        city = JOptionPane.showInputDialog("Wprowadź nazwę miasta: ");

        number = Integer.parseInt(JOptionPane.showInputDialog("Wprowadź pozycję znaku w podanej nazwie miasta: "));
  
        showChar(city, number);
    }
    public static void showChar (String city, int number) {
        
        JOptionPane.showMessageDialog(null, number + " pozycja znaku w podanej nazwie miasta " + city + " to: " + city.charAt(number));
    }
}
