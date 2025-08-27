package victorexercicios2.poo.datatempos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class ProximaData {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();

        System.out.println(data.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
        System.out.println(data.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(data.with(TemporalAdjusters.firstDayOfNextMonth()));


    }
}
