package victorexercicios1.javacore.classes.teste;



import victorexercicios1.javacore.classes.dominio.ConversorMonetario;

import java.util.Scanner;

public class CompraMoedasTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("------------- Balcão de compras -------------");
        System.out.println("1- Dollar");
        System.out.println("2- Euro");

        int op = sc.nextInt();

        System.out.println("Digite o valor que deseja adquirir: ");
        double valor = sc.nextDouble();

        System.out.print("Valor que você deve pagar R$:");

        switch (op) {
            case 1:
                ConversorMonetario dollar = new ConversorMonetario();
                System.out.println(dollar.conversorDollar(valor));
                break;
            case 2:
                ConversorMonetario euro = new ConversorMonetario();
                System.out.println(euro.conversorEuro(valor));
                break;
            default:
                System.out.println("Erro! Tente novamente mais tarde.");

        }

        sc.close();
    }
}
