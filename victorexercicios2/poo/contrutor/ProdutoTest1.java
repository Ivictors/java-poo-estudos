package victorexercicios2.poo.contrutor;

public class ProdutoTest1 {
    public static void main(String[] args) {
        System.out.println("-----------CARACTERISTICAS INICIAIS--------------");
       Produto produto1 = new Produto();
       produto1.exibirInfo();

        System.out.println("---------------PRIMEIRAS MUDANÇAS-----------------");
        Produto produto2 = new Produto("calça Cargo", 150.00);
        produto2.exibirInfo();

        System.out.println("---------------MODIFICAÇÕES-----------------");
        Produto produto3 = new Produto("Tenis Nike", 300.00, 10);
        produto3.exibirInfo();

        System.out.println("------------MUDANÇAS NO PRODUTOS--------------------");
        produto3.setNome("Camiseta Puma");
        produto3.setPreco(99.99);
        produto3.setQuantidade(5);
        produto3.exibirInfo();

        System.out.println("------------ MANIPULAÇÃO DE ESTOQUE: VENDA --------------------");
        produto3.removerEstoque(4);
        produto3.exibirInfo();

        System.out.println("------------ MANIPULAÇÃO DE ESTOQUE: REPOSIÇÃO --------------------");
        produto3.adicionarEstoque(50);
        produto3.exibirInfo();
    }
}
