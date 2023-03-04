
package zad_prog_rozdz_2_zad_18;

import javax.swing.JOptionPane;

public class Zad_prog_rozdz_2_zad_18 
{
    public static void main(String[] args) 
    {
        String imie, wiek, miejsceZamieszkania, nazwaUczelni, zawod, 
               gatunekZwierzecia, imieZwierzecia;
        
        imie = JOptionPane.showInputDialog("Podaj swoje imię: ");
        
        wiek = JOptionPane.showInputDialog("Podaj, ile masz lat: ");
        
        miejsceZamieszkania = JOptionPane.showInputDialog("Podaj nazwę swojego"
                                                         + " miejsca zamieszkania: ");
        
        nazwaUczelni = JOptionPane.showInputDialog("Podaj nazwę swojej uczelni: ");
        
        zawod = JOptionPane.showInputDialog("Podaj, jaki jest twój zawód: ");
        
        gatunekZwierzecia = JOptionPane.showInputDialog("Podaj, jakiego gatunku"
                                                       + " jest twoje zwierzę: ");
        
        imieZwierzecia = JOptionPane.showInputDialog("Podaj, jak ma na imię twoje"
                                                    + " zwierzę: ");
        
        System.out.println("Pewnego razu żył sobie " + imie + ",który mieszkał w " 
                          + miejsceZamieszkania + ". W wieku " + wiek + " " + imie 
                          + "\nrozpoczął studia na " + nazwaUczelni + ". " + imie 
                          + " ukończył studia i rozpoczął pracę jako " + zawod 
                          + ". " + "Wtedy " + imie + "\nadoptował " + gatunekZwierzecia 
                          + " o imieniu " + imieZwierzecia + " i żyli razem długo "
                          + "i szczęśliwie!");
    } 
}
