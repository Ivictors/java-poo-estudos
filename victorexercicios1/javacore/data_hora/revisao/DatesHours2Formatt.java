package victorexercicios1.javacore.data_hora.revisao;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesHours2Formatt {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // 2025-07-15T13:42:28.168984400

        LocalDate date1 = LocalDate.parse("05/05/2100",dateTimeFormatter1);
        System.out.println(date1.format(dateTimeFormatter1));

        LocalTime time1 = LocalTime.parse("13:42");
        System.out.println(time1.format(dateTimeFormatter2));

        LocalDateTime dateHours1 = LocalDateTime.parse("2025-07-15T13:42");
        System.out.println(dateHours1.format(dateTimeFormatter3));

        Instant instant1 = Instant.parse("2025-07-15T13:42:28z");
        System.out.println(dateTimeFormatter4.format(instant1));




    }
}
