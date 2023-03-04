
package zad_prog_rozdz_8_zad_9;

import javax.swing.JOptionPane;

/**
 * Kalkulator geometryczny
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_9 {

    public static void main(String[] args) {
        
        int menu = 0;
        double input1;
        double input2;
        double area;
        
        while (menu != 4) {
            
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Kalkulator geometryczny\n\n"
                                            + "1. Obliczanie powierzchni koła\n"
                                            + "2. Obliczanie powierzchni prostokąta\n"
                                            + "3. Obliczanie powierzchni trójkąta\n"
                                            + "4. Zakończ\n\n"
                                            + "Wprowadź wybraną opcję (1-4): "));
            switch (menu) {

                case 1:

                    input1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj promień koła: "));

                    area = Geometry.circle(input1);

                        if (area > 0)

                            JOptionPane.showMessageDialog(null, String.format("Powierzchnia koła wynosi: %.2f", area));    
                break;
                case 2:

                    input1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj szerokość prostokąta: "));

                    input2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj długość prostokąta: "));

                    area = Geometry.rectangle(input1, input2);

                        if (area > 0)

                            JOptionPane.showMessageDialog(null, String.format("Powierzchnia prostokąta wynosi: %.2f", area));    
                break;
                case 3:

                    input1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj wymiar podstawy trójkąta: "));

                    input2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj wysokość trójkąta: "));

                    area = Geometry.triangle(input1, input2);

                        if (area > 0)

                            JOptionPane.showMessageDialog(null, String.format("Powierzchnia trójkąta wynosi: %.2f", area));    
                break;
                case 4:

                    JOptionPane.showMessageDialog(null, "Dziękuję!");
                break;
                default:

                    JOptionPane.showMessageDialog(null, "Błędny wybór!");
            }
        }
    }
}
