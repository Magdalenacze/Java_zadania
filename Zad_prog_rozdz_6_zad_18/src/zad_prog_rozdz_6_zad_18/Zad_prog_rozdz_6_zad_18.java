
package zad_prog_rozdz_6_zad_18;

import javax.swing.JOptionPane;

/**
 * Rzucanie onetami o złotówkę
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_18 {

    public static void main(String[] args) {
        
        Coin c1 = new Coin(0.05);
        Coin c2 = new Coin(0.10);
        Coin c3 = new Coin(0.20);
        
        double totalValue = 0.00;
        
        while(totalValue < 1.00) {
            
            c1.toss();
            c2.toss();
            c3.toss();
            
            if(c1.getSideUp().equals("orzeł")) {
 
                totalValue += c1.getValue();
            }
            
            if(c2.getSideUp().equals("orzeł")) {
                
                totalValue += c2.getValue();
            }
            
            if(c3.getSideUp().equals("orzeł")) {
                
                totalValue += c3.getValue();
            }
        }
        
        if(totalValue == 1.00) {
            
            JOptionPane.showMessageDialog(null, String.format("Wygrywasz! Twoja suma wynosi: %.2f pln", totalValue));
        }
        else if (totalValue > 1.00) {
            
            JOptionPane.showMessageDialog(null, String.format("Niestety przegrałeś! Twoja suma wynosi: %.2f pln", totalValue));
        }
        else {
            
            JOptionPane.showMessageDialog(null, String.format("Spróbuj ponownie!"));
        }
    }
}
