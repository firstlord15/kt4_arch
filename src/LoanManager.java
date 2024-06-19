public class LoanManager {
    public void applyForLoan(String accountHolder, double amount) {
        System.out.println(accountHolder + " applied for a loan of " + amount);
    }

    public void repayLoan(String accountHolder, double amount) {
        System.out.println(accountHolder + " repaid a loan of " + amount);
    }
}