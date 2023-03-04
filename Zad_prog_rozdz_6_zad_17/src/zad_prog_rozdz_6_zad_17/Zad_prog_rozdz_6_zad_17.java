
package zad_prog_rozdz_6_zad_17;

import javax.swing.JOptionPane;

/**
 * Symulator rzutów monetą
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_17 {

    public static void main(String[] args) {
        
        Coin c = new Coin();
        
        JOptionPane.showMessageDialog(null, "Początkowa strona monety to: " + c.getSideUp());
        
        int totalOrzel = 0; 
        int totalReszka = 0;
        
        for(int count = 1; count <= 20; count++) {
            
            c.toss();
            
            String sides = c.getSideUp();
            
            JOptionPane.showMessageDialog(null, "Wyrzucona strona monety to: " + sides);
            

            if(sides.equals("orzeł")) {
 
                totalOrzel += 1;
            }
            else {
   
                totalReszka += 1;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Orzeł został wyrzucony: " + totalOrzel + " razy.\n"
                                          + "Reszka została wyrzucona: " + totalReszka + " razy.");
    }
}
