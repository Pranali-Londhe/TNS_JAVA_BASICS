class Student{
    String name;
    static String clgnm = "IIT Bombay";

    Student(String name){
        this.name= name;
    }
    void stucol(){
        System.out.println(name+" is studying in "+clgnm);
    }

}