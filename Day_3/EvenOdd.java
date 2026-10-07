import java.util.Scanner;
public class EvenOdd{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nWelcome to Even Odd Checker\n\n");
        System.out.println("Enter your number");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("This is An Even Number");
        }else{
            System.out.println("This is An Odd Number");
        }

    }
}