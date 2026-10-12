public class Mobb{
    public static void main(String[]args){
        
        Camera c = new Camera(145);
        Battery b = new Battery(50);
        Phone p = new Phone("SamSung",b,c);
        p.snapPic();
    }
}