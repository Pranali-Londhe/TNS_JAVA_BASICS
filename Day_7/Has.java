class Address{
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;

    }
    void displayAddress(){
        System.out.println(city+" ,"+state+" ,"+pincode);
    }
}
class Student{
    String name;
    int rollnumber;
    Address address;

    Student(String name, int rollnumber, Address address){
        this.name = name;
        this.rollnumber = rollnumber;
        this.address = address;
    }
    void displayProfile(){
        System.out.println("Student: "+name+"\n Roll no: "+ rollnumber);
        System.out.println("Lives at: ");
        address.displayAddress();
    }

}