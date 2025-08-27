package victorexercicios1.javacore.data_hora;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,54,23);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());

    }
}
