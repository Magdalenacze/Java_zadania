
package zad_prog_rozdz_6_zad_1;

/**
 * Employee
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_1 {
    
    public static void main(String[] args) {
        
        Employee E1 = new Employee("Sara Magura", 47899, "Rachunkowość", "Wiceprezes");
        
        Employee E2 = new Employee("Marek Janczyk", 39119, "Informatyka", "Programista");
        
        Employee E3 = new Employee("Julia Rak", 81774, "Produkcja", "Inżynier");
        
        E1.show();
        
        E2.show();
        
        E3.show(); 
    }
}
