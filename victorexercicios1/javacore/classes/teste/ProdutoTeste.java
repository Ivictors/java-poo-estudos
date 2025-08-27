package victorexercicios1.javacore.classes.teste;



import victorexercicios1.javacore.classes.dominio.Produto;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double preco = sc.nextDouble();
        int quantidade = sc.nextInt();

        Produto produto1 = new Produto(nome, preco, quantidade);

        System.out.println(produto1);

        produto1.addProdutos(5);
        System.out.println(produto1);

        produto1.removeProdutos(3);
        System.out.println(produto1);

        sc.close();
    }
}
