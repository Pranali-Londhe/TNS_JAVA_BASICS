// 8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥𝑛.
import java.util.*;
class Power{
    static int pow(int x,int n){
         int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;

    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = input.nextInt();
        System.out.print("Enter the Power: ");
        int n = input.nextInt();
        int result = pow(x,n);
        System.out.println("Answer = " + result);


    }
}