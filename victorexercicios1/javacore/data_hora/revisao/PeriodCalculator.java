package victorexercicios1.javacore.data_hora.revisao;

import java.time.LocalDate;
import java.time.Period;

public class PeriodCalculator {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(1998, 5, 5);
        LocalDate date2 = LocalDate.of(1999, 11, 18);

        Period period1 = Period.between(date1, date2);
        Period period2 = Period.between(date1, date);

        System.out.println("Year: " + period1.getYears());
        System.out.println("Month: " + period1.getMonths());
        System.out.println("Day: " + period1.getDays());
        System.out.println(period1);

        System.out.println("Age: " + period2.getYears());


    }
}
