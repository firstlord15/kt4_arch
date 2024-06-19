public class BankFacade {
    private AccountManager accountManager;
    private LoanManager loanManager;
    private PaymentManager paymentManager;

    public BankFacade() {
        this.accountManager = new AccountManager();
        this.loanManager = new LoanManager();
        this.paymentManager = new PaymentManager();
    }

    public void createSavingsAccount(String accountHolder) {
        accountManager.createAccount("Savings", accountHolder);
    }

    public void createCheckingAccount(String accountHolder) {
        accountManager.createAccount("Checking", accountHolder);
    }

    public void closeSavingsAccount(String accountHolder) {
        accountManager.closeAccount("Savings", accountHolder);
    }

    public void closeCheckingAccount(String accountHolder) {
        accountManager.closeAccount("Checking", accountHolder);
    }

    public void applyForLoan(String accountHolder, double amount) {
        loanManager.applyForLoan(accountHolder, amount);
    }

    public void repayLoan(String accountHolder, double amount) {
        loanManager.repayLoan(accountHolder, amount);
    }

    public void makePayment(String fromAccount, String toAccount, double amount) {
        paymentManager.makePayment(fromAccount, toAccount, amount);
    }

    public void receivePayment(String toAccount, double amount) {
        paymentManager.receivePayment(toAccount, amount);
    }
}