import java.time.LocalDate;

public class AllDates {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate yesterday = now.minusDays(1);
        System.out.println("Yesterday was "+yesterday);
        LocalDate pastdate = now.minusMonths(100);
        System.out.println("100 Months before was "+ pastdate);

    }
}