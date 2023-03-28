
package zad_prog_rozdz_10_zad_1;

import javax.swing.JOptionPane;

/**
 * Employee and ProductionWorker
 * @author Magdalena
 */
public class Zad_prog_rozdz_10_zad_1 {

    public static void main(String[] args) {
        
//        ProductionWorker pw = new ProductionWorker();
//        
//        pw.setEmployeeName(JOptionPane.showInputDialog(null, "Podaj nazwisko pracownika: "));
//        pw.setEmployeeNumber(JOptionPane.showInputDialog(null, "Podaj numer pracownika (w formacie XXX-L, gdzie X to cyfry 0-9, a L to litery A-M): "));
//        pw.setDateOfEmployment(JOptionPane.showInputDialog(null, "Podaj datę zatrudnienia (np. 01.01.2000 r.): "));
//        
//        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj zmianę dzienną (jako cyfrę 1) lub nocną (jako cyfrę 2): "));
//        
//        while (input != 1 && input != 2) {
//            
//            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Błędne dane. Podaj zmianę dzienną (jako cyfrę 1) lub nocną (jako cyfrę 2): "));   
//        }
//        
//        pw.setShift(input);
//        
//        pw.setHourlyRate(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj stawkę godzinową (w pln): ")));
//        
//        JOptionPane.showMessageDialog(null, pw.toString());
    
//        ShiftSupervisor ss = new ShiftSupervisor();
//        
//        ss.setEmployeeName(JOptionPane.showInputDialog(null, "Podaj nazwisko pracownika: "));
//        ss.setEmployeeNumber(JOptionPane.showInputDialog(null, "Podaj numer pracownika (w formacie XXX-L, gdzie X to cyfry 0-9, a L to litery A-M): "));
//        ss.setDateOfEmployment(JOptionPane.showInputDialog(null, "Podaj datę zatrudnienia (np. 01.01.2000 r.): ")); 
//        ss.setAnnualSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj roczne wynagrodzenie (w pln): ")));
//        ss.setAnnualSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj roczną premię (w pln): ")));
//        
//        JOptionPane.showMessageDialog(null, ss.toString());
        
        TeamLeader tl = new TeamLeader();
        
        tl.setEmployeeName(JOptionPane.showInputDialog(null, "Podaj nazwisko pracownika: "));
        tl.setEmployeeNumber(JOptionPane.showInputDialog(null, "Podaj numer pracownika (w formacie XXX-L, gdzie X to cyfry 0-9, a L to litery A-M): "));
        tl.setDateOfEmployment(JOptionPane.showInputDialog(null, "Podaj datę zatrudnienia (np. 01.01.2000 r.): "));
        
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj zmianę dzienną (jako cyfrę 1) lub nocną (jako cyfrę 2). Wpisz 0, jeżeli nie dotyczy. "));
        
        while (input != 1 && input != 2 && input != 0) {
            
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Błędne dane. Podaj zmianę dzienną (jako cyfrę 1) lub nocną (jako cyfrę 2). Wpisz 0, jeżeli nie dotyczy. "));   
        }
        
        tl.setShift(input);
        tl.setHourlyRate(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj stawkę godzinową (w pln): ")));
        tl.setMonthlyBonus(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj wysokość premii miesięcznej (w pln): ")));
        tl.setHoursOfRequiredCourses(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj wymaganą liczbę godzin kursów: ")));
        tl.setHoursOfCompletedCourses(Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj ukończoną liczbę godzin kursów: ")));
        
        JOptionPane.showMessageDialog(null, tl.toString());
    }
}
