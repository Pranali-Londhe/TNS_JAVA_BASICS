public class Shapee{
    public static void main(String[]args){
        Shape c = new Circle(5);
        c.setColor("Orange");
        Shape r = new  Rectangle(12,6);
        r.setColor("Blue");
        System.out.printf("%s Circle's area is %.2f%n",c.getcolor(), c.CalculateArea());
        System.out.printf("%s Rectangle's area is %.2f%n",r.getcolor(), r.CalculateArea());


    }
}