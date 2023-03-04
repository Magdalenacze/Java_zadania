
package zad_prog_rozdz_6_zad_9;

import javax.swing.JOptionPane;

/**
 * MonthDays
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_9 {

    public static void main(String[] args) {
        
        MonthDays md = new MonthDays();
            
        md.setMonth(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj miesiąc (od 1 do 12): ")));
        
        md.setYear(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj rok: ")));
        
        JOptionPane.showMessageDialog(null, "Liczba dni w miesiącu nr " + md.getMonth() + " w roku " + md.getYear()
                                          + " to " + md.numberOfDays());
    }
}
