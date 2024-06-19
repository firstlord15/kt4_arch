public class BankSystem {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();

        bankFacade.createSavingsAccount("John Doe");
        bankFacade.applyForLoan("John Doe", 5000);
        bankFacade.makePayment("John's Savings Account", "Jane's Account", 200);
        bankFacade.receivePayment("John's Savings Account", 150);
        bankFacade.repayLoan("John Doe", 500);
        bankFacade.closeSavingsAccount("John Doe");
    }
}