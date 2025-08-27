package victorexercicios1.javacore.polimorfismo.dominio;

public class Computador extends Produto {
    protected final double impostoComputador = 0.05;

    @Override
    public double impostoProduto() {
        return impostoComputador * valor;
    }

    public Computador(String nome, double valor) {
        super(nome, valor);
    }
}
