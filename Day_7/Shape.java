abstract class Shape{
    private String color;

    void setColor(String color){
        this.color = color;
    }
    String getcolor(){
        return color;
    }
    abstract double CalculateArea();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

        @Override
        double CalculateArea(){
            return (3.14) * radius * radius;
        }

}
class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double CalculateArea(){
        return length * breadth;
    }
}
