
package zad_prog_rozdz_6_zad_6;

import javax.swing.JOptionPane;

/**
 * TestScores
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_6 {

    public static void main(String[] args) {
        
        TestScores ts = new TestScores();
           
        //ts.setTestScore1(Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 1 (od 0 do 100): ")));
        
        //ts.setTestScore2(Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 2 (od 0 do 100): ")));
        
        //ts.setTestScore3(Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 3 (od 0 do 100): ")));
        
        ts = getResult(ts);   

        JOptionPane.showMessageDialog(null, "Wynik testu nr 1: " + ts.getTestScore1() + "\n"
                                          + "Wynik testu nr 2: " + ts.getTestScore2() + "\n"
                                          + "Wynik testu nr 3: " + ts.getTestScore3() + "\n"
                                          + String.format("Średnia: %.2f", ts.average()));
    }
    
    public static TestScores getResult(TestScores ats){
        
        ats.setTestScore1(Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 1 (od 0 do 100): ")));
        
        ats.setTestScore2(Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 2 (od 0 do 100): ")));
        
        ats.setTestScore3(Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź wynik testu nr 3 (od 0 do 100): "))) ;
         
        return ats;
    }
}
