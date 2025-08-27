package victorexercicios1.javacore.associacao.dominio;

public class Jogador2 {
    private String nome;
    private Time time;

    public Jogador2(String nome) {
        this.nome = nome;
    }

    public void imprimi() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
