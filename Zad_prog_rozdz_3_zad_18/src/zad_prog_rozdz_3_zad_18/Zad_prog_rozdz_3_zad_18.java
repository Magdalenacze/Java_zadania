
package zad_prog_rozdz_3_zad_18;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_18 
{
    public static void main(String[] args) 
    {
        String input1;
        String input2;
        String input3;
        
        input1 = JOptionPane.showInputDialog("Czy któraś z osób jest na diecie "
                                            + "wegetariańskiej? ");
        
        input2 = JOptionPane.showInputDialog("Czy któraś z osób jest na diecie "
                                            + "wegeńskiej? ");
        
        input3 = JOptionPane.showInputDialog("Czy któraś z osób jest na diecie "
                                            + "bezglutenowej? ");
        
        if (input1.equals("tak") && input2.equals("tak") && input3.equals("tak"))
            
            JOptionPane.showMessageDialog(null, "Możecie wybrać się do następujących "
                                         + "restauracji:\nKawiarania na Rogu\n"
                                         + "Kuchnia u Szefa");
        else if (input1.equals("tak") && input2.equals("nie") && input3.equals("tak"))
            
            JOptionPane.showMessageDialog(null, "Możecie wybrać się do następujących "
                                         + "restauracji:\nPizzeria przy Dworcowej\n"
                                         + "Kawiarania na Rogu\nKuchnia u Szefa");
        else if (input1.equals("tak") && input2.equals("tak") && input3.equals("nie"))
            
            JOptionPane.showMessageDialog(null, "Możecie wybrać się do następujących "
                                         + "restauracji:\nKawiarania na Rogu\n"
                                         + "Kuchnia u Szefa");
        else if (input1.equals("tak") && input2.equals("nie") && input3.equals("nie"))
            
            JOptionPane.showMessageDialog(null, "Możecie wybrać się do następujących "
                                         + "restauracji:\nPizzeria przy Dworcowej\n"
                                         + "Kawiarania na Rogu\nWłoskie Specjały\n"
                                         + "Kuchnia u Szefa");
        else if (input1.equals("nie") && input2.equals("nie") && input3.equals("nie"))
            
            JOptionPane.showMessageDialog(null, "Możecie wybrać się do następujących "
                                         + "restauracji:\nLuksusowe Burgery u Jarka\n"
                                         + "Pizzeria przy Dworcowej\nKawiarania na "
                                         + "Rogu\nWłoskie Specjały\nKuchnia u Szefa");
        
        else if (input1.equals("nie") && input2.equals("tak") && input3.equals("tak"))
            
            JOptionPane.showMessageDialog(null, "Możecie wybrać się do następujących "
                                         + "restauracji:\nKawiarania na Rogu\n"
                                         + "Kuchnia u Szefa");
        else if (input1.equals("nie") && input2.equals("nie") && input3.equals("tak"))
            
            JOptionPane.showMessageDialog(null, "Możecie wybrać się do następujących "
                                         + "restauracji:\nPizzeria przy Dworcowej\n"
                                         + "Kawiarania na Rogu\nKuchnia u Szefa");
        else if (input1.equals("nie") && input2.equals("tak") && input3.equals("nie"))
            
            JOptionPane.showMessageDialog(null, "Możecie wybrać się do następujących "
                                         + "restauracji:\nKawiarania na Rogu\n"
                                         + "Kuchnia u Szefa");
        else
            JOptionPane.showMessageDialog(null, "Błąd. Nieprawidłowe dane wejściowe.");
    } 
}
