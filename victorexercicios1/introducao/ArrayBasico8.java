package victorexercicios1.introducao;

import victorexercicios1.introducao.dominio.Pessoa;

import java.util.Scanner;

public class ArrayBasico8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite abaixo a quantidade de pessoas que serão cadastradas: %n");
        int n = sc.nextInt();

       Pessoa[] pessoa = new Pessoa[n];

       for (int i = 0; i< pessoa.length; i++){
           sc.nextLine();
           System.out.printf("Digite abaixo o nome da pessoa: %d%n",i+1);
           String nome = sc.nextLine();
           System.out.printf("Digite abaixo a idade da pessoa: %d%n",i+1);
           int idade = sc.nextInt();
           System.out.printf("Digite abaixo a altura da pessoa: %d%n",i+1);
           double altura = sc.nextDouble();

           pessoa[i] = new Pessoa(nome, idade, altura);
       }
            for (Pessoa pessoas : pessoa){
                System.out.printf("Nome: %s%n", pessoas.nome);
                System.out.printf("Idade: %d%n", pessoas.idade);
                System.out.printf("Altura: %.2f", pessoas.altura);
            }


        sc.close();
    }
}
