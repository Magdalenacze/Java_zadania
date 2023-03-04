
package zad_prog_rozdz_8_zad_5;

/**
 * Klasa Month
 * @author Magdalena
 */
public class Month {
    
    private int monthNumber;
    
    public Month() {
        
        monthNumber = 1;
    }
    
    public Month(int aMonthNumber) {
        
        monthNumber = aMonthNumber;
        
        if (aMonthNumber < 1 || aMonthNumber > 12) 
            
            monthNumber = 1;   
    }
    
    public Month(String aMonth) {
        
        switch (aMonth) {
            
            case "Styczeń":
                monthNumber = 1;
                break;
            case "Luty":
                monthNumber = 2;
                break;
            case "Marzec":
                monthNumber = 3;
                break;
            case "Kwiecień":
                monthNumber = 4;
                break;
            case "Maj":
                monthNumber = 5;
                break;
            case "Czerwiec":
                monthNumber = 6;
                break;
            case "Lipiec":
                monthNumber = 7;
                break;
            case "Sierpień":
                monthNumber = 8;
                break;
            case "Wrzesień":
                monthNumber = 9;
                break;
            case "Październik":
                monthNumber = 10;
                break;
            case "Listopad":
                monthNumber = 11;
                break;
            case "Grudzień":
                monthNumber = 12;
                break;
        }
    }
        
    public void setMonthNumber(int aMonthNumber) {
        
        monthNumber = aMonthNumber;
        
        if (aMonthNumber < 1 || aMonthNumber > 12) 
            
            monthNumber = 1;   
    }
    
    public int getMonthNumber() {
        
        return monthNumber;
    }
    
    public String getMonthName(String aMonth) {
        
        return aMonth;
    }
    
    public String toString(String aMonth) {
               
        return aMonth;
    }
    
    public boolean equals(Month object2) {

        boolean status;
        
        if (this.monthNumber == object2.getMonthNumber()) {
            
            status = true;
            
        } else {
            
            status = false;
        }
        
        return status;
    }
    
    public boolean greatherThan(Month object2) {

        boolean status;
        
        if (this.monthNumber > object2.getMonthNumber()) {
            
            status = true;
            
        } else {
            
            status = false;
        }
        
        return status;
    }
    
    public boolean lessThan(Month object2) {

        boolean status;
        
        if (this.monthNumber < object2.getMonthNumber()) {
            
            status = true;
            
        } else {
            
            status = false;
        }
        
        return status;
    }
}  
