class Animal{
    void eat(){
        System.out.println("Animals are eating.");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
        super.eat();
    }
}