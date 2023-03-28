
package zad_prog_rozdz_10_zad_1;

/**
 * Klasa TeamLeader
 * @author Magdalena
 */
public class TeamLeader extends ProductionWorker {
    
    private double monthlyBonus;
    private int hoursOfRequiredCourses;
    private int hoursOfCompletedCourses;      
    
    public TeamLeader() {

        this.monthlyBonus = 0.00;
        this.hoursOfRequiredCourses = 0;
        this.hoursOfCompletedCourses = 0;
    }
    
    public TeamLeader(double monthlyBonus, int hoursOfRequiredCourses, int hoursOfCompletedCourses) {
        
        this.monthlyBonus = monthlyBonus;
        this.hoursOfRequiredCourses = hoursOfRequiredCourses;
        this.hoursOfCompletedCourses = hoursOfCompletedCourses;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        
        this.monthlyBonus = monthlyBonus;
    }

    public void setHoursOfRequiredCourses(int hoursOfRequiredCourses) {
        
        this.hoursOfRequiredCourses = hoursOfRequiredCourses;
    }

    public void setHoursOfCompletedCourses(int hoursOfCompletedCourses) {
        
        this.hoursOfCompletedCourses = hoursOfCompletedCourses;
    }

    public double getMonthlyBonus() {
        
        return monthlyBonus;
    }

    public int getHoursOfRequiredCourses() {
        
        return hoursOfRequiredCourses;
    }

    public int getHoursOfCompletedCourses() {
        
        return hoursOfCompletedCourses;
    }
    
    @Override
    public String toString() {
        
        String str = super.toString();
        
        str += "\nStała premia miesięczna: " + getMonthlyBonus() + " pln\n"
             + "Wymagana liczba godzin kursów: " + getHoursOfRequiredCourses() + " h\n"
             + "Liczba godzin ukończonych kursów: " + getHoursOfCompletedCourses() + " h";
               
        return str;
    }  
}
