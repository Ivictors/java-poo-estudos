package victorexercicios2.poo.enumeradores.domain;

public class Usuario {
    protected String nome;
    protected NivelAcesso nivelAcesso;

    public Usuario(String nome, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }
    public void imprimi(){
        System.out.println(nome+" nivel de acesso "+ nivelAcesso);
    }
}
