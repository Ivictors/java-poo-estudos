package victorexercicios1.javacore.data_hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        LocalDate localdate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(c.getTime());
        System.out.println("-----------------------");

        System.out.println(localdate);
        System.out.println("-----------------------");

        System.out.println(localDateTime);
        System.out.println("-----------------------");

        System.out.println(localdate.getYear());

    }
}
