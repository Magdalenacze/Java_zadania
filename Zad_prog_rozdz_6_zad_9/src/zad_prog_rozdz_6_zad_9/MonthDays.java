
package zad_prog_rozdz_6_zad_9;

/**
 * Klasa MonthDays
 * @author Magdalena
 */
public class MonthDays {
    
    private int month;
    private int year;
    
    public MonthDays(int aMonth, int aYear){
        
        month = aMonth;
        year = aYear;
    }
    
    public MonthDays(){
        
        month = 0;
        year = 0;
    }
     
    public void setMonth(int aMonth) {
        
        month = aMonth;
    }
     
    public void setYear(int aYear) {
        
        year = aYear;
    }
     
    public int getMonth() {
        
        return month;
    }
      
    public int getYear() {
        
        return year;
    }
      
    public int numberOfDays() {
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            
            return 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            
            return 30;
        }    
        else if (month == 2 && ((year % 100) == 0) && ((year % 400) == 0) || month == 2 && ((year % 100) != 0) && ((year % 4) == 0)){
            
            return 29;
        }
        else {
            
            return 28;
        } 
    }
}
