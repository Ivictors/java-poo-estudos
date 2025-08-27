package victorexercicios2.introducao;

import java.util.Scanner;

public class MultiploDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu saldo:");
        int saldo = sc.nextInt();

        if (saldo <= 50 ) {
            System.out.println("Impossivel realizar transação.");
        } else {
            System.out.println("1- saque \n2- sair");
            int op = sc.nextInt();

            while (op == 1) {
                System.out.println("quanto deseja sacar?");
                int valorsaque = sc.nextInt();

                if (valorsaque > saldo) {
                    System.out.println("Saldo insuficiente");
                    op = 2;
                } else if (valorsaque % 10 == 0) {
                    saldo -= valorsaque;

                    System.out.println("operação realizada com sucesso");
                    System.out.println("você recebeu " + valorsaque / 10 + " nota(s) de R$10" + " somando um total de " + valorsaque + " reais");
                    System.out.println("Saldo disponivel " + saldo);
                } else {
                    System.out.println("Cedulas indisponiveis");
                }
                op = 2;
            }
        }
        sc.close();
    }
}
