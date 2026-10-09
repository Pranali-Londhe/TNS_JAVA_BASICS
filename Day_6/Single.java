// Single Inheritance
class Animal{
    void eat(){
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks: woof woof");
    }
}

public class Single{
    public static void main(String[]args){
        Dog dg = new Dog();
        dg.eat();
        dg.bark();

    }
}