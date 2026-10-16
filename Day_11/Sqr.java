import java.util.function.*;
public class Sqr{
    public static void main(String[]args){
        Function<Integer,Integer> square = num ->num*num;
        System.out.println(square.apply(5));
     
    }
}