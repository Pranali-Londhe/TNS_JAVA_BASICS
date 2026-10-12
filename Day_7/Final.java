class Bank {
    final void calculateInterest() {
        System.out.println("Base Interest Calculation");
    }
}

class Branch extends Bank {
    
    void calculateInterest() {
        System.out.println("Custom Interest");
    }
}