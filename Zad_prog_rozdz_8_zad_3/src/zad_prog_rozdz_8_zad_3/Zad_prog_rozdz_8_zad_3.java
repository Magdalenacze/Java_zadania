
package zad_prog_rozdz_8_zad_3;

import javax.swing.JOptionPane;

/**
 * Kalkulator ceny wykładziny
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_3 {

    public static void main(String[] args) {
        
        RoomDimension rd = new RoomDimension();
        
        rd.setLength(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj długość pomieszczenia (w metrach): ")));
        
        rd.setWidth(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj szerokość pomieszczenia (w metrach): ")));
        
        RoomCarpet rc = new RoomCarpet(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj cenę wykładziny za m2 (w pln): ")), rd);
        
        JOptionPane.showMessageDialog(null, rc.getRoomDimension().toString() + "\n\n" + rc.toString());
    }
}
