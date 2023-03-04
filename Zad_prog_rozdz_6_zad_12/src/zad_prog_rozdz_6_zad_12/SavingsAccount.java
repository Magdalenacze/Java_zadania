
package zad_prog_rozdz_6_zad_12;

/**
 * Klasa SavingsAccount
 * @author Magdalena
 */
public class SavingsAccount {
    
    private double annualRate;
    private double savingsAccount;
    
    public SavingsAccount(double aSavingsAccount) {
        
        savingsAccount = aSavingsAccount;
        annualRate = 0.0;
    }
    
    public SavingsAccount() {
        
        savingsAccount = 0.0;
        annualRate = 0.0;
    }
    
    public void setAnnualRate(double aAnnualRate) {
        
        annualRate = aAnnualRate;
    }
    
    public void setSavingsAccount(double aSavingsAccount) {
        
        savingsAccount = aSavingsAccount;
    }
    
    public double getAnnualRate() {
        
        return annualRate;
    }
    
    public double getSavingsAccount() {
        
        return savingsAccount;
    }
    
    public double payout(double aPayout) {
                
        savingsAccount = savingsAccount - aPayout;
        
        return aPayout;
    }
    
     public double deposit(double aDeposit) {
                
        savingsAccount = savingsAccount + aDeposit;
        
        return aDeposit;
    }
     
     public double monthlyInterest() {
        
        return (((annualRate * 0.01) / 12) * savingsAccount);
    }
}
