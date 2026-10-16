import java.util.function.*;
public class Con_UC{
    public static void main(String[]args){
        Consumer<String> smsNotifier = Mobno -> {
            System.out.println("Sending the OTP to the ph no: "+Mobno);
        };
            smsNotifier.accept("+91 8767135572");
        
    }
}