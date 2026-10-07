import java.util.Scanner;
public class FC{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Temperature in F: ");
        float fah = input.nextFloat();
        float cel = (fah - 32) * 5/9;
         System.out.println("Your Temperature is "+cel+" C");

    }}