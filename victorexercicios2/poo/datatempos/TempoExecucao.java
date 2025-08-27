package victorexercicios2.poo.datatempos;

import java.time.Duration;
import java.time.LocalTime;

public class TempoExecucao {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finalizando ...");
        }

        LocalTime time2 = LocalTime.now();

        System.out.println("Duração das tarefas " + Duration.between(time1, time2));
    }
}
