import java.util.*;
class Area_Calculator{
    public static void main(String[]args){
        System.out.println("********** WELCOME TO AREA FINDER CALCULATOR***********");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kindly press the number to find the area:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch(choice){
            
            case 1:
                System.out.println("You selected Triangle");

                System.out.print("Enter base: ");
                float base = input.nextFloat();

                System.out.print("Enter height: ");
                float height = input.nextFloat();

                float triangleArea = 0.5f * base * height;

                System.out.println("Area of Triangle = " + triangleArea);
                break;
            case 2:
                System.out.println("You selected Square");
                System.out.print("Enter side: ");
                float side = input.nextFloat();

                float squareArea = side * side;

                System.out.println("Area of Square = " + squareArea);
                break;
            case 3:
                System.out.println("press 3 to calculate area of rectangle");
                System.out.println("You selected Rectangle");
                System.out.print("Enter Length: ");
                float len = input.nextFloat();
                System.out.print("Enter breadth: ");
                float breadth = input.nextFloat();

                float recArea = len *  breadth;

                System.out.println("Area of Rectangle = " + recArea);
                
                break;
            default:
                System.out.println("Invalid Choice");
                
            }

    }
}