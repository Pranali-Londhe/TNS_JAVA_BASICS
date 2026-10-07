import java.util.Scanner;
public class AddTwoNumbers{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first number: ");
        int a=input.nextInt();
        System.out.print("Please enter second number: ");
        int b =input.nextInt();
        int sum = a+b;
        System.out.println("Sum of your numbers is "+ sum);
    }
}