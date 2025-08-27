package victorexercicios1.javacore.enumeradores.dominio;

public class Cliente {
    private String nome;
    private TiposCliente tiposCliente;

    public Cliente(String nome, TiposCliente tiposCliente) {
        this.nome = nome;
        this.tiposCliente = tiposCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tiposCliente=" + tiposCliente +
                ", tiposCliente=" + tiposCliente.getValor() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TiposCliente getTiposCliente() {
        return tiposCliente;
    }

    public void setTiposCliente(TiposCliente tiposCliente) {
        this.tiposCliente = tiposCliente;
    }
}
