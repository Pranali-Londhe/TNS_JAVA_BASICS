class Employee{
    double salary = 30000;
}
class Manager extends Employee{
    double salary = 60000;
    void displaySalary(){
    System.out.println("Manager's Salary is "+salary);
    System.out.println("Employee's Salary is "+ super.salary);
}
}