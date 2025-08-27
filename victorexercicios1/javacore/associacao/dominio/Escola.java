package victorexercicios1.javacore.associacao.dominio;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }
    public void imprimi (){
        System.out.println(this.nome);
        if ( professores == null) return;
        for (Professor professores : professores){
            System.out.println(professores.getNome());
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
