
package zad_prog_rozdz_9_zad_6;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Lista numerów telefonów na potrzeby telemarketingu
 * @author Magdalena
 */
public class Zad_prog_rozdz_9_zad_6 {

    public static void main(String[] args) {
        
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> phone = new ArrayList<>();
        
        name.add("Hurkacz, Renata");
        name.add("Jurczyk, Julia");
        name.add("Szewczyk, Waldemar");
        name.add("Szewczyk, Bartosz");
        
        phone.add("555-312-642");
        phone.add("555-253-122");
        phone.add("555-128-940");
        phone.add("555-420-851");
        
        String input = JOptionPane.showInputDialog(null, "Podaj interesujące Cię nazwisko (lub jego pierwsze litery): ");
        
        String output = "";
        
        for (int index = 0; index < name.size(); index++) {
        
            if (name.get(index).toLowerCase().startsWith(input)) {

                output += name.get(index) + ": " + phone.get(index) + "\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, output);
    }
}
