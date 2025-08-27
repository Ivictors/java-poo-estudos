package victorexercicios1.javacore.data_hora;

import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;

public class ChronOUnitTest {
    public static void main(String[] args) {

        LocalDateTime nascimento = LocalDateTime.of(2018, Month.JANUARY,2,11,30,0);
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(nascimento, agora));
        System.out.println(ChronoUnit.WEEKS.between(nascimento, agora));
        System.out.println(ChronoUnit.MONTHS.between(nascimento, agora));
        System.out.println(ChronoUnit.YEARS.between(nascimento, agora));

    }
}
