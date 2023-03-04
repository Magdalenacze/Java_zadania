
package zad_prog_rozdz_3_zad_7;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_7 
{
    public static void main(String[] args) 
    {
        String name1;
        String name2;
        String name3;
        
        name1 = JOptionPane.showInputDialog("Podaj pierwsze imię: ");
        
        name2 = JOptionPane.showInputDialog("Podaj drugie imię: ");
        
        name3 = JOptionPane.showInputDialog("Podaj trzecie imię: ");
        
        String output1 = String.format("Posortowane rosnąco podane imiona: "
                                      + "\n%s\n%s\n%s\n", name1, name2, name3);
        String output2 = String.format("Posortowane rosnąco podane imiona: "
                                      + "\n%s\n%s\n%s\n", name1, name3, name2);
        String output3 = String.format("Posortowane rosnąco podane imiona: "
                                      + "\n%s\n%s\n%s\n", name3, name1, name2);
        String output4 = String.format("Posortowane rosnąco podane imiona: "
                                      + "\n%s\n%s\n%s\n", name2, name1, name3);
        String output5 = String.format("Posortowane rosnąco podane imiona: "
                                      + "\n%s\n%s\n%s\n", name2, name3, name1);
        String output6 = String.format("Posortowane rosnąco podane imiona: "
                                      + "\n%s\n%s\n%s\n", name3, name2, name1);
        
        if (name1.compareTo(name2) < 0 || name1.compareTo(name2) == 0)
        {
            if (name2.compareTo(name3) < 0 || name2.compareTo(name3) == 0)
            {
                JOptionPane.showMessageDialog(null, output1);
            }
            else if (name1.compareTo(name3) < 0 || name1.compareTo(name3) == 0)
            {
                JOptionPane.showMessageDialog(null, output2);
            }
            else
            {
                JOptionPane.showMessageDialog(null, output3);
            }
        }
        else if (name2.compareTo(name3) < 0 || name2.compareTo(name3) == 0)
        {
            if (name1.compareTo(name3) < 0 || name1.compareTo(name3) == 0)
            {
                JOptionPane.showMessageDialog(null, output4);
            }
            else
            {
                JOptionPane.showMessageDialog(null, output5);
            }
        }
        else
                JOptionPane.showMessageDialog(null, output6);  
    }
}
