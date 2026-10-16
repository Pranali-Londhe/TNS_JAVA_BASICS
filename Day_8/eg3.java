
class eg3 {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawal = 4000;

        try {
            if (withdrawal > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }

            balance -= withdrawal;

            System.out.println("Withdrawal was completed");
            System.out.println("Remaining balance: " + balance);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}
