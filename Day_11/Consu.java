import java.util.function.*;
public class Consu{
    public static void main(String[]args){
        Consumer<String> pr = message -> System.out.println(message);
        pr.accept("Hey I Love BadMinton");
    }
}