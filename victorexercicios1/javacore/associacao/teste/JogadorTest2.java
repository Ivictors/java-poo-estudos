package victorexercicios1.javacore.associacao.teste;

import victorexercicios1.javacore.associacao.dominio.Jogador2;
import victorexercicios1.javacore.associacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador2 jogador = new Jogador2("Calleri");
        Time time = new Time("São Paulo");

        jogador.setTime(time);

        jogador.imprimi();
    }
}
