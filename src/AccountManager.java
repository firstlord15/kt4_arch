public class AccountManager {
    public void createAccount(String accountType, String accountHolder) {
        System.out.println("Creating " + accountType + " account for " + accountHolder);
    }

    public void closeAccount(String accountType, String accountHolder) {
        System.out.println("Closing " + accountType + " account for " + accountHolder);
    }
}