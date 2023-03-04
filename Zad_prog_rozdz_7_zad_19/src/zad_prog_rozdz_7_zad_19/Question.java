
package zad_prog_rozdz_7_zad_19;

/**
 * Klasa Question
 * @author Magdalena
 */
public class Question {
    
    private String questions;
    final static int SIZE = 4;
    private String[] answers;
    private int correct;
    
    public Question () {
        
        questions = "";
        answers = new String[SIZE];
        answers[0] = "";
        answers[1] = "";
        answers[2] = "";
        answers[3] = "";
        correct = 0;
    }
    
    public Question (String aQuestions, String answer1, String answer2, String answer3, String answer4, int aCorrect) {
        
        questions = aQuestions;
        correct = aCorrect;
        
        answers = new String[SIZE];
        answers[0] = answer1;
        answers[1] = answer2;
        answers[2] = answer3;
        answers[3] = answer4;
    }
    
    public void setQuestion(String aQuestions) {
        
        questions = aQuestions;
    }
    
    public void setAnswers(String[] aAnswers) {
        
        answers = new String[aAnswers.length];
        
        for (int index = 0; index < aAnswers.length; index++) {
            
            answers[index] = aAnswers[index];
        }
    }
    
    public String getQuestions() {
        
        return questions;
    }
    
    public String getAnswers() {
        
        String output = "";
        
        for (int index = 0; index < answers.length; index++) {
            
            output += (index + 1) + ". " + answers[index] + "\n";
        }
        
        return output;
    }
    
    public int getSize() {
        
        return SIZE;
    }
    
    public boolean CorrectIncorrect(int aUserAnswer) {
        
        return aUserAnswer == correct;
    }
}
