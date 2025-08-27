package victorexercicios2.poo.treinotopicos.dominio;

public interface Transacionavel {
    void depositar(double valor);
    void sacar(double valor);
    double consultarSaldo();
}
