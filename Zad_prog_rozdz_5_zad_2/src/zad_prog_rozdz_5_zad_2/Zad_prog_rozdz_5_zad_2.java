package zad_prog_rozdz_5_zad_2;

import javax.swing.JOptionPane;

/**
 * Kalkulator ceny detalicznej
 * @author Magdalena
 */
public class Zad_prog_rozdz_5_zad_2 {

    public static void main(String[] args) { 
        
        double cenaHurtowa;
        double marza;
        double cenaDetaliczna;

        cenaHurtowa = Double.parseDouble(JOptionPane.showInputDialog("Wprowadź cenę hurtową produktu (w pln): "));

        marza = Double.parseDouble(JOptionPane.showInputDialog("Wprowadź wysokość marży (w procentach): "));
            
        cenaDetaliczna = calculateRetail(cenaHurtowa, marza);
            
        JOptionPane.showMessageDialog(null, String.format ("Cena detaliczna produktu wynosi %.2f pln, z czego cena "
                                     + "hurtowa to %.2f pln, a marża %.1f %%.", cenaDetaliczna, cenaHurtowa, marza));
    }
    
    public static double calculateRetail(double cenaHurtowa2, double marza2) {
        
        double cenaDetaliczna2;
        
        cenaDetaliczna2 = cenaHurtowa2 + (cenaHurtowa2*marza2/100);
       
        return cenaDetaliczna2;
    }  
}
