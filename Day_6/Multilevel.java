class Device{
    void powerOn(){
        System.out.println("Powering On......");
    }

}
class DabbaPhone extends Device{
    void MakeCall(){
        System.out.println("This dabbaphone is trying to call.");
    }

}
class SmartPhone extends DabbaPhone{
    void OpenBrwoser(){
        System.out.println("Browser is opened.");
    }

}
public class Multilevel{
    public static void main(String[]args){
        SmartPhone sp = new SmartPhone();
        
        sp.OpenBrwoser();
        sp.MakeCall();
        sp.powerOn();


    }
}