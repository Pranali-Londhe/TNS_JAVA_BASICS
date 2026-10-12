public class Hass{
    public static void main(String[]args){
        Address home = new Address("Mumbai","Mh",400302);
        Student s = new Student("Pranali",21,home);
        s.displayProfile();
    }
}