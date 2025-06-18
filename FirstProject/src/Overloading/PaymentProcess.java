package Overloading;

public class PaymentProcess {

    // Credit card
    public void makePayment(String cardNumber, String CVV, String expiryDate) {
        System.out.println("Paid by Creditcard " + cardNumber);
    }

    // UPI
    public void makePayment(String upiId) {
        System.out.println("Paid by upiID " + upiId);
    }

    // Wallet
    public void makePayment(String walletId, int amount) {
        System.out.println("Paid by walletId " + walletId + " Amount: " + amount);
    }

    public static void main(String[] args) {
        PaymentProcess obj = new PaymentProcess();

        obj.makePayment("658954d16522", "123", "02/5/25"); // Credit card payment
        obj.makePayment("upiid123");                       // UPI payment
        obj.makePayment("fghjkl", 25000);                  // Wallet payment
    }
}