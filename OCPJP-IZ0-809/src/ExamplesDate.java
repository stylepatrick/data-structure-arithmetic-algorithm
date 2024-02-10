import java.time.*;
import java.time.temporal.ChronoUnit;

public class ExamplesDate {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimee = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(Period.between(localDate, localDate));
        System.out.println(Duration.between(localDateTime, localDateTimee));

        System.out.println(ChronoUnit.DAYS.between(localDateTimee, localTime));

    }

}
