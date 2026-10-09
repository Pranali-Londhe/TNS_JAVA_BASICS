class Shape{
    String color = "blue";

}
class Circle extends Shape{
    void drawcircle(){
    System.out.println("Drawing a "+color+" circle.");

    }
}
class Rectangle extends Shape{
    void drawrect(){
    System.out.println("Drawing a "+color+" rectangle.");
    }
}
public class Hierarchy{
    public static void main(String[]args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.drawcircle();
        r.drawrect();
        

    }
}