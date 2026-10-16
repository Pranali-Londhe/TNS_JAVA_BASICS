import java.util.function.*;
public class Sup{
    public static void main(String[]args){
        Supplier<String> message = () -> "Welcome to the world";
        System.out.println(message.get());
    }
}