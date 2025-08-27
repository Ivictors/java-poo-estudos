package victorexercicios1.javacore.polimorfismo.teste;

import victorexercicios1.javacore.polimorfismo.dominio.Computador;
import victorexercicios1.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest1 {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Asus MD15", 10_000);
        CalculadoraImposto.calcularImpostoComputador(computador1);
    }
}
