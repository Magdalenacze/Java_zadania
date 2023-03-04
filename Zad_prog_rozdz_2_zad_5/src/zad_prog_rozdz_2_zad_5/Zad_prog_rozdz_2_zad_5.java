
package zad_prog_rozdz_2_zad_5;

public class Zad_prog_rozdz_2_zad_5 
{
    public static void main(String[] args) 
    {
        double procentMazowsze = 0.62;
        double zyskPolska = 4600000.0;
        double zyskMazowsze;
        
        zyskMazowsze = procentMazowsze * zyskPolska;
                
        System.out.println("Region mazowiecki generuje sprzedaż na poziomie " 
                          + zyskMazowsze + " złotych rocznie.");
    }
}
