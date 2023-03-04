
package zad_prog_rozdz_8_zad_4;

import javax.swing.JOptionPane;

/**
 * LandTract
 * @author Magdalena
 */
public class Zad_prog_rozdz_8_zad_4 {

    public static void main(String[] args) {
        
        LandTrack.counter = 0;
        
        LandTrack lt1 = new LandTrack();
        
        LandTrack.counter = LandTrack.counter + 1;

            lt1.setLength(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj długość działki nr 1 (w metrach): ")));
        
            lt1.setWidth(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj szerokość działki nr 1 (w metrach): ")));
            
        LandTrack lt2 = new LandTrack();

            lt2.setLength(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj długość działki nr 2 (w metrach): ")));
        
            lt2.setWidth(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj szerokość działki nr 2 (w metrach): ")));
            
            if (lt1.equals(lt2)) {
                
                JOptionPane.showMessageDialog(null, lt1.toString() + "\n\n" + lt2.toString() + "\n\n" + "Powierzchnie działek są takie same.");
                
            } else {
                
                JOptionPane.showMessageDialog(null, lt1.toString() + "\n\n" + lt2.toString() + "\n\n" + "Powierzchnie działek nie są takie same.");
            }
    }    
}
