class BankAcc{
    String AccountHolder;

    BankAcc(String AccountHolder){
        this.AccountHolder = AccountHolder;
    }
    void displayDetails(){
        System.out.println("Account Holder: "+AccountHolder);
    }


}
class SavingAcc extends BankAcc{
    double interestrate = 0.4;
    SavingAcc(String AccountHolder){
        super(AccountHolder);
    }
    @Override
    void displayDetails(){
        System.out.println("Hello "+AccountHolder+" Your Interest Rate is "+interestrate+" %.");
    }

}