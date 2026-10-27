/*
 - LocalDate
 - LocalTime
 - LocalDateTime
 - ZonedDateTime
 - DateTimeFormatter
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Localdatetime{

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime custome = LocalDateTime.parse("2026-10-26T11:36");
        System.out.println(custome);
    }
}