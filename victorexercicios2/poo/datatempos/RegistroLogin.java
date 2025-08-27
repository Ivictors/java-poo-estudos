package victorexercicios2.poo.datatempos;

import java.time.Duration;
import java.time.Instant;

public class RegistroLogin {
    public static void main(String[] args) {
        Instant momentoLogin = Instant.now();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            Instant momentoLogout = Instant.now();
            System.out.println("Diferença do login " + momentoLogin + " para o logout. " + momentoLogout);
            System.out.println(Duration.between(momentoLogin, momentoLogout));
        }
    }
}
