// @FunctionalInterface
// interface Greeter{
//     void greet(String name);

// }
// public class Lambda{
//     public static void main(String[]args){
//         Greeter g = name -> System.out.println("Hello "+name);
//         g.greet("Pranali");
//     }
// }

@FunctionalInterface
interface Greeter{
    void greet(String name);

}
public class Lambda{
    public static void main(String[]args){
        Greeter g = name ->{ System.out.println("Hello "+name);
        System.out.println("Welcome");};
        g.greet("Pranali");
    }
}