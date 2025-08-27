package victorexercicios1.javacore.data_hora;

import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getNano());
        System.out.println(now.getEpochSecond());

    }

}
