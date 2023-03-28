
package zad_prog_rozdz_10_zad_4_5_6;

/**
 *
 * @author Magdalena
 */
public class PassFailExam extends GradedActivity {
    
    private double minPassingScore;
    
    public PassFailExam() {
        
        this.minPassingScore = 0.0;
    }

    public PassFailExam(double minPassingScore) {
        
        this.minPassingScore = minPassingScore;
    }
    
    @Override
    public char getGrade() {
        
        char letterGrade;
        
        if (super.getScore() >= minPassingScore) {
            letterGrade = 'Z';
        } else {
            letterGrade = 'N';
        }
        
        return letterGrade;
    } 
}
