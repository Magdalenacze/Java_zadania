
package zad_prog_rozdz_8_zad_8;

import javax.swing.JOptionPane;

/**
 * Symulator mandatów
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_8 {

    public static void main(String[] args) {
        
        ParkedCar pc = new ParkedCar("Ford", "Focus", "Navy", "SK126CP", 160);
        ParkingMeter pm = new ParkingMeter(90);
        PoliceOfficer po = new PoliceOfficer("Kowalski Jan", 12345);
        
        String output = "";
        
        if (po.getValues(pc, pm)) {
            
            ParkingTicket pt = po.generateTicket(pc, pm);
            
            output = pt.getMandate();
            
        } else {
            
            output = "Brak mandatu. Nie została przekroczona wykupiona liczba minut parkowania.";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }
}
