
package zad_prog_rozdz_6_zad_6;

import javax.swing.JOptionPane;

/**
 * Klasa TestScores
 * @author Magdalena
 */
public class TestScores {
    
    private int testScore1;
    private int testScore2;
    private int testScore3;
    
    public TestScores(int aTestScore1, int aTestScore2, int aTestScore3) {
        
        testScore1 = aTestScore1;
        testScore2 = aTestScore2;
        testScore3 = aTestScore3;  
    }
    
    public TestScores() {
        
        this(0, 0, 0);
    }
    
    public void setTestScore1(int aTestScore1) {
        
        testScore1 = aTestScore1;
    }
     
    public void setTestScore2(int aTestScore2) {
        
        testScore2 = aTestScore2;
    }
    
    public void setTestScore3(int aTestScore3) {
        
        testScore3 = aTestScore3;
    }
     
    public int getTestScore1() {
        
        return testScore1; 
    }
    
    public int getTestScore2() {
        
        return testScore2; 
    }
    
    public int getTestScore3() {
        
        return testScore3; 
    }
    
    public double average() {
        
        return (testScore1 + testScore2 + testScore3) / 3;
    }
    
    public void input() {
        
        testScore1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 1 (od 0 do 100): "));
        
        testScore2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 2 (od 0 do 100): "));
        
        testScore3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 3 (od 0 do 100): "));
    }
    
    public void output() {
        
        JOptionPane.showMessageDialog(null, "Wynik testu nr 1: " + testScore1 + "\n"
                                          + "Wynik testu nr 2: " + testScore2 + "\n"
                                          + "Wynik testu nr 3: " + testScore3 + "\n"
                                          + String.format("Średnia: %.2f", average()));
    }
}
