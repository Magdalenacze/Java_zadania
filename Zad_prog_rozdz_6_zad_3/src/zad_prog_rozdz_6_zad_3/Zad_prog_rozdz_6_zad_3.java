
package zad_prog_rozdz_6_zad_3;

/**
 * Dane osobowe
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_3 {

    public static void main(String[] args) {
        
        PersonalData pd1 = new PersonalData("Magdalena Król-Czempisz", "ul. Pod Kasztanami 39, Katowice", 32, 509583471);
        
        PersonalData pd2 = new PersonalData("Łukasz Czempisz", "ul. Pod Kasztanami 39, Katowice", 32, 506091846);
        
        PersonalData pd3 = new PersonalData("Brygida Czempisz", "ul. Andersa 26/5, Katowice", 55, 506573960);
        
        pd1.show();
        
        pd2.show();
        
        pd3.show(); 
    }
}
