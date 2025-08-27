package victorexercicios1.introducao;

import victorexercicios1.introducao.dominio.Produto;

import java.util.Scanner;

public class ArrayBasico6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Entre com a quantidade de produtos que terão sua média calculada: %n");
        int n = sc.nextInt();

        Produto[] produtos = new Produto[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Digite o nome do produto %d : %n", i+1);
            String nome = sc.nextLine();
            System.out.printf("Digite o valor do produto %d %n", i+1);
            double valor = sc.nextDouble();

            produtos[i] =  new Produto(nome,valor);
        }
        double soma = 0.0;
        for (Produto products : produtos){
            System.out.println(products.getNome() + " = " + products.getValor());
            soma += products.getValor();
        }
        double media = soma / produtos.length;
        System.out.printf("Media dos valores dos produtos: %.2f %n", media);

        sc.close();
    }
}
