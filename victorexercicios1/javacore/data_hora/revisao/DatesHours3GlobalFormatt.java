package victorexercicios1.javacore.data_hora.revisao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DatesHours3GlobalFormatt {
    public static void main(String[] args) {

        Instant instant1 = Instant.parse("2025-07-15T13:42:28z");

        LocalDate localDate1 = LocalDate.ofInstant(instant1, ZoneId.of("Portugal")); // 2025-07-15T13:42:28.168984400
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.of("Portugal"));

        System.out.println(localDate1);
        System.out.println(localDateTime1);


    }
}
