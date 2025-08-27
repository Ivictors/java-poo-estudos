package victorexercicios2.poo.contrutor;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
        this.nome = "sem nome";
        this.preco = 0.0;
        this.quantidade = 0;
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public void setPreco(double Preco) {
        if (Preco > 0) {
            this.preco = Preco;
        } else System.out.println("Preco deve ser superior a 0");
    }

    public void setQuantidade(int Quantidade) {
        if (Quantidade > 0) {
            this.quantidade = Quantidade;
        } else System.out.println("Quantidade precisa ser superior a 0");
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        } else System.out.println("Quantidade precisa ser superior a 0");
    }

    public void removerEstoque(int qtd) {
        if (quantidade >= qtd) {
            this.quantidade -= qtd;
        } else System.out.println("Estoque insuficiente");
    }

    public void exibirInfo() {
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.quantidade);
    }
}
