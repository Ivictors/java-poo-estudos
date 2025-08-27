package victorexercicios1.javacore.associacao.teste;

import victorexercicios1.javacore.associacao.dominio.Escola;
import victorexercicios1.javacore.associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Saturobi");
        Professor professor2 = new Professor("Kakashi");

        Professor [] professores = {professor1, professor2};

        Escola escola = new Escola("Konoha", professores);

        escola.imprimi();
    }
}
