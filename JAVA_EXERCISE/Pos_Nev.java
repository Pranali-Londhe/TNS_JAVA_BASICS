import java.util.*;

class Pos_Nev {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num > 0) {
                positive++;
            }
            else if (num < 0) {
                negative++;
            }
            else {
                zero++;
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nPositive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}