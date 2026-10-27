
import java.time.*;
import java.util.Scanner;

public class TaskZone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Zone Time (e.g. Asia/Kolkata): ");
        String zoneinput = sc.nextLine();

        try {
            ZoneId zone = ZoneId.of(zoneinput);

            System.out.println("Time zone: " + zone);

            ZonedDateTime time = ZonedDateTime.now(zone);

            System.out.println("Current date and time: " + time);
            System.out.println("Current time is: " + time.toLocalTime());

        } catch (DateTimeException e) {
            System.out.println("Invalid time zone! Please enter a valid time zone.");
        }

        sc.close();
    }
}
