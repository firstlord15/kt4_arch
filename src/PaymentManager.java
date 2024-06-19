public class PaymentManager {
    public void makePayment(String fromAccount, String toAccount, double amount) {
        System.out.println("Making a payment of " + amount + " from " + fromAccount + " to " + toAccount);
    }

    public void receivePayment(String toAccount, double amount) {
        System.out.println("Receiving a payment of " + amount + " to " + toAccount);
    }
}