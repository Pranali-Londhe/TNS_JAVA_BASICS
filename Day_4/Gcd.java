import java.util.*;

class Gcd {

    static int findGCD(int a, int b) {

        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int result = findGCD(a, b);

        System.out.println("GCD = " + result);
    }
}