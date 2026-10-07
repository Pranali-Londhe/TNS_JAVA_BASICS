// 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
class Vote{
    static void age(int a){
        if(a>=18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }

    }
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("*******Check Wheather you are eligble for vote or not***********");
        System.out.print("Enter your age please: ");
        int a = input.nextInt();

        age(a);

    }
}