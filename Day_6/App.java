class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
    void eat(){
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void bark(){
        System.out.println("Dog is barking.");
    }
}