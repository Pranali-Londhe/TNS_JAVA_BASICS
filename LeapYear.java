import java.util.Scanner;
public class LeapYear{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nWELCOME TO LEAP YEAR CHECKER PORTAL\n\n");
        System.out.println("Enter your year here:");
        int year = input.nextInt();
        if (year%400==0 || year%4==0){
            System.out.println("This is Leap Year");

        }else if(year%4==0 && year%100!=0){
            System.out.println("This is Not Leap Year");
        }else{
            System.out.println("Invalid Input");
        }

    }
}