
package zad_prog_rozdz_7_zad_18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Książka telefoniczna w obiekcie typu ArrayList
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_18 {

    public static void main(String[] args) {
        
        ArrayList<PhoneBookEntry> list = new ArrayList<PhoneBookEntry>();
        
        list.add(new PhoneBookEntry("Czempisz Łukasz", 506091846));
        list.add(new PhoneBookEntry("Król-Czempisz Magdalena", 509583471));
        list.add(new PhoneBookEntry("Czempisz Brygida", 506573960));
        list.add(new PhoneBookEntry("Juraszek Cecylia", 513453742));
        list.add(new PhoneBookEntry("Czempisz Piotr", 501451423));
        //list.get(0).setName("Czempisz Łukasz");
        //list.get(0).setPhone(506091846);
        String output = "";
        
        for (int index = 0; index < list.size(); index++) {
            
            PhoneBookEntry pbe = list.get(index);
            
            output += "Nazwisko i imię: " + pbe.getName() + "\n" +
            
                      "Numer telefonu: " + pbe.getPhone() + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }
}
