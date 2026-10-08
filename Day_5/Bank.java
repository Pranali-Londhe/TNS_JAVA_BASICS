// Bank Account Management System

class BankAC {

    String Acc_Holder;
    double balance;

    BankAC(String Acc_Holder, double balance) {
        this.Acc_Holder = Acc_Holder;
        this.balance = balance;
    }

    // deposite
    void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
        System.out.println("New Balance " + balance);

    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Withdraw Successfully");
            System.out.println("Updated Balance " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayInfo() {
        System.out.println("Account Holder name: " + Acc_Holder);
        System.out.println("Current Balance: " + balance);
    }
}

public class Bank {

    public static void main(String[] args) {
        BankAC b1 = new BankAC("Pranali", 1000);
        b1.displayInfo();
        BankAC b2 = new BankAC("Sonali", 2000);
        b2.displayInfo();

    }

}
