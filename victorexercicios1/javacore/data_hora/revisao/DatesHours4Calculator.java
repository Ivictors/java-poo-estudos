package victorexercicios1.javacore.data_hora.revisao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DatesHours4Calculator {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().minusDays(7);
        LocalDate date3 = LocalDate.now().plusDays(7);
        LocalDate date4 = LocalDate.now().plusWeeks(8);

        Instant instant1 = Instant.parse("2025-07-15T13:42:28z");
        Instant instant2 = instant1.minus(7, ChronoUnit.DAYS);
        Instant instant3 = instant1.plus(7, ChronoUnit.DAYS);

        Period period1 = Period.between(date1,date3);

        Duration duration1 = Duration.between(instant2,instant3);


        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);

        System.out.println(instant2);
        System.out.println(instant3);

        System.out.println(period1.getDays());
        System.out.println(duration1.toDays());
    }
}
