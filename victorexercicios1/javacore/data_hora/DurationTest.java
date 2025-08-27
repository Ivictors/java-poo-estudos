package victorexercicios1.javacore.data_hora;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime lct1 = LocalDateTime.now().plusYears(2);
        LocalDateTime lct2 = LocalDateTime.now().plusYears(2).plusMinutes(4);
        System.out.println(now);
        System.out.println(lct1);
        System.out.println(lct2);
        Duration d1 = Duration.between(now, lct2);
        System.out.println(d1);
    }
}
