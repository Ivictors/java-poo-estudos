package victorexercicios1.javacore.data_hora.revisao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesHours1 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        LocalDateTime dateHours1 = LocalDateTime.now();
        System.out.println(dateHours1);

        LocalDateTime localDateTime1 = LocalDateTime.MIN;
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        System.out.println(localDateTime2);

        Instant instant1 = Instant.now();
        System.out.println(instant1);


    }
}
