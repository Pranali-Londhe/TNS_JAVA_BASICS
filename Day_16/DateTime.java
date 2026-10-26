//Fintech
//Banking
//Multi region and Saas Applications
//SpringBoot and Hibernet  / JPA Entities
//FLight Tickets
//Distrinuted

import java.time.LocalDate;
import java.time.Month;
class DateTime{
    public static void main(String[]args){
        LocalDate now = LocalDate.now();
        System.out.println("Today's date is "+now);

        int DayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();

        System.out.println("Day of Month "+ DayOfMonth);
        System.out.println("Month "+month);
        System.out.println("Year "+year);

    }
}