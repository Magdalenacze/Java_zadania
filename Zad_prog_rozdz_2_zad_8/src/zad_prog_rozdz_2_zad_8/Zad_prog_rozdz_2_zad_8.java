
package zad_prog_rozdz_2_zad_8;

import java.util.Scanner;

public class Zad_prog_rozdz_2_zad_8 
{
    public static void main(String[] args) 
    {
        double liczbaZjedzonychCiasteczek;
        double ciasteczkoKalorie;
        double liczbaSkonsumowanychKalorii;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Podaj liczbę zjedzonych ciasteczek: ");
        liczbaZjedzonychCiasteczek = keyboard.nextDouble();
        
        ciasteczkoKalorie = 300.0 / 4;
        liczbaSkonsumowanychKalorii = ciasteczkoKalorie 
                                      * liczbaZjedzonychCiasteczek;
        
        System.out.println("Liczba skonsumowanych kalorii wynosi: " 
                          + liczbaSkonsumowanychKalorii + " kalorii.");
    }
}
