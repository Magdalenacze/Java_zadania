
package zad_prog_rozdz_7_zad_6;

/**
 * Klasa DriverExam
 * @author Magdalena
 */
public class DriverExam {
    
    final static int SIZE = 20;
    private char[] answers;
    private char[] student;
    
    public DriverExam() {
        
        answers = new char[SIZE];
        answers[0] = 'B';
        answers[1] = 'D';
        answers[2] = 'A';
        answers[3] = 'A';
        answers[4] = 'C';
        answers[5] = 'A';
        answers[6] = 'B';
        answers[7] = 'A';
        answers[8] = 'C';
        answers[9] = 'D';
        answers[10] = 'B';
        answers[11] = 'C';
        answers[12] = 'D';
        answers[13] = 'A';
        answers[14] = 'D';
        answers[15] = 'C';
        answers[16] = 'C';
        answers[17] = 'B';
        answers[18] = 'D';
        answers[19] = 'A';
 
        student = new char[SIZE];
    }
    
    public DriverExam(char[] aStudent) {
        
        answers = new char[SIZE];
        answers[0] = 'B';
        answers[1] = 'D';
        answers[2] = 'A';
        answers[3] = 'A';
        answers[4] = 'C';
        answers[5] = 'A';
        answers[6] = 'B';
        answers[7] = 'A';
        answers[8] = 'C';
        answers[9] = 'D';
        answers[10] = 'B';
        answers[11] = 'C';
        answers[12] = 'D';
        answers[13] = 'A';
        answers[14] = 'D';
        answers[15] = 'C';
        answers[16] = 'C';
        answers[17] = 'B';
        answers[18] = 'D';
        answers[19] = 'A';
        
        student = new char[aStudent.length];
        
        for (int index = 0; index < aStudent.length; index++) {
            
            student[index] = aStudent[index];
        }
    }
    
    public void setStudent(char[] aStudent) {
        
        student = new char[aStudent.length];
        
        for (int index = 0; index < aStudent.length; index++) {
            
            student[index] = aStudent[index];
        }
    }
    
    public int getSize() {
        
        return SIZE;
    }
    
    public int totalCorrect() {
        
        int totalCorr = 0;
        
        for (int i = 0; i < SIZE; i++) {
            
            if (answers[i] == student[i])
                
                totalCorr += 1;
        }
        
        return totalCorr;
    }
    
    public int totalIncorrect() {
        
        return SIZE - totalCorrect();
    }
    
    public String questionsMissed() {
        
        String values = "";

        for (int i = 0; i < SIZE; i++) {

            if (student[i] == ' ')

                values = values + " ," + (i + 1);
        }

        return values;
    }
            
    public boolean passed() {
    
        if (totalCorrect() >= 15) {
            
            return true;
        }
        else {
            
            return false;
        }
    }
    
    public String result() {
        
        if (passed()) {
            
            return "zdany!";
        }
        else {
            
            return "nie zdany!";
        }
    }
}
