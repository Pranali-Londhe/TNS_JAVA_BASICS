class Device{
    String Brand;
    double Price;
    void powerOn(){
        System.out.println(Brand + " device is now turned on.");
    }
}
class smartPhone extends Device{
    double storageCapacity;
    void takephoto(){
        System.out.println("Photo captured using the " + Brand + " smartphone!");
    }
}
public class Inheritance{
    public static void main(String[]args){
        smartPhone sp = new smartPhone();
        sp.Brand = "Samsung";
        sp.Price = 1600.67;
        sp.storageCapacity = 128;
        sp.powerOn();
        sp.takephoto();

        System.out.println("Price: $" + sp.Price);
        System.out.println("Storage: " + sp.storageCapacity + " GB");

    }
}