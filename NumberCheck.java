import java.util.Scanner;
public class NumberCheck{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nWelcome to Number Check System\n\n");
        System.out.print("Please enter your number here: ");
        int num=input.nextInt();
        if (num>0){
            System.out.println("This is Positive Number");
        }else if(num==0){
            System.out.println("This is Zero");
        }else{
            System.out.println("This is Negative Number");
        }
    }
}