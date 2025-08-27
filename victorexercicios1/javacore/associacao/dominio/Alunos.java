package victorexercicios1.javacore.associacao.dominio;

public class Alunos {
    private String nome;
    private int idade ;
    private Seminario seminario;

    public Alunos(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
