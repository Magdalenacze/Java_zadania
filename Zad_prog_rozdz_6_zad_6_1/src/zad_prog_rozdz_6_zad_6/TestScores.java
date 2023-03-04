
package zad_prog_rozdz_6_zad_6;

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
}
