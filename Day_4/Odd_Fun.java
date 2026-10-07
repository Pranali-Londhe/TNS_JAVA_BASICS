// 2. Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

class Odd_Fun {

    static void odd(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of all odd numbers from 1 to "+n+" is " + sum);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("***************Find Sum of Odd Number from 1 to n*****************");
        System.out.print("Enter Number upto you want sum: ");

        int n = input.nextInt();

        odd(n);
    }
}