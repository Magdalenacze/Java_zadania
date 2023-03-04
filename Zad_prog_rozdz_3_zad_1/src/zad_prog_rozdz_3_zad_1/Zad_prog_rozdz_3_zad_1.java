
package zad_prog_rozdz_3_zad_1;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_3_zad_1 
{
    public static void main(String[] args) 
    {
        String str;
        int cyfraArabska;
        
        str = JOptionPane.showInputDialog("Podaj wartość z przedziału od 1 do 10.");
        
        cyfraArabska = Integer.parseInt(str);
        
        switch (cyfraArabska)
        {    
            case 1:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: I ");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: II ");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: III ");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: IV ");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: V ");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: VI ");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: VII ");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: VIII ");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: IX ");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Podana cyfra arabska odpowiada "
                                             + "liczbie rzymskiej: X ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Błąd: Podana cyfra arabska "
                                             + "nie należy do przedziału od 1 "
                                             + "do 10.");
        }         
    }
}
