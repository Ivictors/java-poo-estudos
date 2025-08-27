package victorexercicios2.introducao;

import java.util.Locale;
import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione no menu abaixo:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Celsius para Kelvin ");
        System.out.println("3 - Fahrenheit para Celsius");
        System.out.println("4 - Fahrenheit para Kelvin");
        System.out.println("5 - Kelvin para Celsius");
        System.out.println("6 - Kelvin para Fahrenheit");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite a temperatura atual em Celsius");

                double celsius = sc.nextDouble();
                double resultado1 = celsius * 1.8 + 32.00;

                System.out.println("Conversão de Celsius: " + celsius + " para Fahrenheit é " + resultado1);
                break;
            case 2:
                System.out.println("Digite a temperatura atual em Celsius ");

                double celsius1 = sc.nextDouble();
                double resultado2 = celsius1 + 273.15;

                System.out.println("Conversão de Celsius: " + celsius1 + " para Kelvin é " + resultado2);
                break;
            case 3:
                System.out.println("Digite a temperatura atual em Fahrenheit");

                double fahrenheit1 = sc.nextDouble();
                double resultado3 = (fahrenheit1 - 32.00) / 1.8;

                System.out.println("Conversão de Fahrenheit: " + fahrenheit1 + " para Celsius é " + resultado3);
                break;
            case 4:
                System.out.println("Digite a temperatura atual em Fahrenheit");

                double fahrenheit2 = sc.nextDouble();
                double resultado4 = (fahrenheit2 - 32.00) * 5 / 9 + 273.15;

                System.out.println("Conversão de Fahrenheit: " + fahrenheit2 + " para Kelvin é " + resultado4);
                break;
            case 5:
                System.out.println("Digite a temperatura atual em Kelvin");

                double kelvin1 = sc.nextDouble();
                double resultado5 = kelvin1 - 273.15;

                System.out.println("Conversão de Kelvin: " + kelvin1 + " para Celsius é " + resultado5);
                break;
            case 6:
                System.out.println("Digite a temperatura atual em Kelvin");

                double kelvin2 = sc.nextDouble();
                double resultado6 = (kelvin2 - 273.15) * 1.8 + 32.00;

                System.out.println("conversão de Kelvin: " + kelvin2 + " para Fahrenheit é " + resultado6);
                break;
            default:
                System.out.println("Opção invalida!");
        }
        sc.close();
    }
}

