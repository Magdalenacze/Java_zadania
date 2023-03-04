
package zad_prog_rozdz_6_zad_12;

import javax.swing.JOptionPane;

/**
 * SavingsAccount
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_12 {

    public static void main(String[] args) {
        
        SavingsAccount sa = new SavingsAccount(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj początkowy stan konta (w pln): ")));
        
        sa.setAnnualRate(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj roczną stopę oprocentowania (w procentach): ")));
        
        int input;
        
        input = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj liczbę miesięcy od czasu założenia konta: "));
        
        double deposit = 0.0;
        double payout = 0.0;
        double monthlyInterest;
        double monthlyInterestTotal = 0.0;
        
        for(int count = 1; count <= input; count++) {
            
           
            deposit +=  sa.deposit(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj kwotę zdeponowaną na koncie w miesiącu nr: " + count)));
            
            
            payout += sa.payout(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj kwotę wypłaconą z konta w miesiącu nr: " + count)));
            
            monthlyInterest = sa.monthlyInterest();
            
            sa.setSavingsAccount(sa.getSavingsAccount() + monthlyInterest);
            
            monthlyInterestTotal += monthlyInterest;
        }       
        JOptionPane.showMessageDialog(null, String.format("Stan końcowy: %.2f pln\nŁączna suma zdeponowanych środków: %.2f pln\n"
                                                        + "Łączna suma wypłaconych pieniędzy: %.2f pln\n"
                                                        + "Łączna wartość odsetek: %.2f pln", sa.getSavingsAccount(), deposit, payout, monthlyInterestTotal));   
    }
}
