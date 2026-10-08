
abstract class PaymentGateway {

    void printReceipt() {
        System.out.println("Receipt Generated.");
    }

    abstract void processpayment(double amount);
}

class UPIPayment extends PaymentGateway {

    @Override
    void processpayment(double amount) {
        System.out.println("Processing ₹" + amount + " via UPI QR code.");
    }

}

class CreditCardPayment extends PaymentGateway {

    @Override
    void processpayment(double amount) {
        System.out.println("Processing $" + amount + " via Card Swipe and OTP.");
    }

}

public class Abstraction {

    public static void main(String[] args) {
        PaymentGateway payment1 = new CreditCardPayment();
        payment1.processpayment(500);
        payment1.printReceipt();

        PaymentGateway payment2 = new UPIPayment();
        payment2.processpayment(150);
        payment2.printReceipt();

    }
}
