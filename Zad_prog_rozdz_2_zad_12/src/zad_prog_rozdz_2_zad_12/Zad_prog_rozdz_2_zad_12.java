
package zad_prog_rozdz_2_zad_12;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_12 
{
    public static void main(String[] args) 
    {
        String nazwaUlubionegoMiasta;
        
        nazwaUlubionegoMiasta = JOptionPane.showInputDialog("Podaj nazwę swojego"
                                                           + " ulubionego miasta: ");
        
        int stringSize = nazwaUlubionegoMiasta.length();
        String upper = nazwaUlubionegoMiasta.toUpperCase();
        String lower = nazwaUlubionegoMiasta.toLowerCase();
        char letter = nazwaUlubionegoMiasta.charAt(0);
        
        JOptionPane.showMessageDialog(null, stringSize + "\n" + upper + "\n" 
                                     + lower + "\n" + letter);
    } 
}
