
package zad_prog_rozdz_10_zad_4_5_6;

/**
 * Klasa GradedActivity
 * @author Magdalena
 */
public class GradedActivity {
    
    private double score;
    
    public GradedActivity() {
        
        this.score = 0.0;
    }
    
    public GradedActivity(double score) {
        
        this.score = score;
    }

    public void setScore(double score) {
        
        this.score = score;
    }

    public double getScore() {
        
        return score;
    }
    
    public char getGrade() {
        
        char letterGrade;
        
        if (score >= 90) {
            letterGrade = '5'; 
        } else if (score >= 80) {
            letterGrade = '4';
        } else if (score >= 70) {
            letterGrade = '3';
        } else if (score >= 60) {
            letterGrade = '2';
        } else {
            letterGrade = '1';
        }
        
        return letterGrade;
    }
}
