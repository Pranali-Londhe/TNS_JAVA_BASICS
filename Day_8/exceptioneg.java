import java.util.Scanner;

class exceptioneg{
    public static void main(String [] args){
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        if(age < 0){
            throw new IllegalArgumentException("Age cant be negattive");
        }

        System.out.println("program executed");



    }
}