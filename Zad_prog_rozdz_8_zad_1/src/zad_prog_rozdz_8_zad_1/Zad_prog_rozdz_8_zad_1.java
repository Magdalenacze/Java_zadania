
package zad_prog_rozdz_8_zad_1;

import javax.swing.JOptionPane;

/**
 * Area
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_1 {

    public static void main(String[] args) {
        
        double circle;
        double rectangle;
        double roller;
        double radius;
        double width;
        double length;
        double height;
        
        radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj promień koła: "));
        
        circle = Area.area(radius);
        
        width = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj szerokość prostokąta: "));

        length = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj długość prostokąta: "));
        
        rectangle = Area.area(width, length);
        
        radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj promień walca: "));
        
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj wysokość walca: "));
        
        roller = Area.area(radius, height);
        
        JOptionPane.showMessageDialog(null, String.format("Powierzchnia koła wynosi: %.2f \n\n" +
                                                          "Powierzchnia prostokąta wynosi: %.2f \n\n" +
                                                          "Powierzchnia walca wynosi: %.2f", circle, rectangle, roller));
    }
}
