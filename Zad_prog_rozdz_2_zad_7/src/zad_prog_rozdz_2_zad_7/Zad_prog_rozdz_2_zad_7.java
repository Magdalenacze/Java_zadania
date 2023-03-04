
package zad_prog_rozdz_2_zad_7;

import java.util.Scanner;

public class Zad_prog_rozdz_2_zad_7 
{
    public static void main(String[] args) 
    {
        double wartoscKupowanegoProduktu;
        double podatekStanowy;
        double podatekLokalny;
        double lacznaCenaSprzedazy;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Podaj wartość kupowanego produktu: ");
        wartoscKupowanegoProduktu = keyboard.nextDouble();
        
        podatekStanowy = 0.04 * wartoscKupowanegoProduktu;
        podatekLokalny = 0.02 * wartoscKupowanegoProduktu;
        lacznaCenaSprzedazy = wartoscKupowanegoProduktu + podatekStanowy
                                     + podatekLokalny;
        
        System.out.println("Wartość kupowanego produktu wynosi: " 
                          + wartoscKupowanegoProduktu + " dolarów.");
        System.out.println("Podatek stanowy wynosi: " + podatekStanowy 
                          + " dolarów.");
        System.out.println("Podatek lokalny wynosi: " + podatekLokalny 
                          + " dolarów.");
        System.out.println("Łączna cena sprzedaży wynosi: " 
                          + lacznaCenaSprzedazy + " dolarów.");
    } 
}
