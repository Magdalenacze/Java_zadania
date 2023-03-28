
package zad_prog_rozdz_10_zad_4_5_6;

/**
 * Klasa Essay
 * @author Magdalena
 */
public class Essay extends GradedActivity {
    
    private double grammar;
    private double spelling;
    private double theRightLength;
    private double contents;
    
    public Essay() {
        
        this.grammar = 0.0;
        this.spelling = 0.0;
        this.theRightLength = 0.0;
        this.contents = 0.0;
    }

    public Essay(double grammar, double spelling, double theRightLength, double contents) {
        
        this.grammar = grammar;
        this.spelling = spelling;
        this.theRightLength = theRightLength;
        this.contents = contents;
    }

    public void setGrammar(double grammar) {
        
        this.grammar = grammar;
    }

    public void setSpelling(double spelling) {
        
        this.spelling = spelling;
    }

    public void setTheRightLength(double theRightLength) {
        
        this.theRightLength = theRightLength;
    }

    public void setContents(double contents) {
        
        this.contents = contents;
    }

    public double getGrammar() {
        
        return grammar;
    }

    public double getSpelling() {
        
        return spelling;
    }

    public double getTheRightLength() {
        
        return theRightLength;
    }

    public double getContents() {
        
        return contents;
    }
    
    public double getTotalPoints() {
        
        return getGrammar() + getSpelling() + getTheRightLength() + getContents();
    }
    
    @Override
    public String toString() {
        
        String str = "Gramatyka - uzyskana liczba punktów: " + getGrammar() + "\n"
                   + "Ortografia - uzyskana liczba punktów: " + getSpelling() + "\n"
                   + "Odpowiednia długość - uzyskana liczba punktów: " + getTheRightLength() + "\n"
                   + "Treść - uzyskana liczba punktów: " + getContents() + "\n"
                   + "Łączna suma punktów: " + getTotalPoints();
               
        return str;
    }
}
