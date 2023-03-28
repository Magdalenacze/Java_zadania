
package zad_prog_rozdz_10_zad_4_5_6;

/**
 * Klasa CourseGrades
 * @author Magdalena
 */
public class CourseGrades implements Analyzable {
    
    GradedActivity[] grades;
    
    public CourseGrades() {
        
        grades = new GradedActivity[4];
    }
    
    public CourseGrades(GradedActivity[] grades) {
        
        this.grades = new GradedActivity[grades.length];
        
        for (int index = 0; index < grades.length; index++)
            
            grades[index] = grades[index];
    }
    
    public void setLab(GradedActivity lab) {
        
        grades[0] = lab;
    }
    
    public void setPassFailExam(PassFailExam passFailExam) {
        
        grades[1] = passFailExam;
    }
    
    public void setEssay(Essay essay) {
        
        grades[2] = essay;
    }
    
    public void setFinalExam(FinalExam finalExam) {
        
        grades[3] = finalExam;
    }
    
    @Override
    public String toString() {
        
        String str = "Zadanie laboratoryjne - wynik punktowy: " + grades[0].getScore() + ", ocena: " + grades[0].getGrade() + "\n"
                   + "Egzamin typu zdał/nie zdał - wynik punktowy: " + grades[1].getScore() + ", ocena: " + grades[1].getGrade() + "\n"
                   + "Esej - wynik punktowy: " + grades[2].getScore() + ", ocena: " + grades[2].getGrade() + "\n"
                   + "Egzamin końcowy - wynik punktowy: " + grades[3].getScore() + ", ocena: " + grades[3].getGrade();
               
        return str;
    }
    
    public double getTotal() {
        
        double total = 0.0;
        
        for (int index = 0; index < grades.length; index++)
            
            total += grades[index].getScore();
        
        return total;
    }
            
    @Override
    public double getAverage() {
        return getTotal() / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GradedActivity getLowest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
