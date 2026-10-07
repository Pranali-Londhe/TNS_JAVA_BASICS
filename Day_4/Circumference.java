// 4.Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
class Circumference{
    static float cir(float a){
        float res = 2*3.14f*a;
        System.out.printf("circumference of a circle is %.2f",res);
        return res;


    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of circle to find Circumference");
        float a = input.nextFloat();

        cir(a);

    }
}