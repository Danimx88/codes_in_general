import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class FunCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2022, Calendar.JANUARY, 1);

        LocalDate date = LocalDate.of(2022, Month.JANUARY, 1);

        //Times hour
        LocalTime time = LocalTime.of(10, 0);

        //DateTime Date
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.of(2022, 1, 1, 10, 2, 2);


        LocalDateTime lastWeek = dateTime.minusDays(7);
        String dateFormatted = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(dateFormatted);


    }
}
