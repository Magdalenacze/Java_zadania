
package zad_prog_rozdz_6_zad_12;

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

/**
 * SavingsAccount
 * @author Magdalena
 */
public class Zad_prog_rozdz_6_zad_12 {

    public static void main(String[] args) throws IOException {
        
        SavingsAccount sa = new SavingsAccount(500.00);
        
        sa.setAnnualRate(Double.parseDouble(JOptionPane.showInputDialog(null, "Podaj roczną stopę oprocentowania (w procentach): ")));
        
        File file1 = new File("Deposits.txt");
        Scanner inputFile1 = new Scanner(file1);
        
        double totalDeposits = 0.0;
        
            while(inputFile1.hasNext()) {

                totalDeposits += sa.deposit(Double.parseDouble(inputFile1.nextLine()));
            }
   
        inputFile1.close();

        File file2 = new File("Withdrawals.txt");
        Scanner inputFile2 = new Scanner(file2);
        
        double totalWithdrawals = 0.0;
        
            while(inputFile2.hasNext()) {

                totalWithdrawals += sa.payout(Double.parseDouble(inputFile2.nextLine()));  
            }
            
        inputFile2.close();

        double monthlyInterest;
        
        monthlyInterest = sa.monthlyInterest();
        
        sa.setSavingsAccount(sa.getSavingsAccount() + monthlyInterest);
 
        JOptionPane.showMessageDialog(null, String.format("Stan końcowy konta: %.2f pln\nOdsetki: %.2f pln", sa.getSavingsAccount(), sa.monthlyInterest()));   
    }
}
