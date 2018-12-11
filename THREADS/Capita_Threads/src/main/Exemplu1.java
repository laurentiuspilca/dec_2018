package main;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Exemplu1 {

    /*
    LocalTime, LocalDate, LocalDateTime, Duration, Period
    ZonedDateTime, Instant,

     */
    public static void main(String[] args) {
        for (String id : ZoneId.getAvailableZoneIds()) {
          System.out.println(id);
        }

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(zdt);
        long tst = zdt.toInstant().toEpochMilli();
        System.out.println(tst + " " + System.currentTimeMillis());
        System.out.println(new Date(System.currentTimeMillis()));

        ZonedDateTime res = zdt.plusDays(10);
        zdt.withHour(2);
    }
}
