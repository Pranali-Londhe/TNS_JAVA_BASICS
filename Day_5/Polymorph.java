
// class Calculator {
//     int add(int a,int b){
//         return a+b;
//     }
//     int add(int a, int b,int c){
//         return a+b+c;
//     }
//     double add(double a, double b){
//         return a-b;
//     }

// }

class Animal{
    void makesound(){
        System.out.println("Animal makes a sound.");
    }
}
class dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Dog Barks: woof woof");
    }
}
class cat extends Animal{
    @Override
    void makesound(){
    System.out.println("Cat Meows: Meow Meow");
}
}


public class Polymorph {

    public static void main(String[] args) {
        Animal a = new dog();
        a.makesound();
        Animal b = new cat();
        b.makesound();

    }
}
