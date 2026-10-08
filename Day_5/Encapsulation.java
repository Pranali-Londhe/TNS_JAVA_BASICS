
class BankAccount1 {

    // Private fields
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount1(String holderName, double balance) {

        this.holderName = holderName;
        setBalance(balance);
    }

    // Getter
    public double getBalance() {
        return this.balance;
    }

    // Setter
    public void setBalance(double amount) {

        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid balance: cannot be negative!");
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount1 acc = new BankAccount1("Alex", 500);

        // acc.balance = -100; 
        // ERROR: balance has private access
        acc.setBalance(-120);

        System.out.println(acc.getBalance());
    }
}
