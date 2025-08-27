package victorexercicios1.javacore.classes.dominio;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double totalValorEstoque() {
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome
                + ", $"
                + String.format("%.2f", preco)
                +", quantidade no estoque: "
                + quantidade
                + " Valor do estoque: $"
                + String.format("%.2f",totalValorEstoque());
    }

    //    public String getNome() {
//        return nome;
//    }

}
