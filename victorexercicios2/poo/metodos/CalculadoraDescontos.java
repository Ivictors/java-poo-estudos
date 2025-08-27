package victorexercicios2.poo.metodos;

import java.util.Scanner;

public class CalculadoraDescontos {
    public static void main(String[] args) {
        CalcularDesconto calcularDesconto = new CalcularDesconto();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do produto:");
        double valorOriginal = sc.nextDouble();
        System.out.println("Insira o percentual de desconto: ");
        double percentualDesconto= sc.nextDouble();

        sc.close();
        calcularDesconto.CalcularDesconto1(valorOriginal,percentualDesconto);
    }
}
