package victorexercicios1.javacore.excecoes;

public class PagamentoInvalidoException extends Exception {
    public PagamentoInvalidoException(String message) {
        super(message);
    }
    public PagamentoInvalidoException() {
        super();
    }
}
