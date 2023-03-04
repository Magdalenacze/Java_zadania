
package zad_prog_rozdz_7_zad_14;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Wyszukiwanie imion
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_14 {

    public static void main(String[] args) throws IOException {
        
        ArrayList<String> boyNames = new ArrayList<>();
        
        ArrayList<String> girlNames = new ArrayList<>();
        
        getBoys(boyNames);
        
        getGirls(girlNames);
        
        String inputBoy;
        String inputGirl;
        
        inputBoy = JOptionPane.showInputDialog(null, "Wprowadź imię męskie lub zostaw puste pole: ");
        inputGirl = JOptionPane.showInputDialog(null, "Wprowadź imię żeńskie lub zostaw puste pole: ");
        
        answerBoy(boyNames, inputBoy);
        
        answerGirl(girlNames, inputGirl);
        
        JOptionPane.showMessageDialog(null, answerBoy(boyNames, inputBoy) + "\n\n" + answerGirl(girlNames, inputGirl));
    }
    
    private static void getBoys(ArrayList<String> aBoyNames) throws IOException {
        
        File file = new File("BoyNames.txt");
        Scanner inputFile = new Scanner(file);

            while(inputFile.hasNext()) {

                aBoyNames.add(inputFile.nextLine());
            }

        inputFile.close();
    }
    
    private static void getGirls(ArrayList<String> aGirlNames) throws IOException {
        
        File file = new File("GirlNames.txt");
        Scanner inputFile = new Scanner(file);

            while(inputFile.hasNext()) {

                aGirlNames.add(inputFile.nextLine());
            }

        inputFile.close();
    }
    
    private static String answerBoy(ArrayList<String> aBoyNames, String aInputBoy) throws IOException {
        
        if (!(aInputBoy.equals(""))) {
            
            for (int i = 0; i < aBoyNames.size(); i++) {

                if (aBoyNames.get(i).equals(aInputBoy)) {

                    return "Podane imię męskie występuje wśród 200 najpopularniejeszych "
                         + "imion męskich w USA w latach 2000-2009.";
                }
                else {
                    
                }
            }
            
             return "Podane imię męskie nie występuje wśród 200 najpopularniejeszych "
                                              + "imion męskich w USA w latach 2000-2009.";
        }
        else {
            
            return "Nie podano żadnego imienia męskiego.";
        }  
    }
    
    private static String answerGirl(ArrayList<String> aGirlNames, String aInputGirl) throws IOException {
        
        if (!(aInputGirl.equals(""))) {
            
            for (int i = 0; i < aGirlNames.size(); i++) {

                if (aGirlNames.get(i).equals(aInputGirl)) {

                    return "Podane imię żeńskie występuje wśród 200 najpopularniejeszych "
                         + "imion męskich w USA w latach 2000-2009.";
                }
                else {
                       
                }
            }
            
             return "Podane imię żeńskie nie występuje wśród 200 najpopularniejeszych "
                                              + "imion męskich w USA w latach 2000-2009.";
        }
        else {
            
            return "Nie podano żadnego imienia żeńskiego.";
        }
    }
}
