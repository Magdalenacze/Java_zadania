
package zad_prog_rozdz_7_zad_1;

/**
 * Klasa RainFall
 * @author Magdalena
 */
public class RainFall {
    
    private double[] rainFallMonth;
    
    public RainFall() {
        
        rainFallMonth = new double[12];
    }
    
    public RainFall(double[] aRainFallMonth) {
        
        rainFallMonth = new double[aRainFallMonth.length];
        
        for (int index = 0; index < aRainFallMonth.length; index++)
            
            rainFallMonth[index] = aRainFallMonth[index];
    }

    public double getTotal() {
        
        double total = 0.0;
        
        for (int index = 0; index < rainFallMonth.length; index++)
            
            total += rainFallMonth[index];
        
        return total;
    }
    
    public double getAverage() {
        
        return getTotal() / rainFallMonth.length;
    }
    
    public int getHighest() {
        
        double highest = rainFallMonth[0];
        int maxIndex = 0;
        
        for (int index = 1; index < rainFallMonth.length; index++) {
            
            if (rainFallMonth[index] > highest)
            {
                highest = rainFallMonth[index];
                maxIndex = index;
            }
        }
        
        return maxIndex;
    }
    
    public int getLowest() {
        
        double lowest = rainFallMonth[0];
        int minIndex = 0;
        
        for (int index = 1; index < rainFallMonth.length; index++) {
            
            if (rainFallMonth[index] < lowest)
                
                lowest = rainFallMonth[index];
                minIndex = index;
        }
        
        return minIndex;
    }
}
