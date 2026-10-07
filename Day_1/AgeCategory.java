import java.util.Scanner;
public class AgeCategory{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO CHECK AGE CATEGORY");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age>=60){
            System.out.println("Senior");
        }else if(age>=20 ){
            System.out.println("Adult");
        }else if(age>=13){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
    }
}