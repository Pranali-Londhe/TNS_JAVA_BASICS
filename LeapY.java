import java.util.Scanner;
public class LeapY{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println("This is Leap Year");
        }
        else{
            System.out.println("This is Not Leap Year");
        }
        
        }
        }
    