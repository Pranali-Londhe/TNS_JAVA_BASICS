import java.util.Scanner;
public class LeftShift{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of LeftShift Operator");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        int res = num<<1;
        System.out.println("your result is "+res);




    }
}