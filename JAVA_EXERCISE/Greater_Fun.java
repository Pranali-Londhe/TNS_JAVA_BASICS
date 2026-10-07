// 3.Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
class Greater_Fun{
    static void greater(int a, int b){
        if(a>b){
            System.out.println(a+" is greater.");
        }
        else{
            System.out.println(b+ " is greater");
        }


    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        greater(a,b);


    }
   
}