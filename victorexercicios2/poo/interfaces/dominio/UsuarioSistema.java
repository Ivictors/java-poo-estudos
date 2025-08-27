package victorexercicios2.poo.interfaces.dominio;

public class UsuarioSistema implements Autenticavel {
    private String nome;
    private String senha;

    public UsuarioSistema(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String Senha) {
        if (this.senha.equals(Senha)){
            System.out.println("autenticado com sucesso");
            return true;
        } else System.out.println("Falha na autenticação");
        return false;
    }
}
