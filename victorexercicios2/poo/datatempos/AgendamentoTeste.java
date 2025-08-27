package victorexercicios2.poo.datatempos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgendamentoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();

        LocalDateTime dataConsulta = LocalDateTime.of(2025, Month.SEPTEMBER, 14, 13, 30);
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(nome + " aguarde " + ChronoUnit.DAYS.between(agora, dataConsulta) + " dias para sua consulta.");
        System.out.println(nome + " aguarde " + ChronoUnit.HOURS.between(agora, dataConsulta) + " horas para sua consulta.");

        input.close();
    }
}
