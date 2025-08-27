package victorexercicios2.poo.datatempos;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Nascimento {
    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(1999, Month.SEPTEMBER, 18);
        LocalDate now = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(nascimento, now));
        System.out.println(ChronoUnit.MONTHS.between(nascimento, now));
        System.out.println(ChronoUnit.WEEKS.between(nascimento, now));
        System.out.println(ChronoUnit.DAYS.between(nascimento, now));


    }
}
