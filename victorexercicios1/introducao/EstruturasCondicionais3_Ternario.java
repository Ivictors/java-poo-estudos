package victorexercicios1.introducao;

import java.util.Scanner;

public class EstruturasCondicionais3_Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salario:");
        double salario = sc.nextDouble();

        String resultado = salario <= 1800 ? "Salario minimo" : "Acima do salario minimo";
        System.out.println(resultado);

        sc.close();
    }
}
