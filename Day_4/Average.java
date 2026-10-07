// 1.Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
class Average{
    static void average(int a,int b,int c){
            int avg = (a+b+c)/3;
            System.out.println("Your Average is "+ avg);

        }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Check Your Average from here...");
        System.out.println("Enter First Number: ");
        int a = input.nextInt();
        System.out.println("Enter Second Number: ");
        int b = input.nextInt();
        System.out.println("Enter third Number: ");
        int c = input.nextInt();

        average(a, b, c);

       

    }
     
}