package victorexercicios2.poo.heranca.teste;

import victorexercicios2.poo.heranca.dominio.Desenvolvedor;
import victorexercicios2.poo.heranca.dominio.Funcionario;
import victorexercicios2.poo.heranca.dominio.Gerente;

public class herancatest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Victor01", 2100.00);
        Gerente gerente = new Gerente("Victor02", 3000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("victor3", 2500.00);

        funcionario.imprimi();
        gerente.imprimi();
        desenvolvedor.imprimi();

    }
}
