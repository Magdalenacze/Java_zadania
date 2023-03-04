
package zad_prog_rozdz_6_zad_11;

import javax.swing.JOptionPane;

/**
 * Temperatura zamarzania i wrzenia
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_11 {

    public static void main(String[] args) {
        
        FreezingBoilingTemperature fbt = new FreezingBoilingTemperature();
        
        fbt.setTemperature(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj temperaturę: ")));
        
        String output = "Podana temperatura to: " + fbt.getTemperature() + " , w której\n"
                      + "wrą następujące substancje:\n";
        
        if (fbt.isEthylBoiling()) {
            
            output = output + "* alkohol etylowy\n";
        }
        
        if (fbt.isOxygenBoiling()) {
            
            output = output + "* tlen\n";
        }
        
        if (fbt.isWaterBoiling()) {
            
            output = output + "* woda\n";
        }
       
        output = output + "a zamarzają:\n";
                
        if (fbt.isEthylFreezing()) {
            
            output = output + "* alkohol etylowy\n";
        }
        
        if (fbt.isOxygenFreezing()) {
            
            output = output + "* tlen\n";
        }
        
        if (fbt.isWaterFreezing()) {
            
            output = output + "* woda";
        }
                
        JOptionPane.showMessageDialog(null, output);
    }
}
