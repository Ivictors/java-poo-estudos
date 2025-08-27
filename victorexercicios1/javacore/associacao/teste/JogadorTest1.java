package victorexercicios1.javacore.associacao.teste;

import victorexercicios1.javacore.associacao.dominio.Jogador;

public class JogadorTest1 {
    public static void main(String[] args) {
        Jogador vr1 = new Jogador("Pele");
        Jogador vr2 = new Jogador("Ronaldo");
        Jogador vr3 = new Jogador("Neymar");

        Jogador [] vr4 = {vr1, vr2, vr3};

        for (Jogador jogador : vr4){
            jogador.imprimi();
        }
    }
}
