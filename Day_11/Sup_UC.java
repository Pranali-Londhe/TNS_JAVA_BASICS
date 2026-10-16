import java.util.function.*;
import java.util.*;
public class Sup_UC{
    public static void main(String[]args){
        Supplier<String> otpGen = () ->{
            Random random = new Random();
            int number = 10000 + random.nextInt(900000);
            return String.valueOf(number);
        };
        String userotp = otpGen.get();
        System.out.println("The OTP is: "+ userotp);
    }
}