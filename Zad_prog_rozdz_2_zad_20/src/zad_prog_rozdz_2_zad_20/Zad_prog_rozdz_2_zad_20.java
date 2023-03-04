
package zad_prog_rozdz_2_zad_20;

import javax.swing.JOptionPane;  

public class Zad_prog_rozdz_2_zad_20 
{
    public static void main(String[] args) 
    {
       String str;
       int liczbaSadzonek;
       double dlugoscRzedu;
       double okratowanie;
       double odlegloscMiedzySadzonkami;
       
       str = JOptionPane.showInputDialog("Wprowadź długość rzędu w metrach: ");
       
       dlugoscRzedu = Double.parseDouble(str);
       
       str = JOptionPane.showInputDialog("Wprowadź ilość miejsca zajmowanego "
                                        + "przez okratowanie w metrach: ");
       
       okratowanie = Double.parseDouble(str);
       
       str = JOptionPane.showInputDialog("Wprowadź odległość między sadzonkami "
                                        + "w metrach: ");
       
       odlegloscMiedzySadzonkami = Double.parseDouble(str);
       
       liczbaSadzonek 
           = (int)((dlugoscRzedu - (2 * okratowanie)) / odlegloscMiedzySadzonkami);
       
       JOptionPane.showMessageDialog(null, "Liczba sadzonek, jakie zmieszczą się "
                                    + "w rzędzie, wynosi: " + liczbaSadzonek);
    }
}
