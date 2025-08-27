package victorexercicios1.javacore.enumeradores.dominio;

public enum TiposCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int valor;
    TiposCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
