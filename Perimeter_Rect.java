import java.util.Scanner;
public class Perimeter_Rect{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Find Perimeter of Rectangle ABCD\n\n");
        System.out.println("Enter Value of A: ");
        double a = input.nextDouble();
        System.out.println("Enter Value of B: ");
        double b = input.nextDouble();
        System.out.println("Enter Value of C: ");
        double c = input.nextDouble();
        System.out.println("Enter Value of D: ");
        double d = input.nextDouble();

        double perimeter = a + b + c + d;
        System.out.print("Perimeter of Rectangle is =" + perimeter);





    }
}