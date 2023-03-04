
package zad_prog_rozdz_6_zad_14;

import javax.swing.JOptionPane;

/**
 * 
 * Koszty badań
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_14 {

    public static void main(String[] args) {
        
        Patient pt = new Patient("Magdalena Joanna Król-Czempisz", "ul. Pod Kasztanami 39, 40-462 Katowice", 
                                 "509-583-471", "Łukasz Czempisz, 506-091-846");
        
        Procedure pe1 = new Procedure("Badanie fizykalne", "31.01.2023 r.", "dr Iwicki", 250.00);
        Procedure pe2 = new Procedure("Badanie rentgenowskie", "31.01.2023 r.", "dr Jaracz", 500.00);
        Procedure pe3 = new Procedure("Badanie krwi", "31.01.2023 r.", "dr Szymczak", 200.00);

        JOptionPane.showMessageDialog(null, "Imiona i nazwisko: " + pt.getName() + "\nAdres: " + pt.getAddress()
                                   + "\nTelefon: " + pt.getPhone() + "\nOsoba kontaktowa: " + pt.getContactPerson()
                                   + "\n\nNazwa: " + pe1.getExamination() + "\nData: " + pe1.getDate() + "\nDoktor: " + pe1.getDoctor() + "\nOpłata: " + pe1.getFee() + " pln"
                                   + "\n\nNazwa: " + pe2.getExamination() + "\nData: " + pe2.getDate() + "\nDoktor: " + pe2.getDoctor() + "\nOpłata: " + pe2.getFee() + " pln"
                                   + "\n\nNazwa: " + pe3.getExamination() + "\nData: " + pe3.getDate() + "\nDoktor: " + pe3.getDoctor() + "\nOpłata: " + pe3.getFee() + " pln"
                                   + "\n\nŁączny koszt wszystkich badań: " + (pe1.getFee() + pe2.getFee() + pe3.getFee()) + " pln");
    } 
}
