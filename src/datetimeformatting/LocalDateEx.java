package datetimeformatting;

import java.time.*;

public class LocalDateEx {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        ZonedDateTime dateTimeInKr = ZonedDateTime.now();
        LocalDate date = LocalDate.of(2011,11,11);
        LocalTime time = LocalTime.of(23,59,59);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        ZonedDateTime zDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zDateTime);
    }
}
