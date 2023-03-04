
package zad_prog_rozdz_5_zad_3;

import javax.swing.JOptionPane;

/**
 * Powierzchnia prostokąta
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_3 {

    public static void main(String[] args) {
        
        double length;
        double width;
        double area;
        
        length = getLength();
        
        width = getWidth();
        
        area = getArea(length, width);
        
        displayData(length, width, area);
    }
    public static double getLength() {
    
        return Double.parseDouble(JOptionPane.showInputDialog("Wprowadź długość prostokąta: "));
    }   
    public static double getWidth() {
    
        return Double.parseDouble(JOptionPane.showInputDialog("Wprowadź szerokość prostokąta: "));
    }   
    public static double getArea(double length2, double width2) {

        return length2 * width2;
    }   
    public static void displayData (double length3, double width3, double area3) {
            
            JOptionPane.showMessageDialog(null, String.format("Długość prostokąta wynosi: %.2f\n" 
                                                            + "Szerokość prostokąta wynosi: %.2f\n"
                                                            + "Powierzchnia prostokąta wynosi: %.2f", length3, width3, area3));
    }
}
