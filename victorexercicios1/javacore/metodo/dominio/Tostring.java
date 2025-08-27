package victorexercicios1.javacore.metodo.dominio;

public class Tostring {
    private String nome;

    @Override
    public String toString() {
        return "Tostring{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
