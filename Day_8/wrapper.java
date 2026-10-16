public class wrapper{
    public static void main(String[] args) {

        String input = "10,25,40,15,60";
        String[] parts = input.split(",");

        int total = 0;

        for (String part : parts) {
            int num = Integer.parseInt(part);

            if (num % 2 == 0) {
                total += num;
            }
        }

        System.out.println("Sum of even numbers: " + total);
    }
}


