
package zad_prog_rozdz_6_zad_7;

import javax.swing.JOptionPane;

/**
 * Circle
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_7 {

    public static void main(String[] args) {
        
        Circle c = new Circle(Double.parseDouble(JOptionPane.showInputDialog(null, "Wprowadź promień koła: ")));
        
        //c.setRadius(Double.parseDouble(JOptionPane.showInputDialog(null, "Wprowadź promień koła: ")));
        
        JOptionPane.showMessageDialog(null, String.format("Powierzchnia koła wynosi: %.2f\n"
                                                        + "Średnica koła wynosi: %.2f\n"
                                                        + "Obwód koła wynosi: %.2f\n", c.area(), c.diameter(), c.circumference()));
    } 
}
