package victorexercicios1.introducao.dominio;

public class Registro {
    String nome;
    String email;

    public Registro(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }
}
