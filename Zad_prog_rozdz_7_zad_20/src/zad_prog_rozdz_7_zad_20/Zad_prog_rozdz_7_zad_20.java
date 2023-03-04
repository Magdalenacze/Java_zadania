
package zad_prog_rozdz_7_zad_20;

import javax.swing.JOptionPane;

/**
 * Kwadrat magiczny Lo Shu
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_20 {

    public static void main(String[] args) {
        
        int[][] kwadratLoShu = { { 4, 9, 2 }, 
                                 { 3, 5, 7 },
                                 { 8, 1, 6 } };
        
        if (getRowTotal(kwadratLoShu) && getColTotal(kwadratLoShu) && getDiagonalA(kwadratLoShu) && getDiagonalB(kwadratLoShu)) {
            
            JOptionPane.showMessageDialog(null, "Stworzona tablica dwuwymiarowa reprezentuje kwadrat magiczny Lo Shu.");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Stworzona tablica dwuwymiarowa nie reprezentuje kwadrata magicznego Lo Shu.");
        }
    }
        
    private static boolean getRowTotal (int[][] aKwadratLoShu) {

        int rowTotal = 0;
        
        for (int row = 0; row < aKwadratLoShu.length; row++) {
            
            for (int col = 0; col < aKwadratLoShu[row].length; col++) {
                
                rowTotal += aKwadratLoShu[row][col];   
            }
                if (rowTotal != 15) {
                    
                    return false;
                }

            rowTotal = 0;
        }
        
        return true;
    }
    
    private static boolean getColTotal (int[][] aKwadratLoShu) {

        int colTotal = 0;
        
        for (int col = 0; col < aKwadratLoShu[0].length; col++) {
            
            for (int row = 0; row < aKwadratLoShu.length; row++) {
                
                colTotal += aKwadratLoShu[row][col];   
            }
                if (colTotal != 15) {
                    
                    return false;
                }

            colTotal = 0;
        }

        return true;
    }
    
    private static boolean getDiagonalA (int[][] aKwadratLoShu) {

        int diagonalATotal = 0;
        
        for (int col = 0; col < aKwadratLoShu[0].length; col++) {
            
            for (int row = 0; row < aKwadratLoShu.length; row++) {
                
                if (col == row)
                
                diagonalATotal += aKwadratLoShu[row][col];
            }
        }
        
        if (diagonalATotal != 15) {
                   
            return false;
        }

        return true;
    }
    
    private static boolean getDiagonalB (int[][] aKwadratLoShu) {

        int diagonalBTotal = 0;
        
        for (int col = 0; col < aKwadratLoShu[0].length; col++) {
            
            for (int row = 0; row < aKwadratLoShu.length; row++) {
                
                if (col + row == 2)
                
                diagonalBTotal += aKwadratLoShu[row][col];
            }
        }
        
        if (diagonalBTotal != 15) {
                    
            return false;
        }

        return true;
    }
}

