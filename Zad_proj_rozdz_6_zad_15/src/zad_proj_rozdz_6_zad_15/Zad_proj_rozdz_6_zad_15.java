
package zad_proj_rozdz_6_zad_15;

import javax.swing.JOptionPane;

/**
 * Gra w kości
 * @author Magdalena
 */
public class Zad_proj_rozdz_6_zad_15 {

    public static void main(String[] args) {
        
        Die dc = new Die(6);
        Die du = new Die(6);
        
        int totalUser = 0; 
        int totalComputer = 0;

        for(int count = 0; count <= 10; count++) {

            dc.roll();
                
            du.roll();
 
            if(du.getValue() > dc.getValue()) {
 
                totalUser += 1;
            }
            else if(du.getValue() == dc.getValue()) {

            }
            else {
   
                totalComputer += 1;
            }    
        }
        
        if(totalUser > totalComputer) {
                
            JOptionPane.showMessageDialog(null, "Wygrana należy do Ciebie!");     
        }
        else if(totalUser == totalComputer) {
                
            JOptionPane.showMessageDialog(null, "Remis!");
        }
        else {
                
            JOptionPane.showMessageDialog(null, "Tym razem nie udało się. Spróbuj ponownie.");
        }     
    }
}

