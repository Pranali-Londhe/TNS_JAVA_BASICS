import java.util.function.*;
public class Fun{
    public static void main(String[]args){
        Function<String, Integer> getLength = name ->name.length();
        System.out.println(getLength.apply("Pranali"));
        System.out.println(getLength.apply("Java"));
    }
}