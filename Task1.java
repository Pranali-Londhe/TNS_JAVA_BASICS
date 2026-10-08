class CoffeeWallet{
    String name;
    double balance;

    CoffeeWallet(String name, double balance) {
        this.name = name;
        this.balance = balance;
    
    }
    void addFund(double amount){
        balance = balance+amount;

    }
    void purchase(double amount){
        if(balance>=amount){
            balance -= amount;
            System.out.println("Purchase SuccessFull");
            System.out.println("The remaining balance is "+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void display(){
        System.out.println("Hiii "+name+" your account balance is "+balance);
    }
    
}


public class Task1{
    public static void main(String[]args){
        CoffeeWallet co = new CoffeeWallet("Pranali",500);
        co.addFund(20);
        co.purchase(12);
        co.display();
        
    }
}