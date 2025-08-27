package victorexercicios2.introducao;

import java.util.Scanner;

public class ContaJuros {
    public static void main(String[] args) {
        System.out.println("Selecione a opção desejada");
        System.out.println("Opção 1: CONTA POLPANÇA");
        System.out.println("Opção 2: CONTA CORRENTE");
        System.out.println("Opção 3: CONTA INVESTIMENTO");

        Scanner sc = new Scanner(System.in);

        byte op = sc.nextByte();
        switch (op) {
            case 1:
                System.out.println("Juros = 0.05%");
                break;
            case 2:
                System.out.println("Juros = 0.02%");
                break;
            case 3:
                System.out.println("Juros = 0.1%");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        sc.close();
    }
}
