package victorexercicios2.introducao;

import java.util.Locale;
import java.util.Scanner;

public class TreinamentoBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double saldo = 1000.00;

        System.out.println("Selecione uma opção abaixo");
        System.out.println("1- Saque ");
        System.out.println("2- Deposito");
        System.out.println("3- Saldo");
        System.out.println("4- Sair");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do saque:");
                double saque = sc.nextDouble();
                if (saldo >= saque) {
                    saldo -= saque;
                    System.out.println("Operação realizada com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;

            case 2:
                System.out.println("Digite o valor do deposito");
                double deposito = sc.nextDouble();
                if (deposito >= 0) {
                    saldo += deposito;
                    System.out.println("Operação realizada com sucesso.");
                } else {
                    System.out.println("Valor deposito invalido.");
                }
                break;

            case 3:
                System.out.printf("Seu saldo é: R$%.02f%n" + saldo);
                break;

            case 4:
                System.out.println("Obrigado!");
                break;

            default:
                System.out.println("Opção invalida");
        }
        sc.close();
    }
}
