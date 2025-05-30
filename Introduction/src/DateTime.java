package src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args){
       /* LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant); */

        // custom formatting

//        LocalDateTime dateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String newDateTime = dateTime.format(formatter);
//        System.out.println(newDateTime);

        LocalDate date = LocalDate.of(2024, 12, 25);
        System.out.println(date);

        LocalDateTime date1 = LocalDateTime.of(2011, 11, 11, 11, 11, 11);
        LocalDateTime date2 = LocalDateTime.of(2012, 12, 12, 12, 12, 12);

        System.out.println(date1.isBefore(date2));
        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isEqual(date2));
    }
}
