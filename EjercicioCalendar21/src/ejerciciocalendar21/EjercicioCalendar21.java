package ejerciciocalendar21;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import javafx.util.Duration;

public class EjercicioCalendar21 {

    public static void main(String[] args) {

        Clock a = Clock.systemDefaultZone();
        System.out.println(a);
        
        Duration d = Duration.hours(13);
        System.out.println(d);
        
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        
        MonthDay md = MonthDay.now();
        System.out.println(md);
        
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        OffsetTime ost = OffsetTime.now();
        System.out.println(ost);
        
        Period p = Period.of(1993, 3, 3);
        p.plusDays(4);
        
        Year y = Year.now();
        System.out.println(y);
    
        YearMonth ym = YearMonth.now();
        System.out.println(ym);
        
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt.toString());
        
        ZoneId zid = ZoneId.systemDefault();
        System.out.println(zid);
        
        ZoneOffset zos = ZoneOffset.MAX.ofHours(14);
        System.out.println(zos.getAvailableZoneIds());
        
    }
    
}
