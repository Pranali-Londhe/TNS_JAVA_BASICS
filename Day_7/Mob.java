class Battery{
    int capacity;
    Battery(int capacity){
        this.capacity = capacity;
    }
    void bat(){
        System.out.println("And having capacity "+capacity);
    }
}
class Camera{
    int pix;
    Camera(int pix){
        this.pix = pix;
    }
    void takepic(){
        System.out.println("Photo with "+pix +" pixel.");
    }
}
class Phone{
    String brand;
    Battery battery;
    Camera camera;
    Phone(String brand,Battery battery,Camera camera){
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }
    void snapPic(){
        System.out.println("["+brand+"]"+" is active");
        camera.takepic();
        battery.bat();
    }
}
