
package zad_prog_rozdz_10_zad_4_5_6;

/**
 * Klasa FinalExam
 * @author Magdalena
 */
public class FinalExam extends GradedActivity {
    
    private int questions;
    private double points;
    private int wrongAnswers;
     
    public FinalExam() {
         
        double examPoints = 0.0;
        
        this.questions = 0;
        this.points = 0.0;
        this.wrongAnswers = 0;
    }

    public FinalExam(int questions, double points, int wrongAnswers) {

        double examPoints;
        
        this.questions = questions;
        this.points = points;
        this.wrongAnswers = wrongAnswers;
        
        points = 100.0 / questions;
        examPoints = 100.0 - (wrongAnswers * points);
        
        setScore(examPoints);
    }
    
    public double getPoints() {
        
        return points;
    }
    
    public int getWrongAnswers() {
        
        return wrongAnswers;
    }
}
