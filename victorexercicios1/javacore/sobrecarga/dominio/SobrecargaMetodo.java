package victorexercicios1.javacore.sobrecarga.dominio;

public class SobrecargaMetodo {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;



    public void init(String nome, String tipo, String genero, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}

