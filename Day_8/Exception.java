/* class Exception{
    public static void main(String[]args){
        int a = 10;
        int b = 0;
        try{
            int rest = a / b;
            System.out.println(rest);
        }
        catch(ArithmeticException e){
            System.out.println("you cant divide by 0");
        }
    }

}
*/

class Exception{
    public static void main(String[]args){
try{
    int res = 10/0;
    System.out.println(res);
    int[] numbers = {10,20,30};
    System.out.println(numbers[5]);
}
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Invalid array index");

}
catch(ArithmeticException e){
    System.out.println("you cant divide by 0");
}
finally{
    System.out.println("everything is blocked");
}
    }
}